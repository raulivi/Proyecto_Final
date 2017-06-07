
package Clases;

import java.sql.*;
import javax.swing.JOptionPane;

public class Acceso {
    
    Database db =  new Database();
    
    public String[] validar(String user, String pass){
        int i=0;
        Connection con;
        ResultSet rs;
        Statement st;
        String us="";
        String niv="";
        String sql="select username, nivel from usuarios where username='"+user+"' and pass='"+pass+"';";
        try {
            Class.forName(db.getDriver());
            con=DriverManager.getConnection(db.getUrl(),db.getUsuario(),db.getContraseña());
            st=con.createStatement();
            rs=st.executeQuery(sql);
            while (rs.next()) {                
                us=rs.getString("username");
                niv=rs.getString("nivel");
            }
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null,"Error de SQL...¬¬://"+e.getMessage());
        }
        String[] valores={us,niv};
        return valores;
    }
    
}
