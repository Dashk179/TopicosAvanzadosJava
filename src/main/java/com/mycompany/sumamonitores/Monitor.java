/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.sumamonitores;


import static com.mycompany.sumamonitores.Var.b;
import static com.mycompany.sumamonitores.Var.suma;
import java.util.Scanner;

/**
 *
 * @author noseqpedo
 */
public class Monitor {
    int order=0;
    
    public synchronized void Obtenerdatos(){
        Scanner dato = new Scanner(System.in);
        
        System.out.println("Dame el primer numero");
        Var.a=dato.nextInt();
        
        System.out.println("Dame el segundo numero");
        Var.b=dato.nextInt();
    }
    
    public synchronized void suma(){
        Var.suma=Var.a+b;
    }
    
    public synchronized void Resultado(){
        System.out.println("El resultado de tu suma es: "+suma);
    }
}
