/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

/**
 *
 * @author cbhzito
 */
public class VEmpleados extends javax.swing.JFrame {

    /**
     * Creates new form Empleados
     */
    public VEmpleados() {
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
        txtNombreREmp = new javax.swing.JTextField();
        txtUsuarioREmp = new javax.swing.JTextField();
        txtContraseniaREmp = new javax.swing.JTextField();
        cboSexoREmp = new javax.swing.JComboBox<>();
        btnRegistrarEmp = new javax.swing.JButton();
        btnNuevo = new javax.swing.JButton();
        cboCargoREmp = new javax.swing.JComboBox<>();
        jcFeIngREmp = new com.toedter.calendar.JDateChooser();
        txtDniREmp = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jpConsultarCli = new javax.swing.JPanel();
        btnMostrar = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblEmpleado = new javax.swing.JTable();
        jpModificarCli = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        txtCodigoM = new javax.swing.JTextField();
        btnActualizar1 = new javax.swing.JButton();
        btnAgregar1 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        txtNombreR1 = new javax.swing.JTextField();
        txtCorreoR1 = new javax.swing.JTextField();
        txtRucR1 = new javax.swing.JTextField();
        cboSexoR1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        jDateChooser2 = new com.toedter.calendar.JDateChooser();
        jpEliminarCli = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        txtCodigoM1 = new javax.swing.JTextField();
        btnActualizar2 = new javax.swing.JButton();
        btnMantSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel5.setBackground(new java.awt.Color(255, 255, 102));
        jPanel5.setPreferredSize(new java.awt.Dimension(860, 560));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("MANTENIMIENTO DE EMPLEADOS");
        jPanel5.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 30, 630, 30));

        jTabbedPane1.setBackground(new java.awt.Color(255, 255, 255));
        jTabbedPane1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTabbedPane1.setMaximumSize(new java.awt.Dimension(840, 460));
        jTabbedPane1.setMinimumSize(new java.awt.Dimension(840, 460));
        jTabbedPane1.setPreferredSize(new java.awt.Dimension(840, 460));

        jpRegistrarCli.setBackground(new java.awt.Color(255, 255, 102));
        jpRegistrarCli.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jpRegistrarCli.setPreferredSize(new java.awt.Dimension(840, 440));
        jpRegistrarCli.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("NOMBRES Y APELLIDOS:");
        jpRegistrarCli.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 60, 240, 30));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("CARGO:");
        jpRegistrarCli.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 100, 100, 30));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("FECHA DE INGRESO:");
        jpRegistrarCli.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 140, 220, 30));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("USUARIO:");
        jpRegistrarCli.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 220, -1, 30));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("CONTRASEÑA:");
        jpRegistrarCli.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 260, 240, 30));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("SEXO:");
        jpRegistrarCli.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 300, -1, 30));

        txtNombreREmp.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jpRegistrarCli.add(txtNombreREmp, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 60, 360, 30));

        txtUsuarioREmp.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jpRegistrarCli.add(txtUsuarioREmp, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 220, 200, 30));

        txtContraseniaREmp.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jpRegistrarCli.add(txtContraseniaREmp, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 260, 200, 30));

        cboSexoREmp.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        cboSexoREmp.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Seleccionar-", "Hombre", "Mujer" }));
        jpRegistrarCli.add(cboSexoREmp, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 300, 200, 30));

        btnRegistrarEmp.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnRegistrarEmp.setText("REGISTRAR");
        jpRegistrarCli.add(btnRegistrarEmp, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 360, 200, 40));

        btnNuevo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnNuevo.setText("LIMPIAR CAMPOS");
        jpRegistrarCli.add(btnNuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 360, 200, 40));

        cboCargoREmp.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        cboCargoREmp.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Seleccione-", "Administrador", "Cajero" }));
        jpRegistrarCli.add(cboCargoREmp, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 100, 200, 30));
        jpRegistrarCli.add(jcFeIngREmp, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 140, 250, 30));

        txtDniREmp.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jpRegistrarCli.add(txtDniREmp, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 180, 200, 30));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel11.setText("D.N.I.:");
        jpRegistrarCli.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 180, 90, 30));

        jTabbedPane1.addTab("REGISTRAR", jpRegistrarCli);

        jpConsultarCli.setBackground(new java.awt.Color(255, 255, 102));
        jpConsultarCli.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jpConsultarCli.setPreferredSize(new java.awt.Dimension(840, 440));
        jpConsultarCli.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnMostrar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnMostrar.setText("LISTAR");
        jpConsultarCli.add(btnMostrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 25, 200, 40));

        jTextField1.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jpConsultarCli.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 30, 300, 30));

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel16.setText("BUSCAR POR NOMBRE:");
        jpConsultarCli.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, -1, 30));

        tblEmpleado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CÓDIGO", "NOMBRE", "CARGO", "FECHA INGRESO", "USUARIO", "CONTRASEÑA", "SEXO"
            }
        ));
        jScrollPane1.setViewportView(tblEmpleado);

        jpConsultarCli.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 800, 340));

        jTabbedPane1.addTab("CONSULTAR", jpConsultarCli);

        jpModificarCli.setBackground(new java.awt.Color(255, 255, 102));
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
        jpModificarCli.add(btnAgregar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 370, 200, 40));

        jSeparator1.setForeground(new java.awt.Color(255, 0, 0));
        jpModificarCli.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, 740, 10));

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel17.setText("NOMBRES Y APELLIDOS:");
        jpModificarCli.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 100, 240, 30));

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel18.setText("CARGO:");
        jpModificarCli.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 140, 100, 30));

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel19.setText("FECHA DE INGRESO:");
        jpModificarCli.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 180, 220, 30));

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel20.setText("USUARIO:");
        jpModificarCli.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 230, -1, 30));

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel21.setText("CONTRASEÑA:");
        jpModificarCli.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 270, 240, 30));

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel22.setText("SEXO:");
        jpModificarCli.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 310, -1, 30));

        txtNombreR1.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jpModificarCli.add(txtNombreR1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 100, 360, 30));

        txtCorreoR1.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jpModificarCli.add(txtCorreoR1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 230, 200, 30));

        txtRucR1.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jpModificarCli.add(txtRucR1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 270, 200, 30));

        cboSexoR1.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        cboSexoR1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Seleccionar-", "Hombre", "Mujer" }));
        jpModificarCli.add(cboSexoR1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 310, 200, 30));

        jComboBox2.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Seleccione-", "Administrador", "Cajero" }));
        jpModificarCli.add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 140, 200, 30));
        jpModificarCli.add(jDateChooser2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 180, 250, 30));

        jTabbedPane1.addTab("MODIFICAR", jpModificarCli);

        jpEliminarCli.setBackground(new java.awt.Color(255, 255, 102));
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
            .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 864, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 565, javax.swing.GroupLayout.PREFERRED_SIZE)
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
            java.util.logging.Logger.getLogger(VEmpleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VEmpleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VEmpleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VEmpleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VEmpleados().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar1;
    private javax.swing.JButton btnActualizar2;
    private javax.swing.JButton btnAgregar1;
    private javax.swing.JButton btnMantSalir;
    private javax.swing.JButton btnMostrar;
    private javax.swing.JButton btnNuevo;
    public static javax.swing.JButton btnRegistrarEmp;
    public static javax.swing.JComboBox<String> cboCargoREmp;
    private javax.swing.JComboBox<String> cboSexoR1;
    public static javax.swing.JComboBox<String> cboSexoREmp;
    private javax.swing.JComboBox<String> jComboBox2;
    private com.toedter.calendar.JDateChooser jDateChooser2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
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
    public static com.toedter.calendar.JDateChooser jcFeIngREmp;
    private javax.swing.JPanel jpConsultarCli;
    private javax.swing.JPanel jpEliminarCli;
    private javax.swing.JPanel jpModificarCli;
    private javax.swing.JPanel jpRegistrarCli;
    public static javax.swing.JTable tblEmpleado;
    private javax.swing.JTextField txtCodigoM;
    private javax.swing.JTextField txtCodigoM1;
    public static javax.swing.JTextField txtContraseniaREmp;
    private javax.swing.JTextField txtCorreoR1;
    public static javax.swing.JTextField txtDniREmp;
    private javax.swing.JTextField txtNombreR1;
    public static javax.swing.JTextField txtNombreREmp;
    private javax.swing.JTextField txtRucR1;
    public static javax.swing.JTextField txtUsuarioREmp;
    // End of variables declaration//GEN-END:variables
}
