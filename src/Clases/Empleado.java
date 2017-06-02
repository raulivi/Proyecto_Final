
package Clases;

public class Empleado {
    
    private int codigo;
    private String nombre;
    private String apellido;
    private String dui;
    private String licencia;
    private String estadoCivil;
    private double salario;
    private String fechaIngreso;
    private double isss;
    private double afp;
    private double renta;

    public Empleado() {
    }

    public Empleado(int codigo, String nombre, String apellido, String dui, String licencia, String estadoCivil, double salario, String fechaIngreso, double isss, double afp, double renta) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.apellido = apellido;
        this.dui = dui;
        this.licencia = licencia;
        this.estadoCivil = estadoCivil;
        this.salario = salario;
        this.fechaIngreso = fechaIngreso;
        this.isss = isss;
        this.afp = afp;
        this.renta = renta;
    }

    public double getRenta() {
        return renta;
    }

    public void setRenta(double renta) {
        this.renta = renta;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDui() {
        return dui;
    }

    public void setDui(String dui) {
        this.dui = dui;
    }

    public String getLicencia() {
        return licencia;
    }

    public void setLicencia(String licencia) {
        this.licencia = licencia;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(String fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public double getIsss() {
        return isss;
    }

    public void setIsss(double isss) {
        this.isss = isss;
    }

    public double getAfp() {
        return afp;
    }

    public void setAfp(double afp) {
        this.afp = afp;
    }
            
            
    
}
