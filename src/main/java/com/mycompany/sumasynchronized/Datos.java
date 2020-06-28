/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.sumasynchronized;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author noseqpedo
 */
public class Datos implements Runnable{
    Scanner d=new Scanner(System.in);
    
    ArrayList<Integer>datos;
    
    public Datos(ArrayList<Integer>datos){
        this.datos=datos;
    }
    

    @Override
    public void run() {
        try {
        
            synchronized(datos){
                System.out.println("Escribe el primer numero: ");
                datos.add(d.nextInt());
                System.out.println("Escribe el segundo numero");
                datos.add(d.nextInt());
                datos.notify();
                
                
            }
        } catch (Exception e) {
            System.out.println("Error hilo 1"+e.getMessage());
        }
    }
    
    
}