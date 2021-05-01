package Paquete1;

import paquete2.Cheque;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author bitxanax
 */
public class Ejecutor {

    public static void main(String[] args) {

        Cheque cheque = new Cheque();
        cheque.calcularComisionBanco();

        System.out.println(cheque.toString());
    }

}
