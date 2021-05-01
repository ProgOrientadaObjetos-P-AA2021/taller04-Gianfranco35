/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Paquete2;

/**
 *
 * @author micha
 */
public class nombre {

    private String nombre;
    private String apellido;
    private double sueldoTotal;
    private double sueldoBasico;
    private int cedula;

    public nombre() {
        
        this.nombre = "Gianfranco";
        this.apellido = "Sanchez";
        this.sueldoBasico = 369;
        this.cedula = 1103007280;
    }


    public void establecernombre(String n) {
        nombre = n;
    }

    public void establecerapellido(String a) {
        apellido = a;
    }

    public void establecersueldo(double s) {
        sueldoBasico = s;
    }

    public void establecerCedula(int c) {
        cedula = c;
    }

    public void calcularSueldoT() {
        double total = (sueldoBasico * 20) / 100;
        sueldoTotal = sueldoBasico + total;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public String obtenerapellido() {
        return apellido;
    }

    public double obtenerSueldoB() {
        return sueldoBasico;
    }

    public double obtenersueldo() {
        return sueldoTotal;
    }

    public int obtenercedula() {
        return cedula;
    }

    @Override
    public String toString() {
        String cadena = "";
        cadena = String.format("%sNombre: %s\nApellido: %s\nCedula: %d\n"
                + "Sueldo basico: %.2f\nSueldo total: %.2f", cadena, nombre,
                apellido, cedula, sueldoBasico, sueldoTotal);
        return cadena;
    }
}
