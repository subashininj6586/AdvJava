/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Subha
 */
public class ChainREsponPaternDEmo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Employee e;
       DeputyHead dh =new DeputyHead();
       e=dh;
       Head h= new Head();
       Vice_Chancellor vc  =new Vice_Chancellor();
       
       dh.setNextSupervisor(h);
       h.setNextSupervisor(vc);
       
       e.applyLeave("Suba", 10);
       
       e.applyLeave("Subasatheesh", 20);
       
       e.applyLeave("Eugin", 30);
       
       e.applyLeave("John", 40);
    }
    
}
