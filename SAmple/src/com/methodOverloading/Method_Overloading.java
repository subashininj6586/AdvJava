/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.methodOverloading;

/**
 *
 * @author Subha
 */
public class Method_Overloading {

    void area(int size) {
        System.out.println("Area of square ==" + (size * size));

    }

    void area(float len, float brea) {
        System.out.println("Area of rect.." + (len * brea));
    }

}
