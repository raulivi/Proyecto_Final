
package Clases;

public class Empleado {
    
    private int codigo;
    private String nombre;
    private String apellido;
    private String dui;
    private String licencia;
    private String estadoCivil;
    private double salarioBase;
    private String fechaIngreso;
    private double isss;
    private double afp;
    private double renta;
    private double salarioNeto;
    private String cargo;

    public Empleado() {
    }

    public Empleado(int codigo, String nombre, String apellido, String dui, String licencia, String estadoCivil, double salarioBase, String fechaIngreso, double isss, double afp, double renta, double salarioNeto, String cargo) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.apellido = apellido;
        this.dui = dui;
        this.licencia = licencia;
        this.estadoCivil = estadoCivil;
        this.salarioBase = salarioBase;
        this.fechaIngreso = fechaIngreso;
        this.isss = isss;
        this.afp = afp;
        this.renta = renta;
        this.salarioNeto = salarioNeto;
        this.cargo = cargo;
    }

   

    public double getRenta() {
        return renta;
    }

    public void setRenta() {
        double vrenta=0;
        double salario=this.salarioBase;
        if (salario>=472.01 && salario<895.25) {
            vrenta=salario*0.1;
        }else if (salario>=895.25 && salario<2038.11) {
            vrenta=salario*0.2;
        } else if (salario>=2038.11 ) {
            vrenta=salario*0.3;
        }
        double rentaR= Math.rint(vrenta*100)/100;
        this.renta = rentaR;
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
        if (licencia.isEmpty()) {
            licencia=" ";
        }
        this.licencia = licencia;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
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

    public void setIsss() {
        double salario=this.salarioBase;
        double visss = salario*0.03;
        double isssR= Math.rint(visss*100)/100;
        this.isss = isssR;
    }

    public double getAfp() {
        return afp;
    }

    public void setAfp() {
        double salario=this.salarioBase;
        double vafp=salario*0.07;
        double afpR= Math.rint(vafp*100)/100;
        this.afp = afpR;
    }

    public double getSalarioNeto() {
        return salarioNeto;
    }

    public void setSalarioNeto() {
        double salario=this.salarioBase;
        double salarioN = salario-(this.afp+this.isss+this.renta);
        this.salarioNeto = salarioN;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }
    
}
