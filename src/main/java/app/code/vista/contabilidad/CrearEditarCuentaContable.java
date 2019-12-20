/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.code.vista.contabilidad;

import app.code.common.GeneralExeption;
import app.code.controlador.contabilidad.ControladorCuentaContable;
import app.code.modelo.contabilidad.CuentaContable;
import java.awt.Color;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

/**
 *
 * @author fanny
 */
public class CrearEditarCuentaContable extends javax.swing.JFrame {

    private final ControladorCuentaContable controladorCuentaContable;
    private final DefaultComboBoxModel<CuentaContable> modelComboTipo;
    private int op;
    private boolean cargarLista;
    
    
     /**
     * Consructor de formulario crear/editar Catlogo
     * @param esEditar
     * @param registroGeneral 
     */
    
    public CrearEditarCuentaContable(boolean esEditar, ControladorCuentaContable controladorCuentaContable) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.controladorCuentaContable = controladorCuentaContable;
        //this.registroGeneral = this.registroGeneral;
        modelComboTipo = (DefaultComboBoxModel) cbxTipoCuenta.getModel();
        /*
          this.setLocationRelativeTo(null);
        this.registroGeneral = registroGeneral;
        // Agrega los tipos de catalogo
        modelComboTipo = (DefaultComboBoxModel) cbxTipoCat.getModel();
        this.cargargDataInicial();
        */
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnSaveC = new javax.swing.JButton();
        sep1 = new javax.swing.JSeparator();
        lblT5 = new javax.swing.JLabel();
        sep3 = new javax.swing.JSeparator();
        txtEsTotal = new javax.swing.JTextField();
        lblT1 = new javax.swing.JLabel();
        cbxTipoCuenta = new javax.swing.JComboBox<>();
        lblT2 = new javax.swing.JLabel();
        chxC1 = new javax.swing.JCheckBox();
        lblT3 = new javax.swing.JLabel();
        lblT4 = new javax.swing.JLabel();
        txtDescripcion = new javax.swing.JTextField();
        btnCleanC = new javax.swing.JButton();
        lblTituloC1 = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        chxC2 = new javax.swing.JCheckBox();
        txtNombre = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

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

        lblT5.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        lblT5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblT5.setText("ES_TOTAL");

        txtEsTotal.setFont(new java.awt.Font("Trebuchet MS", 1, 11)); // NOI18N

        lblT1.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        lblT1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblT1.setText(" CODIGO:");

        lblT2.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        lblT2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblT2.setText(" NOMBRE:");
        lblT2.setToolTipText("");

        chxC1.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        chxC1.setForeground(new java.awt.Color(6, 52, 74));
        chxC1.setSelected(true);
        chxC1.setText("Activo");
        chxC1.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        chxC1.setRequestFocusEnabled(false);

        lblT3.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        lblT3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblT3.setText(" DESCRIPCION:");

        lblT4.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        lblT4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblT4.setText(" TIPO:");

        txtDescripcion.setFont(new java.awt.Font("Trebuchet MS", 1, 11)); // NOI18N

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

        lblTituloC1.setFont(new java.awt.Font("Yu Gothic Light", 1, 18)); // NOI18N
        lblTituloC1.setForeground(new java.awt.Color(0, 51, 102));
        lblTituloC1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblTituloC1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/app/resource/imagen/linea.png"))); // NOI18N
        lblTituloC1.setText("CREAR CUENTA CONTABLE");

        txtCodigo.setFont(new java.awt.Font("Trebuchet MS", 1, 11)); // NOI18N

        chxC2.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        chxC2.setForeground(new java.awt.Color(6, 52, 74));
        chxC2.setText("Segir en la ventana despues de Guardar Datos ");
        chxC2.setRequestFocusEnabled(false);
        chxC2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chxC2ActionPerformed(evt);
            }
        });

        txtNombre.setFont(new java.awt.Font("Trebuchet MS", 1, 11)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sep1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblTituloC1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCleanC, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(sep3)
                    .addComponent(chxC2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(214, 214, 214)
                                .addComponent(btnSaveC, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(lblT4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblT3, javax.swing.GroupLayout.DEFAULT_SIZE, 82, Short.MAX_VALUE)
                                    .addComponent(lblT2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblT1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(63, 63, 63)
                                        .addComponent(chxC1))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                                        .addComponent(cbxTipoCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(12, 12, 12)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtDescripcion, javax.swing.GroupLayout.DEFAULT_SIZE, 268, Short.MAX_VALUE)
                                            .addComponent(txtNombre)))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblT5, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtEsTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 14, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblTituloC1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCleanC, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sep1, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(chxC1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblT1, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblT2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblT3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblT5, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEsTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                        .addComponent(lblT4, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(cbxTipoCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)))
                .addComponent(sep3, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(chxC2)
                .addGap(9, 9, 9)
                .addComponent(btnSaveC, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSaveCMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSaveCMouseEntered
        if (btnSaveC.isEnabled()) {
            btnSaveC.setForeground(Color.WHITE.white);
            btnSaveC.setOpaque(true);
        }
    }//GEN-LAST:event_btnSaveCMouseEntered

    private void btnSaveCMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSaveCMouseExited
        if (btnSaveC.isEnabled()) {
            btnSaveC.setForeground(Color.black);
            btnSaveC.setOpaque(false);
        }
    }//GEN-LAST:event_btnSaveCMouseExited

    private void btnSaveCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveCActionPerformed
        if (txtNombre.getText().trim().isEmpty() ||
            txtDescripcion.getText().trim().isEmpty() ||
            txtCodigo.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Asegurese de llenar todos los datos antes de guardar.", " AVISO", JOptionPane.HEIGHT);
        } else {
             crearCuentaContable();
        }
    }//GEN-LAST:event_btnSaveCActionPerformed

    
    private void crearCuentaContable() {
        CuentaContable  cuenta = new CuentaContable();
        cuenta.setCodigo(txtCodigo.getText().trim());
        cuenta.setNombre(txtNombre.getText().trim());
        cuenta.setDescripcion(txtDescripcion.getText().trim());
        cuenta.setEsTotal(Boolean.valueOf(txtEsTotal.getText().trim()));
        //cuenta.setCuentaPadre(modelComboTipo.getElementAt(cbxTipoCuenta.getSelectedIndex()));
//        try{
//            
//          //  RegistroGeneral.guaradarCuentaContable(cuenta);
//            JOptionPane.showMessageDialog(null, "Cuenta Contable agreagdo satisfactoriamente!", "INFO", JOptionPane.INFORMATION_MESSAGE);
//            limpiar();
//            if (!chxC2.isSelected()){
//                dispose();
//            }
//        }catch (GeneralExeption ex){
//            JOptionPane.showMessageDialog(null, ex.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
//        }
// 
    }

    public void limpiar() {
        txtCodigo.setText("");
        txtNombre.setText("");
        txtDescripcion.setText("");
        txtEsTotal.setText("");
    }
    
    private void btnCleanCMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCleanCMouseEntered
        btnCleanC.setOpaque(true);
    }//GEN-LAST:event_btnCleanCMouseEntered

    private void btnCleanCMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCleanCMouseExited
        btnCleanC.setOpaque(false);
    }//GEN-LAST:event_btnCleanCMouseExited

    private void btnCleanCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCleanCActionPerformed
        limpiar();
    }//GEN-LAST:event_btnCleanCActionPerformed

    private void chxC2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chxC2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chxC2ActionPerformed

   
    /**
     * @param args the command line arguments
     */
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCleanC;
    private javax.swing.JButton btnSaveC;
    private javax.swing.JComboBox<String> cbxTipoCuenta;
    private javax.swing.JCheckBox chxC1;
    private javax.swing.JCheckBox chxC2;
    private javax.swing.JLabel lblT1;
    private javax.swing.JLabel lblT2;
    private javax.swing.JLabel lblT3;
    private javax.swing.JLabel lblT4;
    private javax.swing.JLabel lblT5;
    private javax.swing.JLabel lblTituloC1;
    private javax.swing.JSeparator sep1;
    private javax.swing.JSeparator sep3;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtDescripcion;
    private javax.swing.JTextField txtEsTotal;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
