
package Vistas;

import Clases.Database;
import Clases.Operaciones;
import Clases.Ruta;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;

public class Mantenimiento_Rutas extends javax.swing.JFrame {
    
    String d0ID="";
    String d1Codigo="";
    String d2Salida="";
    String d3Carga="";
    String d4Vehiculo="";
    String d5Motorista="";
    String d6Kilometraje="";
    String d7Destino="";
    String d8Llegada="";
    
    String columns[]={"ID", "Codigo de Cliente", "Fecha de Salida", "Carga en Kg", "ID Vehiculo", "Motorista", "Kilometraje", "Destino", "Fecha de Llegada"};
    DefaultTableModel model=new DefaultTableModel(columns, 0);
    Database db = new Database();
    Operaciones op = new Operaciones();
    Ruta ru = new Ruta();

    /**
     * Creates new form Mantenimiento_Rutas
     */
    public Mantenimiento_Rutas() {
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

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaR = new javax.swing.JTable();
        txtID = new javax.swing.JTextField();
        txtCodigo = new javax.swing.JTextField();
        txtsalida = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtCarga = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtvehiculo = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtmotorista = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtkilometraje = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtdestino = new javax.swing.JTextField();
        txtllegada = new javax.swing.JTextField();
        btnEliminar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnInsertar = new javax.swing.JButton();
        btnbuscaCliente = new javax.swing.JButton();
        btnbuscavehiculo = new javax.swing.JButton();
        btnbuscarmotorista = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuSalir = new javax.swing.JMenu();
        menuitemSalir = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        TablaR.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
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

        btnEliminar.setText("ELIMINAR");
        btnEliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEliminarMouseClicked(evt);
            }
        });

        btnModificar.setText("MODIFICAR");
        btnModificar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnModificarMouseClicked(evt);
            }
        });

        btnInsertar.setText("INSERTAR");
        btnInsertar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnInsertarMouseClicked(evt);
            }
        });

        btnbuscaCliente.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        btnbuscaCliente.setText("Buscar Cliente");
        btnbuscaCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnbuscaClienteMouseClicked(evt);
            }
        });

        btnbuscavehiculo.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        btnbuscavehiculo.setText("Buscar Vehiculo");
        btnbuscavehiculo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnbuscavehiculoMouseClicked(evt);
            }
        });

        btnbuscarmotorista.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        btnbuscarmotorista.setText("Buscar Motorista");
        btnbuscarmotorista.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnbuscarmotoristaMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel1)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel2)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtsalida, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel3)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCarga, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addComponent(jLabel4)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtvehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel5)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtmotorista, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel6)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtkilometraje, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel7)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtdestino, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel8)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel9))
                            .addComponent(txtllegada, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 48, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnbuscaCliente)
                        .addGap(18, 18, 18)
                        .addComponent(btnbuscavehiculo)
                        .addGap(18, 18, 18)
                        .addComponent(btnbuscarmotorista)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnInsertar)
                        .addGap(18, 18, 18)
                        .addComponent(btnModificar)
                        .addGap(18, 18, 18)
                        .addComponent(btnEliminar)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
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
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
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
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnInsertar)
                    .addComponent(btnModificar)
                    .addComponent(btnEliminar)
                    .addComponent(btnbuscaCliente)
                    .addComponent(btnbuscavehiculo)
                    .addComponent(btnbuscarmotorista))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

    private void btnEliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarMouseClicked
        ru.setId(Integer.parseInt(txtID.getText())); 
        try {
            if (op.eliminar("rutas", "id", String.valueOf(ru.getId()))){
                JOptionPane.showMessageDialog(this, "Eliminado con Exito", "Informacion", JOptionPane.INFORMATION_MESSAGE);
                cargar();
                limpiar();
            }else{
                JOptionPane.showMessageDialog(this, "Error", "Informacion", JOptionPane.ERROR_MESSAGE);
            }
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }//GEN-LAST:event_btnEliminarMouseClicked

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

    private void btnbuscaClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnbuscaClienteMouseClicked
    escribir();
    Admin_Seleccionar_Cliente sc = new Admin_Seleccionar_Cliente();
    sc.d0ID=d0ID;
    sc.d1Codigo=d1Codigo;
    sc.d2Salida=d2Salida;
    sc.d3Carga=d3Carga;
    sc.d4Vehiculo=d4Vehiculo;
    sc.d5Motorista=d5Motorista;
    sc.d6Kilometraje=d6Kilometraje;
    sc.d7Destino=d7Destino;
    sc.d8Llegada= d8Llegada;
    sc.setLocationRelativeTo(null);
    sc.setVisible(true);
    this.dispose();
    }//GEN-LAST:event_btnbuscaClienteMouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        if (d0ID!="") {
            txtID.setText(d0ID);
        }
        if (d1Codigo!="") {
            txtCodigo.setText(d1Codigo);
        }
        if (d2Salida!="") {
            txtsalida.setText(d2Salida);
        }
        if (d3Carga!="") {
            txtCarga.setText(d3Carga);
        }
        if (d4Vehiculo!="") {
            txtvehiculo.setText(d4Vehiculo);
        }
        if (d5Motorista!="") {
            txtmotorista.setText(d5Motorista);
        }
        if (d6Kilometraje!="") {
            txtkilometraje.setText(d6Kilometraje);
        }
        if (d7Destino!="") {
            txtdestino.setText(d7Destino);
        }
        if (d8Llegada !="") {
            txtllegada.setText(d8Llegada);
        }
    }//GEN-LAST:event_formWindowOpened

    private void btnbuscavehiculoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnbuscavehiculoMouseClicked
        escribir();
        Admin_Selecciona_Vehiculo sv = new Admin_Selecciona_Vehiculo();
        sv.d0ID=d0ID;
        sv.d1Codigo=d1Codigo;
        sv.d2Salida=d2Salida;
        sv.d3Carga=d3Carga;
        sv.d4Vehiculo=d4Vehiculo;
        sv.d5Motorista=d5Motorista;
        sv.d6Kilometraje=d6Kilometraje;
        sv.d7Destino=d7Destino;
        sv.d8Llegada= d8Llegada;
        sv.setLocationRelativeTo(null);
        sv.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnbuscavehiculoMouseClicked

    private void btnbuscarmotoristaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnbuscarmotoristaMouseClicked
        escribir();
        Admin_Selecciona_Motorista sm = new Admin_Selecciona_Motorista();
        sm.d0ID=d0ID;
        sm.d1Codigo=d1Codigo;
        sm.d2Salida=d2Salida;
        sm.d3Carga=d3Carga;
        sm.d4Vehiculo=d4Vehiculo;
        sm.d5Motorista=d5Motorista;
        sm.d6Kilometraje=d6Kilometraje;
        sm.d7Destino=d7Destino;
        sm.d8Llegada= d8Llegada;
        sm.setLocationRelativeTo(null);
        sm.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnbuscarmotoristaMouseClicked

    public void escribir(){
        d0ID=txtID.getText();
        d1Codigo=txtCodigo.getText();
        d2Salida= txtsalida.getText();
        d3Carga=txtCarga.getText();
        d4Vehiculo=txtvehiculo.getText();
        d5Motorista=txtmotorista.getText();
        d6Kilometraje=txtkilometraje.getText();
        d7Destino=txtdestino.getText();
        d8Llegada=txtllegada.getText(); 
    }
    
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
            java.util.logging.Logger.getLogger(Mantenimiento_Rutas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Mantenimiento_Rutas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Mantenimiento_Rutas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Mantenimiento_Rutas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Mantenimiento_Rutas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TablaR;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnInsertar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnbuscaCliente;
    private javax.swing.JButton btnbuscarmotorista;
    private javax.swing.JButton btnbuscavehiculo;
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
    private javax.swing.JPanel jPanel1;
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
