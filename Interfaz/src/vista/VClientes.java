/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

/**
 *
 * @author Administrador
 */
public class VClientes extends javax.swing.JFrame {

    /**
     * Creates new form Clientes
     */
    public VClientes() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel5 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jpRegistrarCli = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtNombreR = new javax.swing.JTextField();
        txtDniR = new javax.swing.JTextField();
        txtDireccionR = new javax.swing.JTextField();
        txtCorreoR = new javax.swing.JTextField();
        txtRucR = new javax.swing.JTextField();
        cboSexoR = new javax.swing.JComboBox<>();
        btnAgregar = new javax.swing.JButton();
        btnNuevo = new javax.swing.JButton();
        jpConsultarCli = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaC = new javax.swing.JTable();
        btnMostrar = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jpModificarCli = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        txtCodigoM = new javax.swing.JTextField();
        btnActualizar1 = new javax.swing.JButton();
        btnAgregar1 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        txtNombreR2 = new javax.swing.JTextField();
        txtDniR2 = new javax.swing.JTextField();
        txtDireccionR2 = new javax.swing.JTextField();
        txtCorreoR2 = new javax.swing.JTextField();
        txtRucR2 = new javax.swing.JTextField();
        cboSexoR2 = new javax.swing.JComboBox<>();
        jpEliminarCli = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        txtCodigoM1 = new javax.swing.JTextField();
        btnActualizar2 = new javax.swing.JButton();
        btnMantSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(860, 560));
        setMinimumSize(new java.awt.Dimension(860, 560));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(860, 560));

        jPanel5.setBackground(new java.awt.Color(0, 204, 153));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("MANTENIMIENTO DE CLIENTES");
        jPanel5.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 30, 600, 30));

        jTabbedPane1.setBackground(new java.awt.Color(255, 255, 255));
        jTabbedPane1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTabbedPane1.setMaximumSize(new java.awt.Dimension(840, 460));
        jTabbedPane1.setMinimumSize(new java.awt.Dimension(840, 460));
        jTabbedPane1.setPreferredSize(new java.awt.Dimension(840, 460));

        jpRegistrarCli.setBackground(new java.awt.Color(0, 204, 153));
        jpRegistrarCli.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jpRegistrarCli.setPreferredSize(new java.awt.Dimension(840, 440));
        jpRegistrarCli.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("NOMBRES Y APELLIDOS:");
        jpRegistrarCli.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(85, 60, 240, 30));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("DNI:");
        jpRegistrarCli.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(225, 100, 100, 30));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("DIRECCIÓN:");
        jpRegistrarCli.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 140, -1, 30));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("CORREO:");
        jpRegistrarCli.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 180, -1, 30));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("RUC:");
        jpRegistrarCli.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 220, -1, 30));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("SEXO:");
        jpRegistrarCli.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 260, -1, 30));

        txtNombreR.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jpRegistrarCli.add(txtNombreR, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 60, 360, 30));

        txtDniR.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jpRegistrarCli.add(txtDniR, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 100, 200, 30));

        txtDireccionR.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jpRegistrarCli.add(txtDireccionR, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 140, 360, 30));

        txtCorreoR.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jpRegistrarCli.add(txtCorreoR, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 180, 360, 30));

        txtRucR.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jpRegistrarCli.add(txtRucR, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 220, 200, 30));

        cboSexoR.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        cboSexoR.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Seleccionar-", "Hombre", "Mujer" }));
        jpRegistrarCli.add(cboSexoR, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 260, 200, 30));

        btnAgregar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnAgregar.setText("REGISTRAR");
        jpRegistrarCli.add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 320, 200, 40));

        btnNuevo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnNuevo.setText("LIMPIAR CAMPOS");
        jpRegistrarCli.add(btnNuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 320, 200, 40));

        jTabbedPane1.addTab("REGISTRAR", jpRegistrarCli);

        jpConsultarCli.setBackground(new java.awt.Color(0, 204, 153));
        jpConsultarCli.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jpConsultarCli.setPreferredSize(new java.awt.Dimension(840, 440));
        jpConsultarCli.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tablaC.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        tablaC.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CÓDIGO", "NOMBRE", "DNI", "DIRECCIÓN", "CORREO", "RUC", "SEXO"
            }
        ));
        tablaC.setGridColor(new java.awt.Color(255, 255, 0));
        tablaC.setSelectionBackground(new java.awt.Color(255, 153, 0));
        jScrollPane1.setViewportView(tablaC);

        jpConsultarCli.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 83, 790, 330));

        btnMostrar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnMostrar.setText("LISTAR");
        jpConsultarCli.add(btnMostrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 25, 200, 40));

        jTextField1.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jpConsultarCli.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 30, 300, 30));

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel16.setText("BUSCAR POR NOMBRE:");
        jpConsultarCli.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, -1, 30));

        jTabbedPane1.addTab("CONSULTAR", jpConsultarCli);

        jpModificarCli.setBackground(new java.awt.Color(0, 204, 153));
        jpModificarCli.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jpModificarCli.setMaximumSize(new java.awt.Dimension(840, 440));
        jpModificarCli.setMinimumSize(new java.awt.Dimension(840, 440));
        jpModificarCli.setPreferredSize(new java.awt.Dimension(840, 440));
        jpModificarCli.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("BUSCAR POR CÓDIGO:");
        jpModificarCli.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 30, -1, 30));

        txtCodigoM.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jpModificarCli.add(txtCodigoM, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 30, 200, 30));

        btnActualizar1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnActualizar1.setText("BUSCAR");
        jpModificarCli.add(btnActualizar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 25, 150, 40));

        btnAgregar1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnAgregar1.setText("ACTUALIZAR DATOS");
        jpModificarCli.add(btnAgregar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 350, 200, 40));

        jSeparator1.setForeground(new java.awt.Color(255, 0, 0));
        jpModificarCli.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, 740, 10));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel11.setText("NOMBRES Y APELLIDOS:");
        jpModificarCli.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(95, 100, 240, 30));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel12.setText("DNI:");
        jpModificarCli.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(235, 140, 100, 30));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel13.setText("DIRECCIÓN:");
        jpModificarCli.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 180, -1, 30));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel14.setText("CORREO:");
        jpModificarCli.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 220, -1, 30));

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel15.setText("RUC:");
        jpModificarCli.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 260, -1, 30));

        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel23.setText("SEXO:");
        jpModificarCli.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 300, -1, 30));

        txtNombreR2.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jpModificarCli.add(txtNombreR2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 100, 360, 30));

        txtDniR2.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jpModificarCli.add(txtDniR2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 140, 200, 30));

        txtDireccionR2.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jpModificarCli.add(txtDireccionR2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 180, 360, 30));

        txtCorreoR2.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jpModificarCli.add(txtCorreoR2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 220, 360, 30));

        txtRucR2.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jpModificarCli.add(txtRucR2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 260, 200, 30));

        cboSexoR2.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        cboSexoR2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Seleccionar-", "Hombre", "Mujer" }));
        jpModificarCli.add(cboSexoR2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 300, 200, 30));

        jTabbedPane1.addTab("MODIFICAR", jpModificarCli);

        jpEliminarCli.setBackground(new java.awt.Color(0, 204, 153));
        jpEliminarCli.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jpEliminarCli.setPreferredSize(new java.awt.Dimension(840, 440));
        jpEliminarCli.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel10.setText("ELIMINAR POR CÓDIGO:");
        jpEliminarCli.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 80, -1, 30));

        txtCodigoM1.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jpEliminarCli.add(txtCodigoM1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 80, 250, 30));

        btnActualizar2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnActualizar2.setText("ELIMINAR");
        jpEliminarCli.add(btnActualizar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 75, 150, 40));

        jTabbedPane1.addTab("ELIMINAR", jpEliminarCli);

        jPanel5.add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 840, 460));

        btnMantSalir.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnMantSalir.setText("X");
        btnMantSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMantSalirActionPerformed(evt);
            }
        });
        jPanel5.add(btnMantSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 30, 50, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 860, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnMantSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMantSalirActionPerformed
        dispose();
        this.setVisible(false);
    }//GEN-LAST:event_btnMantSalirActionPerformed

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
            java.util.logging.Logger.getLogger(VClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VClientes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar1;
    private javax.swing.JButton btnActualizar2;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnAgregar1;
    private javax.swing.JButton btnMantSalir;
    private javax.swing.JButton btnMostrar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JComboBox<String> cboSexoR;
    private javax.swing.JComboBox<String> cboSexoR2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    public javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JPanel jpConsultarCli;
    private javax.swing.JPanel jpEliminarCli;
    private javax.swing.JPanel jpModificarCli;
    private javax.swing.JPanel jpRegistrarCli;
    private javax.swing.JTable tablaC;
    private javax.swing.JTextField txtCodigoM;
    private javax.swing.JTextField txtCodigoM1;
    private javax.swing.JTextField txtCorreoR;
    private javax.swing.JTextField txtCorreoR2;
    private javax.swing.JTextField txtDireccionR;
    private javax.swing.JTextField txtDireccionR2;
    private javax.swing.JTextField txtDniR;
    private javax.swing.JTextField txtDniR2;
    private javax.swing.JTextField txtNombreR;
    private javax.swing.JTextField txtNombreR2;
    private javax.swing.JTextField txtRucR;
    private javax.swing.JTextField txtRucR2;
    // End of variables declaration//GEN-END:variables
}