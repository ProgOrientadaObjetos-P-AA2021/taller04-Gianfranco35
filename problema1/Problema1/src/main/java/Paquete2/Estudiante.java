/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;

/**
 *
 * @author bitxanax
 */
public class Estudiante {

    private String nombre;
    private double calificacion1;
    private double calificacion2;
    private double calificacion3;
    private double promedio;

    public Estudiante() {
        this.nombre = "Mario";
        this.calificacion1 = 5;
        this.calificacion2 = 10;
        this.calificacion3 = 9;
    }

    public void estabelcerNombre(String n) {
        nombre = n;
    }

    public void estabelcerCalificacion1(double c1) {
        calificacion1 = c1;
    }

    public void estabelcerCalificacion2(double c2) {
        calificacion2 = c2;
    }

    public void estabelcerCalificacion3(double c3) {
        calificacion3 = c3;
    }

    public void calcularPromedio() {
        promedio = (calificacion1 + calificacion2 + calificacion3) / 3;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public double obtenerCalificacion1() {
        return calificacion1;
    }

    public double obtenerCalificacion2() {
        return calificacion2;
    }

    public double obtenerCalificacion3() {
        return calificacion3;
    }

    public double obtenerPromedio() {
        return promedio;
    }

    @Override
    public String toString() {
        return String.format("Nombre: %s \nCalificación 1: %.2f "
                + "\nCalificación 2: %.2f "
                + "\nCalificación 3: %.2f "
                + "\nPromedio: %.2f", nombre, calificacion1, calificacion2,
                calificacion3, promedio);
    }

}
