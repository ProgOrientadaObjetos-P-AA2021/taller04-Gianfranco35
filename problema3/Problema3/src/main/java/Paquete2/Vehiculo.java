package Paquete2;

/**
 *
 * @author Usuario iTC
 */
public class Vehiculo {

    /**
     * @param args the command line arguments
     */
    private String cedulaDueno;
    private String marcaVehiculo;
    private int anoFabricante;
    private double valorVehiculo;
    private double valorMatricula;

    public Vehiculo(String ceduladueno, String marcaVehiculo, int anoFabricante, double valorVehiculo ) {
        this.cedulaDueno = ceduladueno;
        this.marcaVehiculo = marcaVehiculo;
        this.anoFabricante = anoFabricante;
        this.valorVehiculo = valorVehiculo;
    }

    public void establecerCedulaDueno(String cd) {
        cedulaDueno = cd;
    }

    public void establecerMarcaVehiculo(String mv) {
        marcaVehiculo = mv;
    }

    public void establecerAnoFabricante(int af) {
        anoFabricante = af;
    }

    public void establecerValorVehiculo(double vh) {
        valorVehiculo = vh;
    }

    public void calcularValorMatricula() {
        valorMatricula =  valorVehiculo*0.002 *anoFabricante;
    }

    public String obtenerCedulaDueno() {
        return cedulaDueno;
    }

    public String obtenererMarcaVehiculo() {
        return marcaVehiculo;
    }

    public int obtenerAnoFabricante() {
        return anoFabricante;
    }

    public double obtenerValorVehiculo() {
        return valorVehiculo;
    }

    public double obtenerValorMatricula() {
        return valorMatricula;
    }

    @Override
    public String toString() {
        return "Cedula Dueño:  " + this.cedulaDueno + "\nMarca Vehiculo: "
                + this.marcaVehiculo + "\n Año Fabricante: "
                + this.anoFabricante + "\nValor Vehiculo: "
                + this.valorVehiculo + "\nValor Matricula: "
                + this.valorMatricula + "\n" ;
    }
}
