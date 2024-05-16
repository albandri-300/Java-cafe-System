/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cafesystem;

/**
 * interface Edible is implemented by Product class.
 */
public interface Edible {
    //abstract method return String that describe how to eat the product.
    public abstract String howToEat();
    //abstract method return String of the No. of eating utensils needed.
    public abstract void eatingUtensils( int s);
}
