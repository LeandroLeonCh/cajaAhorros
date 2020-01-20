/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.code.vista.administracion;

/**
 *
 * @author JuancUyaguari
 */
public class CrearEditarPantalla extends javax.swing.JPanel {

    /**
     * Creates new form CrearEditarPantalla
     */
    public CrearEditarPantalla() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTituloC = new javax.swing.JLabel();
        btnCleanC = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        chxC2 = new javax.swing.JCheckBox();
        btnSaveC = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        chxC1 = new javax.swing.JCheckBox();
        txtCodPantalla = new javax.swing.JTextField();
        txtNombrePant = new javax.swing.JTextField();
        txtRutaAccesoPant = new javax.swing.JTextField();
        txtDescripcionPant = new javax.swing.JTextField();

        lblTituloC.setFont(new java.awt.Font("Yu Gothic Light", 1, 18)); // NOI18N
        lblTituloC.setForeground(new java.awt.Color(0, 51, 102));
        lblTituloC.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblTituloC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/app/resource/imagen/linea.png"))); // NOI18N
        lblTituloC.setText("CREAR PANTALLA");

        btnCleanC.setBackground(new java.awt.Color(204, 204, 204));
        btnCleanC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/app/resource/imagen/borrar.png"))); // NOI18N
        btnCleanC.setToolTipText("Cancelar Transaccion");
        btnCleanC.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        btnCleanC.setContentAreaFilled(false);
        btnCleanC.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnCleanC.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCleanC.setRequestFocusEnabled(false);
        btnCleanC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnCleanCMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCleanCMouseExited(evt);
            }
        });
        btnCleanC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCleanCActionPerformed(evt);
            }
        });

        chxC2.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        chxC2.setForeground(new java.awt.Color(6, 52, 74));
        chxC2.setText("Segir en la ventana despues de Guardar Datos ");
        chxC2.setRequestFocusEnabled(false);

        btnSaveC.setBackground(new java.awt.Color(0, 102, 153));
        btnSaveC.setFont(new java.awt.Font("Tw Cen MT", 0, 12)); // NOI18N
        btnSaveC.setText("GUARDAR");
        btnSaveC.setToolTipText("Realizar Nueva Transaccion para\\n\nel CLiente");
        btnSaveC.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        btnSaveC.setContentAreaFilled(false);
        btnSaveC.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnSaveC.setRequestFocusEnabled(false);
        btnSaveC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnSaveCMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnSaveCMouseExited(evt);
            }
        });
        btnSaveC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveCActionPerformed(evt);
            }
        });

        jLabel1.setText("CODIGO:");

        jLabel2.setText("NOMBRE:");

        jLabel3.setText("RUTA ACCESO:");

        jLabel4.setText("DESCRIPCION:");

        chxC1.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        chxC1.setForeground(new java.awt.Color(6, 52, 74));
        chxC1.setSelected(true);
        chxC1.setText("Activo");
        chxC1.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        chxC1.setRequestFocusEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jSeparator2)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(btnSaveC, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(chxC2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jSeparator1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblTituloC, javax.swing.GroupLayout.DEFAULT_SIZE, 308, Short.MAX_VALUE)
                                .addGap(33, 33, 33)
                                .addComponent(btnCleanC, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(chxC1))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(txtCodPantalla, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(txtNombrePant, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, Short.MAX_VALUE))
                                            .addComponent(txtDescripcionPant, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(txtRutaAccesoPant))))))
                        .addGap(21, 21, 21))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCleanC, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTituloC, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(chxC1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(txtCodPantalla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNombrePant, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtRutaAccesoPant, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtDescripcionPant, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chxC2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSaveC, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnCleanCMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCleanCMouseEntered
        btnCleanC.setOpaque(true);
    }//GEN-LAST:event_btnCleanCMouseEntered

    private void btnCleanCMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCleanCMouseExited
        btnCleanC.setOpaque(false);
    }//GEN-LAST:event_btnCleanCMouseExited

    private void btnCleanCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCleanCActionPerformed
       
    }//GEN-LAST:event_btnCleanCActionPerformed

    private void btnSaveCMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSaveCMouseEntered
//        if (btnSaveC.isEnabled()) {
//            btnSaveC.setForeground(Color.white);
//            btnSaveC.setOpaque(true);
//        }
    }//GEN-LAST:event_btnSaveCMouseEntered

    private void btnSaveCMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSaveCMouseExited
//        if (btnSaveC.isEnabled()) {
//            btnSaveC.setForeground(Color.black);
//            btnSaveC.setOpaque(false);
//        }
    }//GEN-LAST:event_btnSaveCMouseExited

    private void btnSaveCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveCActionPerformed
//        if (txtNombreCat.getText().trim().isEmpty() ||
//            txtDescripcionCat.getText().trim().isEmpty() ||
//            txtCodigoCat.getText().trim().isEmpty()) {
//            JOptionPane.showMessageDialog(null, "Asegurese de llenar todos los datos antes de guardar.", " AVISO", JOptionPane.HEIGHT);
//        } else {
//            crearCliente();
//        }
    }//GEN-LAST:event_btnSaveCActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCleanC;
    private javax.swing.JButton btnSaveC;
    private javax.swing.JCheckBox chxC1;
    private javax.swing.JCheckBox chxC2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lblTituloC;
    private javax.swing.JTextField txtCodPantalla;
    private javax.swing.JTextField txtDescripcionPant;
    private javax.swing.JTextField txtNombrePant;
    private javax.swing.JTextField txtRutaAccesoPant;
    // End of variables declaration//GEN-END:variables
}
