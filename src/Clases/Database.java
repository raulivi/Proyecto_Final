
package Clases;

public class Database {

    private String Driver; 
    private String Url; 
    private String Usuario;
    private String Contraseña;

    public Database() {
        this.Driver="com.mysql.jdbc.Driver";
        this.Url="jdbc:mysql://localhost:3306/proyecto_stisv";
        this.Usuario="root";
        this.Contraseña="";
    }

    public String getDriver() {
        return Driver;
    }

    public String getUrl() {
        return Url;
    }

    public String getUsuario() {
        return Usuario;
    }

    public String getContraseña() {
        return Contraseña;
    }
    
}
