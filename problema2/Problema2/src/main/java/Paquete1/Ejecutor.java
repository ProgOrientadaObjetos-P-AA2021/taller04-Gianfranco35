/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Paquete1;

import Paquete2.nombre;

/**
 *
 * @author micha
 */
public class Ejecutor {

    public static void main(String[] args) {
        nombre sueldo = new nombre();
        sueldo.calcularSueldoT();

        System.out.println(sueldo.toString());
    }
}
