
package Clases;

public class Clientes {
    
    private int codigo;
    private String nombre;
    private String id;
    private String tipoId;
    private String telefono;
    private String direccion;

    public Clientes() {
    }

    public Clientes(int codigo, String nombre, String id, String tipoId, String telefono, String direccion) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.id = id;
        this.tipoId = tipoId;
        this.telefono = telefono;
        this.direccion = direccion;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
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

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTipoId() {
        return tipoId;
    }

    public void setTipoId(String tipoId) {
        this.tipoId = tipoId;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
            
    
    
}
