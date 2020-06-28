/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.sumamonitores;

import java.util.Scanner;


/**
 *
 * @author noseqpedo
 */
public class Datos  implements Runnable{



    @Override
    public void run() {
         Var.m.Obtenerdatos();
    }
}
