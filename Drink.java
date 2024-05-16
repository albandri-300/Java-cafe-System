/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cafesystem;

/**
 *
 * this class is a subclass of abstract class Product. 
 */
import java.util.*;

public class Drink extends Product {
    //In addition to product fields, it has the general fields of any drink, such as the cup size, the flavor and the drink temperature. 
    private String size="";
    private String flavor;
    private String temp="";
    
    //defult constructer.
    public Drink(){}
    
    //copy constructer that take an object and make a deep copy of it. it invokes the superclass copy constructer.
    public Drink(Drink d){
        super(d);
        flavor=d.flavor;
        size="";
        temp="";
        
    }
    
    //constructer that initiate an object and initilize its name, price and flavor.  it invokes the superclass copy constructer.
    public Drink(String n, double p, String f){
        super(n, p);
        flavor = f;
    }
    
    //override method return String after rearranging product fields.
    public String toString(){
        return temp+" "+flavor+" "+getName()+" "+getSize()+" "+getPrice()+" SR";
    }
    
    //override method return String that describe how to eat the product.
    public String howToEat(){
        return "Stir the drink well before drinking and enjoy!";
    }
    
    //method return boolean value after checking if two objects ​​are equal.
    public boolean equals(Object o){
        if ((this.getName().equalsIgnoreCase(((Drink)o).getName()))&&(this.flavor).equalsIgnoreCase(((Drink)o).flavor)&&(this.size).equalsIgnoreCase(((Drink)o).size)&&(this.temp).equalsIgnoreCase(((Drink)o).temp))
            return true;
        else return false;
    }
    
    
     //method return String of the No. of eating utensils needed.
    public void eatingUtensils( int s){
        System.out.println( " No. of straws: "+s);
    }
    
    //void method that sets the drink temp deppending on what the usr enter.
    public void hotOrIce(){
        Scanner input=new Scanner(System.in);
        
       System.out.println("If you want your drink to be iced, enter 1, otherwise enter 0");
        int n=1;
        System.out.println("");
        boolean flag =true;
        do {
        //handle InputMismatchException
        try {
          n=input.nextInt();  
          System.out.println("");
          if(n==0||n==1){
            flag=false;
          }
          else {
              System.out.println("You entered a wrong number please enter it again, If you want your drink to be iced, enter 1, otherwise enter 0");
           
          }
        }
        catch (InputMismatchException e){
            System.out.println("You entered the number incorrectly, Please enter it again:");
            input.next();
      
        }
        }
        while (flag);
        
       System.out.println("");
       
       if (n==1)
           this.temp= "Iced";
       else
           this.temp= "";
    }
    
    //setter method that sets the object's cup size deppending on what the usr enter. 
    public void setSize(){
        
        Scanner input=new Scanner(System.in);
        System.out.println("Choose your cup size:\n Enter S for Small, M for Medium (+2.5 SR), L for Large(+5.0 SR)");
        
        String s="";
        System.out.println("");
        boolean flag =true;
        do {
        //handle InputMismatchException    
        try {
          s=input.nextLine();  
          System.out.println("");
          if(s.equals("s")||s.equals("S")||s.equals("m")||s.equals("M")||s.equals("l")||s.equals("L")){
            flag=false;
          }
          else {
              System.out.println("You entered a wrong cup size please enter it again, Enter S for Small, M for Medium (+2.5 SR), L for Large(+5.0 SR)");
           
          }
        }
        catch (InputMismatchException e){
            System.out.println("You entered the number incorrectly, Please enter it again:");
            input.next();
      
        }
        }
        while (flag);
        System.out.println("");
        
        switch (s){
            
            case "S":
            case "s":{
                this.size="S";
                break;
            }
            case "M":
            case "m":{
                this.size="M";
                break;
            }    
            case "L":
            case "l":{
                this.size="L";
                break;
            }    
        }
    }
    
    //getter method return the object's size.
    public String getSize(){
        return this.size;
    }
    
    //modifier method that changes the object's price deppending on the cup size. 
    public void sizePrice (String size){
       
        if ("L".equals(size))
            this.setPrice(this.getPrice()+5.0);
        else if ("M".equals(size))
            this.setPrice(this.getPrice()+2.5);
        else {}
      
    }
    
}
