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
public class Constr_overload_main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Construct_overload co=new Construct_overload(10, 20);
       Construct_overload co1=new Construct_overload(10f,20f);
       Construct_overload co2=new Construct_overload(10.1,20.1);
       co.rec_area();
       co2.tria_area();
       co1.cylin_area();
    
}
}