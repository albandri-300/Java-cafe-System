/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cafesystem;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * this class is a subclass of abstract class Product. 
 */
public class Dessert extends Product {
    //In addition to product fields, it has the general fields of any dessert, such as the dessert base and the side sause.
    private String base;
    private String sause="";   
    
    //defult constructer.        
    public Dessert(){}
    
    //copy constructer that take an object and make a deep copy of it. it invokes the superclass copy constructer.
    public Dessert(Dessert d){
        super(d);
        base=d.base;
    }
    
    //constructer that initiate an object and initilize its name, price and base. it invokes the superclass copy constructer.
    public Dessert(String n, double p, String b){
        super(n,p);
        base=b;
    }
    
    //setter method that sets the object's sause deppending on what the usr enter. and adds an extra amount if side sauce is requested. 
    public void sideSause(){
        Scanner input=new Scanner(System.in);
        System.out.println("Do you want to add SideSause? yes : 1, No : 0. ");
        
        int n =1;
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
              System.out.println("You entered a wrong number please enter it again, If you want to add SideSause? yes : 1, No : 0. ");
           
          }
        }
        catch (InputMismatchException e){
            System.out.println("You entered the number incorrectly, Please enter it again:");
            input.next();
      
        }
        }
        while (flag);
      
        if (n==1){
        System.out.println("SideSause (costs 3 SR) enter the number of the sause you want.\n1-Choclate\n2-vanilla\n3-Strawberry\n");
        
        int s=1;
        System.out.println("");
        boolean flag2 =true;
        do {
            //handle InputMismatchException
        try {
          s=input.nextInt();  
          System.out.println("");
          if(s>0&&s<=3){
            flag2=false;
          }
          else {
              System.out.println("You entered a wrong number please enter it again, \n1-Choclate\n2-vanilla\n3-Strawberry\n ");
           
          }
        }
        catch (InputMismatchException e){
            System.out.println("You entered the number incorrectly, Please enter it again:\n1-Choclate\n2-vanilla\n3-Strawberry\n");
            input.next();
      
        }
        }
        while (flag2);
        
        switch (s){
            
            case 1:{
                sause=" with Choclate sause";
                setPrice(this.getPrice()+3);
                break;
            }
            case 2:{
                sause=" with Vanilla sause";
                setPrice(this.getPrice()+3);
                break;
            }    
            case 3:{
                sause=" with Strawberry sause";
                setPrice(this.getPrice()+3);
                break;
            }    
            default:{
                sause="";
            }
        }
    }
        
    }
    
    //override method return String after rearranging product fields.
    public String toString(){
        return base+" "+getName()+sause+" "+getPrice()+" SR";
    }
    
    //override method return String that describe how to eat the product.
    public String howToEat(){
        return "Add the sauce to the dessert, then enjoy!";
    }
    
    //method return String of the No. of eating utensils needed.
    public void eatingUtensils( int s){
         System.out.println(" No. of spoons: "+s);
    }
    
    //method return boolean value after checking if two objects ​​are equal.
    public boolean equals(Object o){
        if ((this.getName().equalsIgnoreCase(((Dessert)o).getName()))&&(this.base).equalsIgnoreCase(((Dessert)o).base)&&(this.sause).equalsIgnoreCase(((Dessert)o).sause))
            return true;
        else return false;
    }
    
}
