/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cafesystem;

/**
 *this abstract class is the superclass for  class Drink and class Dessert. and it implements interface Edible.
 */
public abstract class Product implements Edible{
    /** 
     * it has the general fields of any product, such as the product name, price and product number.
     * and it has a class field proNum to give a unique product number for each object is created from a class that extends this superclass.
     */
    private String name;
    private double price;
    private int proNum;
    protected static int proNums=1;
    
    //defult constructer.
    public Product(){}
    
    //copy constructer that take an object and make a deep copy of it.
    public Product(Product p){
    name = p.name;
    price = p.price;
    }
    
    //constructer that initiate an object and initilize its name and price.
    public Product(String n, double p){
        name = n;
        price = p;
        proNum=proNums;
        proNums++;
    }
    
    //setter method that sets the object's name from the method parameter.
    public void setName (String n){
         name=n;
    }
    
    //getter methom return the object's name.
    public String getName (){
        return name;
    }
    
    //getter methom return the object's price.
    public double getPrice (){
        return this.price;
    }
    
    //setter method that sets the object's price from the method parameter.
    public void setPrice (double p){
        price=p;
    }
    
    //getter method return the object's proNum.
    public int getProNum(){
        return proNum;
    }
    
    //override abstract method return String that describe how to eat the product.
    public abstract String howToEat();
    
    //method return String of the No. of eating utensils needed.
    public abstract void eatingUtensils( int s);
    
    //override abstract method return String after rearranging product fields.
    public abstract String toString();
    
    //override abstract method return boolean value after checking if two objects ​​are equal.
    public abstract boolean equals(Object o);
    
    
    
   
}
