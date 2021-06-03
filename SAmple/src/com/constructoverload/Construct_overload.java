/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.constructoverload;

/**
 *
 * @author Subha
 */
public class Construct_overload {
    int len, bre;
    float rad, heig;
    double base, theig;

    public Construct_overload(int len, int bre) {
        this.len=len;
        this.bre=bre;
    }
    public Construct_overload(float rad, float heig) {
        this.rad=rad;
        this.heig=heig;
    }
    public Construct_overload(double base, double theig) {
        this.base=base;
        this.theig=theig;
    }
    void rec_area()
    {
        System.out.println("Rect area=="+(len*bre));
    }
    void tria_area()
    {
        System.out.println("Triangle area=="+((1/2)*base*theig));
    }
    void cylin_area()
    {
        System.out.println("cyi area=="+((2*3.14*rad*heig)+(2*3.24*rad*rad)));
    }
}
