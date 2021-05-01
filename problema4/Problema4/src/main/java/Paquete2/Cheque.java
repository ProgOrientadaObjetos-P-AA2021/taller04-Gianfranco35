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
public class Cheque {

    private String nombreCliente;
    private String nombreBanco;
    private double valorCheque;
    private double comisionBanco;

    public Cheque() {
        this.nombreCliente = "Josue";
        this.nombreBanco = "Banco de Loja";
        this.valorCheque = 150;
    }

    public void estabelcerNombreCliente(String nombreCli) {
        nombreCliente = nombreCli;
    }

    public void estabelcerNombreBanco(String nombreBan) {
        nombreBanco = nombreBan;
    }

    public void calcularValorCheque(double valor) {
        valorCheque = valor;
    }

    public void calcularComisionBanco() {
        comisionBanco = valorCheque * 0.003;
    }

    public String obtenerNombreCliente() {
        return nombreCliente;
    }

    public String obtenerNombrebanco() {
        return nombreBanco;
    }

    public double obtenerValorCheque() {
        return valorCheque;
    }

    public double obtenerComisionBanco() {
        return comisionBanco;
    }

    @Override
    public String toString() {
        return String.format("Nombre Cliente: %s "
                + "\nNombre Banco: %s"
                + "\nValor Cheque: %.2f "
                + "\nComision Banco: %.2f \n", nombreCliente, nombreBanco,
                valorCheque, comisionBanco);
    }
}
