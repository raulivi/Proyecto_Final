
package Clases;

import java.sql.*;
import javax.swing.JOptionPane;

public class Database {

    private String Driver; 
    private String Url; 
    private String Usuario;
    private String Contraseña;
    private Connection con = null;
            

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
 
    public Connection conectar(){
        try {
            Class.forName(Driver);
            con = DriverManager.getConnection(Url);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return con;
    }
    
    public void desconectar(Connection con){
        try {
            con.close();
        } catch (Exception e) {
        }
    }
}
