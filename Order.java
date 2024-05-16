/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cafesystem;

import java.util.*;
/**
 *
 * 
 */

public class Order {
    
    // Order fild of type ArrayList of Proudect that stores object of type DRINK and DESSERT classes.
    private ArrayList<Product> products;
    
    // a defult constructer that creats object of type Menu and initilalize Array list of type Proudect
    public Order (){
        this.products= new ArrayList<Product>();
    }
    
     // a void mehtod takes Product object as a parametar and add it to the Arraylist of the object that invokes this method.
    public void addPro(Product pro){
        this.products.add(pro);
    }
    
    /**setter method takes Order object and Menu object as a parameters
     * and return nothing
     * it asks the user to enter product number to add it to Order object's ArrayList.
     */
    public void setOrder(Order ord, Menu menu){
        
        Scanner input = new Scanner (System.in);
        int i; //do while condition
        do {
        System.out.println("Enter the product number to add it to your order ");
        
        int n=1;  
        boolean flag =true;
        do {
        //handle InputMismatchException    
        try {
          n=input.nextInt();  
          System.out.println("");
          flag=false;
        }
        catch (InputMismatchException e){
            System.out.println("You entered the number incorrectly, Please enter it again:");
            input.next();
      
        }
        }
        while (flag);
        
        boolean flag2 =true;
        Product p = null;
        
        do{
        //handle IndexOutOfBoundsException    
        try{
         /** object  menu call getMenu to use ArrayList and 
         *use get builtin-method to take the index and return the element with the same index form menu's ArrayList **/
           p = ((menu.getMenu()).get(n-1)); 
           flag2=false;
        }
        catch (IndexOutOfBoundsException e){
            System.out.println("You entered a number doesn't exist in the menu, Please enter it again:");
            n=input.nextInt();
        }
        }
        while (flag2);
        
        //if statements check if p instance of drink and call methods for drink.
        if (p instanceof Drink){
            p=new Drink((Drink)(p));
            ((Drink) p).hotOrIce(); // uses down casting to convert superclass refrence to subclass refrence.
            ((Drink) p).setSize();
            ((Drink) p).sizePrice(((Drink) p).getSize());
            
        }
        //if it's not instance of drink, it will be instance of dessert and call the methods for dessert.
        else {
            p=new Dessert((Dessert)(p));
           ((Dessert) p).sideSause();
        }
        ord.addPro(p);
        
        System.out.println("If you want to order something else enter 1, Otherwise enter 0 ");
        i =1;
        System.out.println("");
        boolean flag3 =true;
        do {
        //handle InputMismatchException
        try {
          i=input.nextInt();  
          System.out.println("");
          if(i==0||i==1){
            flag3=false;
          }
          else {
              System.out.println("You entered a wrong number please enter it again, If you want to order something else enter 1, Otherwise enter 0 ");
           
          }
        }
        catch (InputMismatchException e){
            System.out.println("You entered the number incorrectly, Please enter it again:");
            input.next();
      
        }
        }
        while (flag3);
            }
            while(i==1);
    }
    
    //getter method that takes ArrayList of type Product as a parameter and calculate the total price of the elements prices. 
    public void getTotal(ArrayList<Product> pro){
        
        double total=0.0;
        for(Product p :pro){
            total+=p.getPrice();
        }
        System.out.println("Total Prise : "+total+" SR");
        //if the user ordered more then 5 products, he will get discount by 15%
        if (pro.size()>=5){
            System.out.println("You have a discount by 15% for buying more than 5 products!\nTotal price after discount: "+(total-(total*0.15)));
        }
    }
    
     //method printBill takes ArrayList of type Product as a parameter, and print its elements and the number of produts and the total price.
    public void printBill(ArrayList<Product> pro){
        
        int i=0;// varible that show how many objects of class Drink exist.
        int j=0;//varible that show how many objects of class Dessert exist.
        int dr =0, ds=0; //varible that store the index of the object.
        
        System.out.println("Your order is :\n");
        for(Product p :pro){
            System.out.print(p.toString()+"\n");
            if(p instanceof Drink){
                i++;
                dr=pro.indexOf(p);
            }
            else {
               j++; 
               ds=pro.indexOf(p);
            }
        }
        System.out.println("");
        
        if (i>0&&j>0){ 
            System.out.println(((Drink)(pro.get(dr))).howToEat()+"\n"+((Dessert)(pro.get(ds))).howToEat());
            ((Drink)(pro.get(dr))).eatingUtensils(i);
            ((Dessert)(pro.get(ds))).eatingUtensils(j);
        }
        else if (i>0){
            System.out.println(((Drink)(pro.get(dr))).howToEat());
            ((Drink)(pro.get(dr))).eatingUtensils(i);
        }
        else if (j>0){
            System.out.println(((Dessert)(pro.get(ds))).howToEat());
            ((Dessert)(pro.get(ds))).eatingUtensils(j);
        }
        else{}
        
        System.out.println("\nNO. of produts: "+pro.size());
        getTotal(pro);
        System.out.println("");
    }
    
    // a getter method that return an ArrayList of type Proudect
    public ArrayList<Product> getOrder(){
        return this.products;
    }
    
    //void method that takes the user's evaluation of the services
    public void feedBack(){
       
        System.out.println("Thank you for buying from our Coffee shop,\nWe kindly ask you to rate our service from 1 to 5 in order to help us develop our services. ");
        Scanner input = new Scanner (System.in);
        int n=1;
        System.out.println("");
        boolean flag =true;
        do {
            //handle InputMismatchException
        try {
          n=input.nextInt();  
          System.out.println("");
          if(n>0&&n<=5){
            flag=false;
          }
          else {
              System.out.println("You entered a wrong number please enter a number from 1 to 5  ");
           
          }
        }
        catch (InputMismatchException e){
            System.out.println("You entered the number incorrectly, Please enter a number from 1 to 5 ");
            input.next();
      
        }
        }
        while (flag);
        
        System.out.println("");
        switch(n){
            case 1:System.out.println("*");break;    
            case 2:System.out.println("* *");break;           
            case 3:System.out.println("* * *");break;           
            case 4:System.out.println("* * * *");break;
            case 5:System.out.println("* * * * *");break;
            
        }
       
            System.out.println("Thank you for your rating, We will love to see you again soon!" );
                
                
    }
   
    
}
