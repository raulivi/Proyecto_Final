
package Clases;

import java.sql.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Operaciones {
    Database db = new Database();
    
    public ArrayList<Object[]> consultar(String tabla){
        Connection con;
        PreparedStatement pst;
        ResultSet rs;
        ResultSetMetaData meta;
        String sql ="select * from "+tabla; 
        ArrayList<Object[]> datos = new ArrayList<>();
        try {
            Class.forName(db.getDriver());
            con=DriverManager.getConnection(db.getUrl(),db.getUsuario(),db.getContraseña());
            pst=con.prepareStatement(sql);
            rs=pst.executeQuery();
            meta=rs.getMetaData();
            while (rs.next()) { 
                Object[] fila=new Object[meta.getColumnCount()];
                for (int i = 0; i <fila.length; i++) {
                    fila[i]=rs.getObject(i+1);
                }
                datos.add(fila);
            }
        } catch (SQLException | ClassNotFoundException e) { 
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return datos;
    }
    
    
}
