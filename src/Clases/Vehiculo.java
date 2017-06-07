
package Clases;

public class Vehiculo {
    
    private int id;
    private int año;
    private String modelo;
    private String tipo;
    private double capacidad;
    private String placa;
    private String chasis;
    private String visitaTaller;
    private String diagnostico;
    private int estado;

    public Vehiculo() {
    }

    public Vehiculo(int id, int año, String modelo, String tipo, double capacidad, String placa, String chasis, String visitaTaller, String diagnostico, int estado) {
        this.id = id;
        this.año = año;
        this.modelo = modelo;
        this.tipo = tipo;
        this.capacidad = capacidad;
        this.placa = placa;
        this.chasis = chasis;
        this.visitaTaller = visitaTaller;
        this.diagnostico = diagnostico;
        this.estado = estado;
    }
    
    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(double capacidad) {
        this.capacidad = capacidad;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getChasis() {
        return chasis;
    }

    public void setChasis(String chasis) {
        this.chasis = chasis;
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }

    public String getVisitaTaller() {
        return visitaTaller;
    }

    public void setVisitaTaller(String visitaTaller) {
        this.visitaTaller = visitaTaller;
    }
    
    
    
}
