/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.code.vista.administracion;

import app.code.controlador.administracion.ControladorPantalla;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author JuancUyaguari
 */
public class ListaPantallas extends javax.swing.JPanel {
    
    private final ControladorPantalla controladorPantalla;
    private final DefaultTableModel modelTablaPantallas;
    private boolean cargarLista;
    /**
     * Creates new form vistaPantallas
     */
    public ListaPantallas(ControladorPantalla controladorPantalla) {
        initComponents();
        this.controladorPantalla = controladorPantalla;
        
        this.cargarLista = false;
        pgbCargador.setVisible(true);
        pgbCargador.setIndeterminate(this.cargarLista);
        pgbCargador.setStringPainted(this.cargarLista);
        pgbCargador.setString("Cargango..");
        
        modelTablaPantallas = (DefaultTableModel)jtableListarPantallas.getModel();
    }
    
    private void listarPantallas(){
//        this.cargarLista = true;
//        CompletableFuture.supplyAsync(()-> { 
//            return registroGeneral.obt
//        }).thenAccept({})
        
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpnFooter = new javax.swing.JPanel();
        sep3 = new javax.swing.JSeparator();
        pgbCargador = new javax.swing.JProgressBar();
        paginador1 = new app.code.common.Paginador();
        jpnHead2 = new javax.swing.JPanel();
        sep6 = new javax.swing.JSeparator();
        txtBuscarC2 = new javax.swing.JTextField();
        btnBuscarC2 = new javax.swing.JButton();
        btnActualizarTabla2 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        btnCrearCatalogo2 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtableListarPantallas = new javax.swing.JTable();
        sep7 = new javax.swing.JSeparator();

        jpnFooter.setBackground(new java.awt.Color(210, 228, 238));

        sep3.setForeground(new java.awt.Color(204, 204, 204));
        sep3.setOrientation(javax.swing.SwingConstants.VERTICAL);

        javax.swing.GroupLayout jpnFooterLayout = new javax.swing.GroupLayout(jpnFooter);
        jpnFooter.setLayout(jpnFooterLayout);
        jpnFooterLayout.setHorizontalGroup(
            jpnFooterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnFooterLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(sep3, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(paginador1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 528, Short.MAX_VALUE)
                .addComponent(pgbCargador, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6))
        );
        jpnFooterLayout.setVerticalGroup(
            jpnFooterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(sep3)
            .addGroup(jpnFooterLayout.createSequentialGroup()
                .addComponent(paginador1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jpnFooterLayout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(pgbCargador, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8))
        );

        jpnHead2.setBackground(new java.awt.Color(210, 228, 238));

        sep6.setForeground(new java.awt.Color(204, 204, 204));
        sep6.setOrientation(javax.swing.SwingConstants.VERTICAL);

        txtBuscarC2.setFont(new java.awt.Font("Tw Cen MT", 0, 12)); // NOI18N
        txtBuscarC2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscarC2KeyReleased(evt);
            }
        });

        btnBuscarC2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/app/resource/imagen/search.png"))); // NOI18N
        btnBuscarC2.setToolTipText("");
        btnBuscarC2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        btnBuscarC2.setContentAreaFilled(false);
        btnBuscarC2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnBuscarC2.setFocusPainted(false);
        btnBuscarC2.setRequestFocusEnabled(false);
        btnBuscarC2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarC2ActionPerformed(evt);
            }
        });

        btnActualizarTabla2.setText("+");
        btnActualizarTabla2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarTabla2ActionPerformed(evt);
            }
        });

        jButton5.setText("+");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        btnCrearCatalogo2.setText("+");
        btnCrearCatalogo2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearCatalogo2ActionPerformed(evt);
            }
        });

        jtableListarPantallas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "#", "Codigo", "Nombre", "Ruta Acceso", "Descripcion", "Accion"
            }
        ));
        jScrollPane1.setViewportView(jtableListarPantallas);

        sep7.setForeground(new java.awt.Color(204, 204, 204));
        sep7.setOrientation(javax.swing.SwingConstants.VERTICAL);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(sep7, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(sep7, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 16, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout jpnHead2Layout = new javax.swing.GroupLayout(jpnHead2);
        jpnHead2.setLayout(jpnHead2Layout);
        jpnHead2Layout.setHorizontalGroup(
            jpnHead2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnHead2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(sep6, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnBuscarC2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(txtBuscarC2, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 330, Short.MAX_VALUE)
                .addComponent(btnActualizarTabla2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(btnCrearCatalogo2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jpnHead2Layout.setVerticalGroup(
            jpnHead2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnHead2Layout.createSequentialGroup()
                .addGroup(jpnHead2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpnHead2Layout.createSequentialGroup()
                        .addComponent(sep6)
                        .addGap(3, 3, 3))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnHead2Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(jpnHead2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtBuscarC2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                            .addGroup(jpnHead2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(btnActualizarTabla2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnCrearCatalogo2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnBuscarC2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpnHead2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jpnFooter, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jpnHead2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addComponent(jpnFooter, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtBuscarC2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarC2KeyReleased
        //        if (cbxBuscarC.getSelectedIndex() == 0) {
            //                listarN(controlU.listaCbuscar(txtBuscarC.getText()));
            //                if (modelL.getSize() > 0) {
                //                    listaNombresC.setSelectedIndex(0);
                //                }
            //            }
    }//GEN-LAST:event_txtBuscarC2KeyReleased

    private void btnBuscarC2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarC2ActionPerformed

    }//GEN-LAST:event_btnBuscarC2ActionPerformed

    private void btnActualizarTabla2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarTabla2ActionPerformed

    }//GEN-LAST:event_btnActualizarTabla2ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void btnCrearCatalogo2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearCatalogo2ActionPerformed

    }//GEN-LAST:event_btnCrearCatalogo2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizarTabla2;
    private javax.swing.JButton btnBuscarC2;
    private javax.swing.JButton btnCrearCatalogo2;
    private javax.swing.JButton jButton5;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel jpnFooter;
    private javax.swing.JPanel jpnHead2;
    private javax.swing.JTable jtableListarPantallas;
    private app.code.common.Paginador paginador1;
    private javax.swing.JProgressBar pgbCargador;
    private javax.swing.JSeparator sep3;
    private javax.swing.JSeparator sep6;
    private javax.swing.JSeparator sep7;
    private javax.swing.JTextField txtBuscarC2;
    // End of variables declaration//GEN-END:variables
}
