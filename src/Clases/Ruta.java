//api de google AIzaSyBMpYZiPcFXAxTQ6cHUECxa3ebFiwkvwdE
package Clases;

public class Ruta {
    
    private int id;
    private int codigoCliente;
    private String fechaSalida;
    private double cargaEstimada;
    private int idVehiculo;
    private int codigoMotorista;
    private double kilometraje;
    private String destino;
    private String fechaLlegada;

    public Ruta() {
    }

    public Ruta(int id, int codigoCliente, String fechaSalida, double cargaEstimada, int idVehiculo, int codigoMotorista, double kilometraje, String destino, String fechaLlegada) {
        this.id = id;
        this.codigoCliente = codigoCliente;
        this.fechaSalida = fechaSalida;
        this.cargaEstimada = cargaEstimada;
        this.idVehiculo = idVehiculo;
        this.codigoMotorista = codigoMotorista;
        this.kilometraje = kilometraje;
        this.destino = destino;
        this.fechaLlegada = fechaLlegada;
    }

    public String getFechaLlegada() {
        return fechaLlegada;
    }

    public void setFechaLlegada(String fechaLlegada) {
        this.fechaLlegada = fechaLlegada;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(String fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public double getCargaEstimada() {
        return cargaEstimada;
    }

    public void setCargaEstimada(double cargaEstimada) {
        this.cargaEstimada = cargaEstimada;
    }

    public int getIdVehiculo() {
        return idVehiculo;
    }

    public void setIdVehiculo(int idVehiculo) {
        this.idVehiculo = idVehiculo;
    }

    public int getCodigoMotorista() {
        return codigoMotorista;
    }

    public void setCodigoMotorista(int codigoMotorista) {
        this.codigoMotorista = codigoMotorista;
    }

    public double getKilometraje() {
        return kilometraje;
    }

    public void setKilometraje(double kilometraje) {
        this.kilometraje = kilometraje;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public int getCodigoCliente() {
        return codigoCliente;
    }

    public void setCodigoCliente(int codigoCliente) {
        this.codigoCliente = codigoCliente;
    }
    
    

}
