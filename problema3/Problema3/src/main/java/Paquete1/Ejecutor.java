/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Paquete1;

import Paquete2.Vehiculo;

/**
 *
 * @author Usuario iTC
 */
public class Ejecutor {

    public static void main(String[] args) {
        Vehiculo vehiculo = new Vehiculo("1103007280", "toyota", 2019, 30000);
        vehiculo.calcularValorMatricula();

        Vehiculo vehiculo1 = new Vehiculo("1103007280", "chevrolet", 2020, 20000);
        vehiculo1.calcularValorMatricula();
        
        System.out.println(vehiculo + "\n" + vehiculo1);
    }
}
