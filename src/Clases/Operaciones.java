
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
                Usuarios u= (Usuarios) obj;
                sql="INSERT INTO usuarios VALUES ("+u.getCodigoEmpleado()+", '"+u.getUsername()+"', '"+u.getPassword()+"', '"+u.getCargo()+"', '"+u.getDepartamento()+"', "+u.getNivel()+")";
            break;
            case "rutas":
                //Users u= (Users) obj;
                //sql="insert into users values("+u.getId()+",'"+u.getUsername()+"','"+u.getPasss()+"',"+u.getNivel()+")";
            break;
            case "vehiculo":
                Vehiculo v = (Vehiculo) obj;
                sql="INSERT INTO vehiculo `diagnostico`, `disponible`) VALUES ("+v.getId()+", "+v.getAño()+", '"+v.getModelo()+"', '"+v.getTipo()+"', "+v.getCapacidad()+", '"+v.getPlaca()+"', '"+v.getChasis()+"', '"+v.getVisitaTaller()+"', '"+v.getDiagnostico()+"',"+v.getEstado()+")";
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
            JOptionPane.showMessageDialog(null, e.getMessage());
            return false;
        }
    }
    
    public boolean modificar(Object obj,String tabla) throws ClassNotFoundException{
        Connection con;
        PreparedStatement pst;
        String sql="";
        switch(tabla){
            case "cliente":
                Cliente c = (Cliente)obj;
                sql="UPDATE cliente SET nombre='"+c.getNombre()+"', id='"+c.getId()+"', tipo_id='"+c.getTipoId()+"', telefono='"+c.getTelefono()+"', direccion='"+c.getDireccion()+"' WHERE codigo="+c.getCodigo();
            break;
            case "empleado":
                //Docentes d=(Docentes)obj;
                //sql="insert into DOCENTES values("+d.getCodigo()+",'"+d.getNombre()+"','"+d.getDui()+"','"+d.getTelefono()+"',"+d.getSalario()+",'"+d.getCargo()+"')";
            break;
            case "usuarios":
                Usuarios u= (Usuarios) obj;
                sql="UPDATE usuarios SET username='"+u.getUsername()+"', pass='"+u.getPassword()+"', cargo='"+u.getCargo()+"', area ='"+u.getDepartamento()+"', nivel="+u.getNivel()+" WHERE codigo ="+u.getCodigoEmpleado();
            break;
            case "rutas":
                //Users u= (Users) obj;
                //sql="insert into users values("+u.getId()+",'"+u.getUsername()+"','"+u.getPasss()+"',"+u.getNivel()+")";
            break;
            case "vehiculo":
                Vehiculo v =(Vehiculo) obj;
                sql="UPDATE vehiculo SET año="+v.getAño()+", modelo='"+v.getModelo()+"', tipo='"+v.getTipo()+"', capacidad ="+v.getCapacidad()+", placa ='"+v.getPlaca()+"', chasis='"+v.getChasis()+"', ultima_revision='"+v.getVisitaTaller()+"', diagnostico='"+v.getDiagnostico()+"', disponible ="+v.getEstado()+" WHERE id="+v.getId();
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
            JOptionPane.showMessageDialog(null, e.getMessage());
            return false;
        }
    }
    
    public boolean eliminar(String tabla, String campo, String valor) throws ClassNotFoundException{
        Connection con;
        PreparedStatement pst;
        String sql="delete from "+tabla+" where "+campo+"="+valor;
        try {
            Class.forName(db.getDriver());
            con = DriverManager.getConnection(db.getUrl(),db.getUsuario(),db.getContraseña());
            pst=con.prepareStatement(sql);
            pst.executeUpdate();
            return true;
        } catch (SQLException | ClassNotFoundException e) { 
            JOptionPane.showMessageDialog(null, e.getMessage());
            return false;
        }
    }
    
}
