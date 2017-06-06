
package Vistas;

import Clases.Database;
import Clases.Operaciones;
import Clases.Ruta;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Revision_Rutas extends javax.swing.JFrame {

    String columns[]={"ID", "Codigo de Cliente", "Fecha de Salida", "Carga en Kg", "ID Vehiculo", "Motorista", "Kilometraje", "Destino", "Fecha de Llegada"};
    DefaultTableModel model=new DefaultTableModel(columns, 0);
    Database db = new Database();
    Operaciones op = new Operaciones();
    Ruta ru = new Ruta();
    
    /**
     * Creates new form Revision_Rutas
     */
    public Revision_Rutas() {
        initComponents();
        ArrayList<Object[]> datos=op.consultar("rutas");
        model.setNumRows(0);
        for (Object[] dato: datos) {
            model.addRow(dato);
        }
        TablaR.setModel(model);
    }
    
    public void cargar(){
        ArrayList<Object[]> datos=op.consultar("rutas");
        model.setNumRows(0);
        for (Object[] dato: datos) {
            model.addRow(dato);
        }
        TablaR.setModel(model);
    }
    
    public void limpiar(){
        txtID.setText("");
        txtCodigo.setText("");
        txtsalida.setText("");
        txtCarga.setText("");
        txtvehiculo.setText("");
        txtmotorista.setText("");
        txtkilometraje.setText("");
        txtdestino.setText("");
        txtllegada.setText("");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaR = new javax.swing.JTable();
        txtID = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        txtsalida = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtCarga = new javax.swing.JTextField();
        txtvehiculo = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtmotorista = new javax.swing.JTextField();
        txtkilometraje = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtllegada = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtdestino = new javax.swing.JTextField();
        btnInsertar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuSalir = new javax.swing.JMenu();
        menuitemSalir = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 204, 255));
        setUndecorated(true);

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));

        TablaR.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6", "Title 7", "Title 8", "Title 9"
            }
        ));
        TablaR.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablaRMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TablaR);

        jLabel1.setText("ID");

        jLabel2.setText("Codigo Cliente");

        jLabel3.setText("Fecha de Salida");

        jLabel4.setText("Carga en Kg");

        jLabel5.setText("ID Vehiculo");

        jLabel6.setText("Motorista");

        jLabel7.setText("Kilometraje");

        jLabel8.setText("Destino");

        jLabel9.setText("Fecha LLegada");

        btnInsertar.setText("INSERTAR");
        btnInsertar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnInsertarMouseClicked(evt);
            }
        });

        btnModificar.setText("MODIFICAR");
        btnModificar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnModificarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 2, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(jLabel1)))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(jLabel2)))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtsalida, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(jLabel3)))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtCarga, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(23, 23, 23)
                                        .addComponent(jLabel4)))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtvehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(jLabel5)))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtmotorista, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(jLabel6)))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtkilometraje, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(jLabel7)))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtdestino, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(jLabel8)))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(jLabel9))
                                    .addComponent(txtllegada, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(btnInsertar)
                                .addGap(18, 18, 18)
                                .addComponent(btnModificar)))))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtsalida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCarga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtvehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtmotorista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtkilometraje, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtdestino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtllegada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnInsertar)
                    .addComponent(btnModificar))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        menuSalir.setText("Salir");

        menuitemSalir.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_W, java.awt.event.InputEvent.CTRL_MASK));
        menuitemSalir.setText("Cerrar");
        menuitemSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuitemSalirActionPerformed(evt);
            }
        });
        menuSalir.add(menuitemSalir);

        jMenuBar1.add(menuSalir);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuitemSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuitemSalirActionPerformed
        Vista_Principal vp = new Vista_Principal();
        vp.nombre="";
        vp.sesion="1";
        vp.setExtendedState(MAXIMIZED_BOTH);
        vp.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_menuitemSalirActionPerformed

    private void TablaRMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaRMouseClicked
        txtID.setText(TablaR.getValueAt(TablaR.getSelectedRow(),0).toString());
        txtCodigo.setText(TablaR.getValueAt(TablaR.getSelectedRow(), 1).toString());
        txtsalida.setText(TablaR.getValueAt(TablaR.getSelectedRow(), 2).toString());
        txtCarga.setText(TablaR.getValueAt(TablaR.getSelectedRow(), 3).toString());
        txtvehiculo.setText(TablaR.getValueAt(TablaR.getSelectedRow(), 4).toString());
        txtmotorista.setText(TablaR.getValueAt(TablaR.getSelectedRow(), 5).toString());
        txtkilometraje.setText(TablaR.getValueAt(TablaR.getSelectedRow(), 6).toString());
        txtdestino.setText(TablaR.getValueAt(TablaR.getSelectedRow(), 7).toString());
        txtllegada.setText(TablaR.getValueAt(TablaR.getSelectedRow(), 8).toString());

    }//GEN-LAST:event_TablaRMouseClicked

    private void btnInsertarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnInsertarMouseClicked
        ru.setId(Integer.parseInt(txtID.getText()));
        ru.setCodigoCliente(Integer.parseInt(txtCodigo.getText()));
        ru.setFechaSalida(txtsalida.getText());
        ru.setCargaEstimada(Double.parseDouble(txtCarga.getText()));
        ru.setIdVehiculo(Integer.parseInt(txtvehiculo.getText()));
        ru.setCodigoMotorista(Integer.parseInt(txtmotorista.getText()));
        ru.setKilometraje(Double.parseDouble(txtkilometraje.getText()));
        ru.setDestino(txtdestino.getText());
        ru.setFechaLlegada(txtllegada.getText());
        if (op.insertar(ru, "rutas")) {
            JOptionPane.showMessageDialog(this, "Insertado con Exito", "Informacion", JOptionPane.INFORMATION_MESSAGE);
            cargar();
            limpiar();
        }else{
            JOptionPane.showMessageDialog(this, "Error", "Informacion", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnInsertarMouseClicked

    private void btnModificarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnModificarMouseClicked
        ru.setId(Integer.parseInt(txtID.getText()));
        ru.setCodigoCliente(Integer.parseInt(txtCodigo.getText()));
        ru.setFechaSalida(txtsalida.getText());
        ru.setCargaEstimada(Double.parseDouble(txtCarga.getText()));
        ru.setIdVehiculo(Integer.parseInt(txtvehiculo.getText()));
        ru.setCodigoMotorista(Integer.parseInt(txtmotorista.getText()));
        ru.setKilometraje(Double.parseDouble(txtkilometraje.getText()));
        ru.setDestino(txtdestino.getText());
        ru.setFechaLlegada(txtllegada.getText());
        try {
            if (op.modificar(ru, "rutas")) {
                JOptionPane.showMessageDialog(this, "Modificado con Exito", "Informacion", JOptionPane.INFORMATION_MESSAGE);
                cargar();
                limpiar();
            }else{
                JOptionPane.showMessageDialog(this, "Error", "Informacion", JOptionPane.ERROR_MESSAGE);
            }
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }//GEN-LAST:event_btnModificarMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Revision_Rutas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Revision_Rutas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Revision_Rutas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Revision_Rutas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Revision_Rutas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TablaR;
    private javax.swing.JButton btnInsertar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JMenu menuSalir;
    private javax.swing.JMenuItem menuitemSalir;
    private javax.swing.JTextField txtCarga;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtdestino;
    private javax.swing.JTextField txtkilometraje;
    private javax.swing.JTextField txtllegada;
    private javax.swing.JTextField txtmotorista;
    private javax.swing.JTextField txtsalida;
    private javax.swing.JTextField txtvehiculo;
    // End of variables declaration//GEN-END:variables
}
