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
public class Suma implements Runnable{
    ArrayList<Integer>datos;
    
    public Suma(ArrayList<Integer> datos){
        this.datos=datos;
    }

    @Override
    public void run() {
        try {
            synchronized(datos){
                if (datos.size()<2) {
                    datos.wait();
                    
                }
                datos.add(datos.get(0)+datos.get(1));
                datos.notify();
            }
        } catch (Exception e) {
            System.out.println("Error en el hilo 2"+e.getMessage());
        }
    }
}