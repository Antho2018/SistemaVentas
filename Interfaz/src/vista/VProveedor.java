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
public class VProveedor extends javax.swing.JFrame {

    /**
     * Creates new form Proveedor
     */
    public VProveedor() {
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
        txtNombreREmp = new javax.swing.JTextField();
        txtUsuarioREmp = new javax.swing.JTextField();
        btnAgregar = new javax.swing.JButton();
        btnNuevo = new javax.swing.JButton();
        txtUsuarioREmp1 = new javax.swing.JTextField();
        txtUsuarioREmp2 = new javax.swing.JTextField();
        jpConsultarCli = new javax.swing.JPanel();
        btnMostrar = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaP = new javax.swing.JTable();
        jpModificarCli = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        txtCodigoM = new javax.swing.JTextField();
        btnActualizar1 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txtNombreREmp1 = new javax.swing.JTextField();
        txtUsuarioREmp3 = new javax.swing.JTextField();
        txtUsuarioREmp4 = new javax.swing.JTextField();
        txtUsuarioREmp5 = new javax.swing.JTextField();
        btnAgregar1 = new javax.swing.JButton();
        jpEliminarCli = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        txtCodigoM1 = new javax.swing.JTextField();
        btnActualizar2 = new javax.swing.JButton();
        btnMantSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel5.setBackground(new java.awt.Color(0, 204, 255));
        jPanel5.setPreferredSize(new java.awt.Dimension(860, 500));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("MANTENIMIENTO DE PROVEEDORES");
        jPanel5.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 30, 680, 30));

        jTabbedPane1.setBackground(new java.awt.Color(255, 255, 255));
        jTabbedPane1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTabbedPane1.setMaximumSize(new java.awt.Dimension(840, 460));
        jTabbedPane1.setMinimumSize(new java.awt.Dimension(840, 460));
        jTabbedPane1.setPreferredSize(new java.awt.Dimension(840, 460));

        jpRegistrarCli.setBackground(new java.awt.Color(0, 204, 255));
        jpRegistrarCli.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jpRegistrarCli.setPreferredSize(new java.awt.Dimension(840, 440));
        jpRegistrarCli.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("R.U.C.:");
        jpRegistrarCli.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 60, 240, 30));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("NOMBRE:");
        jpRegistrarCli.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, 280, 30));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("TELEFONO:");
        jpRegistrarCli.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 140, 220, 30));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("DIRECCIÓN:");
        jpRegistrarCli.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 186, 190, 30));

        txtNombreREmp.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jpRegistrarCli.add(txtNombreREmp, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 60, 200, 30));

        txtUsuarioREmp.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jpRegistrarCli.add(txtUsuarioREmp, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 140, 200, 30));

        btnAgregar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnAgregar.setText("REGISTRAR ");
        jpRegistrarCli.add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 260, 200, 40));

        btnNuevo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnNuevo.setText("LIMPIAR CAMPOS");
        jpRegistrarCli.add(btnNuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 260, 200, 40));

        txtUsuarioREmp1.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jpRegistrarCli.add(txtUsuarioREmp1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 100, 360, 30));

        txtUsuarioREmp2.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jpRegistrarCli.add(txtUsuarioREmp2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 186, 300, 30));

        jTabbedPane1.addTab("REGISTRAR", jpRegistrarCli);

        jpConsultarCli.setBackground(new java.awt.Color(0, 204, 255));
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

        tablaP.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "RUC", "NOMBRE", "TELÉFONO", "DIRECCIÓN"
            }
        ));
        jScrollPane1.setViewportView(tablaP);

        jpConsultarCli.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 780, 270));

        jTabbedPane1.addTab("CONSULTAR", jpConsultarCli);

        jpModificarCli.setBackground(new java.awt.Color(0, 204, 255));
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

        jSeparator1.setForeground(new java.awt.Color(255, 0, 0));
        jpModificarCli.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, 740, 10));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel11.setText("R.U.C.:");
        jpModificarCli.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 110, 240, 30));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel12.setText("NOMBRE:");
        jpModificarCli.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, 280, 30));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel13.setText("TELEFONO:");
        jpModificarCli.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 190, 220, 30));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel14.setText("DIRECCIÓN:");
        jpModificarCli.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 240, 190, 30));

        txtNombreREmp1.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jpModificarCli.add(txtNombreREmp1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 110, 200, 30));

        txtUsuarioREmp3.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jpModificarCli.add(txtUsuarioREmp3, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 190, 200, 30));

        txtUsuarioREmp4.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jpModificarCli.add(txtUsuarioREmp4, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 150, 360, 30));

        txtUsuarioREmp5.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jpModificarCli.add(txtUsuarioREmp5, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 240, 300, 30));

        btnAgregar1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnAgregar1.setText("ACTUALIZAR DATOS");
        jpModificarCli.add(btnAgregar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 300, 200, 40));

        jTabbedPane1.addTab("MODIFICAR", jpModificarCli);

        jpEliminarCli.setBackground(new java.awt.Color(0, 204, 255));
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

        jPanel5.add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 840, 400));

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
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
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
            java.util.logging.Logger.getLogger(VProveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VProveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VProveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VProveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VProveedor().setVisible(true);
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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
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
    private javax.swing.JTable tablaP;
    private javax.swing.JTextField txtCodigoM;
    private javax.swing.JTextField txtCodigoM1;
    private javax.swing.JTextField txtNombreREmp;
    private javax.swing.JTextField txtNombreREmp1;
    private javax.swing.JTextField txtUsuarioREmp;
    private javax.swing.JTextField txtUsuarioREmp1;
    private javax.swing.JTextField txtUsuarioREmp2;
    private javax.swing.JTextField txtUsuarioREmp3;
    private javax.swing.JTextField txtUsuarioREmp4;
    private javax.swing.JTextField txtUsuarioREmp5;
    // End of variables declaration//GEN-END:variables
}
