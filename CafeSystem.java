/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.cafesystem;

/**
 * 
 *
 * this is the driver class
 */

import java.util.*;

public class CafeSystem {
    
    /**
    * The main method is a start point of our app
    * main method will be executed whenever app run
    */

    public static void main(String[] args) {
        
        // here we initialized a new object from class Menu
        // menu object will handle a list of products
        // we will add products to our menu using addPro() method
        Menu menu = new Menu();
        menu.addPro(new Drink("Mocha",10.0,"Dark Choco"));
        menu.addPro(new Drink("Mocha",10.0,"White Shaken"));
        menu.addPro(new Drink("Latte",12.0,"Vanilla"));
        menu.addPro(new Drink("Latte",12.0,"Caramel"));
        menu.addPro(new Drink("Latte",12.0,"Matcha"));
        menu.addPro(new Drink("Cappuccino",8.0,"Cinnamon"));
        menu.addPro(new Drink("Cappuccino",8.0,"Turkish"));
        menu.addPro(new Dessert("Pancake",10.0,"Chocolate"));
        menu.addPro(new Dessert("Pancake",10.0,"Raspberry"));
        menu.addPro(new Dessert("Cake",15.0,"Strawberry"));
        menu.addPro(new Dessert("Cake",15.0,"Carrot"));
        menu.addPro(new Dessert("Cake",15.0,"Red Velvet"));
        menu.addPro(new Dessert("Cake",15.0,"BlueBerry Cheese"));
        
        // print a welcmoe statement to the user.
        System.out.println(menu.toString());
        
        // print out the ArrayList of Products that exists in object menu
        menu.showMenu(menu.getMenu());
        
        // create new order object
        Order ord =new Order();
        
        // ask the user to make an Arraylist for the order object from menu's Arraylist
        ord.setOrder(ord, menu);
        
        // print the bill to the user
        ord.printBill(ord.getOrder());
        
        // when the order finished, we will ask the user to rate our service
        ord.feedBack();
        
    }
}
