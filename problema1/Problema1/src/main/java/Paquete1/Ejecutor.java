/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Paquete1;

import paquete2.Estudiante;

/**
 *
 * @author bitxanax
 */
public class Ejecutor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Estudiante estudiante = new Estudiante();
        estudiante.calcularPromedio();

        System.out.println(estudiante.toString());
    }

}
