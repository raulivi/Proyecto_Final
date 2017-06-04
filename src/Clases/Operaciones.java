
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
    
    public boolean insertar(Object obj,String tabla){
        Connection con;
        PreparedStatement pst;
        String sql="";
        switch(tabla){
            case "cliente":
                Cliente c=(Cliente)obj;
                sql="INSERT INTO cliente VALUES ("+c.getCodigo()+", '"+c.getNombre()+"', '"+c.getId()+"', '"+c.getTipoId()+"', '"+c.getTelefono()+"', '"+c.getDireccion()+"')";
            break;
            case "empleado":
                //Docentes d=(Docentes)obj;
                //sql="insert into DOCENTES values("+d.getCodigo()+",'"+d.getNombre()+"','"+d.getDui()+"','"+d.getTelefono()+"',"+d.getSalario()+",'"+d.getCargo()+"')";
            break;
            case "usuarios":
                //Users u= (Users) obj;
                //sql="insert into users values("+u.getId()+",'"+u.getUsername()+"','"+u.getPasss()+"',"+u.getNivel()+")";
            break;
            case "rutas":
                //Users u= (Users) obj;
                //sql="insert into users values("+u.getId()+",'"+u.getUsername()+"','"+u.getPasss()+"',"+u.getNivel()+")";
            break;
            case "vehiculo":
                //Users u= (Users) obj;
                //sql="insert into users values("+u.getId()+",'"+u.getUsername()+"','"+u.getPasss()+"',"+u.getNivel()+")";
            break;
            default:
            break;
        }
        try {
            Class.forName(db.getDriver());
            con = DriverManager.getConnection(db.getUrl(),db.getUsuario(),db.getContraseña());
            pst=con.prepareStatement(sql);
            pst.executeUpdate();
            return true;
        } catch (SQLException | ClassNotFoundException e) { 
            JOptionPane.showMessageDialog(null, e.getMessage());//mensaje

            return false;
        }
    }
    
}
