/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cafesystem;

/**
 *
 * 
 */

import java.util.*;

public class Menu {
    
    // Menu fild of type ArrayList of Proudect that stores object of type DRINK and DESSERT classes.
    private ArrayList<Product> products;
    
    // a defult constructer that creats object of type Menu and initilalize Array list of type Proudect
    public Menu (){
        this.products= new ArrayList<Product>();
    }
    
     // a void mehtod takes Product object as a parametar and add it to the Arraylist of the object that invokes this method.
    public void addPro(Product pro){
        this.products.add(pro);
    }
    
    // an override method that return a welcmoe statement to the user.
    public String toString(){
        return "\"Welcome To The Coffee Shop\"\nHere is the menu,\n";
    }
    
    //void method that takes ArrayList Product as a parameter and prints the elements of the menu to the user
    public void showMenu(ArrayList<Product> pro){
        // we have two intgers variables n and i
        int n=0,i=0;
        // the variable n is a Condition that makes sure the String DESSERT is printed only once and is not repeated
        // and the variable i is an index for the elements of the Arraylist
            System.out.print("DRINKS:\n\n");
        
        for(Product p :pro){
            if ((pro.get(i) instanceof Dessert) && (n==0)){
                 System.out.println("");
                
                System.out.print("\nDESSERTS:\n\n");
                n++;
            }
            i++;   
            System.out.print(p.getProNum()+"- "+p.toString()+"\n");

        }
        System.out.println("");
    }
    
    // a getter method that return an ArrayList of type Proudect
    public ArrayList<Product> getMenu(){
        return this.products;
    }
    
    
}
