/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.sumamonitores;

/**
 *
 * @author noseqpedo
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException{
        
       Thread t1 = new Thread((Runnable) new Datos());
       Thread t2 = new Thread((Runnable) new Suma());
       Thread t3 = new Thread((Runnable) new Resultado());
       
        
            t1.start();
            t1.join();
            
            t2.start();
            t2.join();
            
            t3.start();
            t3.join();
            
       
       
    }
    
}
