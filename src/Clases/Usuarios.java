
package Clases;

public class Usuarios {

    private int codigoEmpleado;
    private String username;
    private String password;
    private String cargo;
    private String departamento;
    private int nivel;

    public Usuarios() {
    }

    public Usuarios(int codigoEmpleado, String username, String password, String cargo, String departamento, int nivel) {
        this.codigoEmpleado = codigoEmpleado;
        this.username = username;
        this.password = password;
        this.cargo = cargo;
        this.departamento = departamento;
        this.nivel = nivel;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public int getCodigoEmpleado() {
        return codigoEmpleado;
    }

    public void setCodigoEmpleado(int codigoEmpleado) {
        this.codigoEmpleado = codigoEmpleado;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
    
    
    
}
