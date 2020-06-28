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
public class Resultado implements Runnable{
    ArrayList<Integer>datos;
    
    
    
    public Resultado(ArrayList<Integer> datos){
        this.datos=datos;
    }

    @Override
    public void run() {
        try {
            synchronized(datos){
                if (datos.size()<3) {
                  
                    
                    datos.wait();
                    
                }
                int r = datos.get(0)+datos.get(1);
                System.out.println("La suma de tus dos numeros es: "+r);
            }
        } catch (Exception e) {
            System.out.println("Error en el hilo 3 " +e.getMessage());
        }
            }
    
    
}
