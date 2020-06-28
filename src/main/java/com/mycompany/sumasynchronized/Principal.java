/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.sumasynchronized;

import java.util.ArrayList;

/**
 *
 * @author noseqpedo
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Integer> datos = new ArrayList<>();
       

        Thread t1 = new Thread(new Datos(datos));
        Thread t2 = new Thread(new Suma(datos));
        Thread t3 = new Thread(new Resultado(datos));
        
        t1.start();
        t2.start();
        t3.start();
        

    }

}
