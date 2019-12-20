/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.code.vista;

import app.code.common.TituloTab;
import app.code.controlador.ControladorFactory;
import app.code.vista.administracion.ListaPantallas;
import app.code.vista.contabilidad.ListaCuentaContable;
import app.code.vista.general.ListaCatalogos;
import app.code.vista.administracion.ListaUsuario;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JFrame;

/**
 *
 * @author Carlos
 */
public class Vista extends javax.swing.JFrame {

    // Declara las variables de interfaz   
    private final Map<Integer, Integer> listaIndices;

    // Declarar variables de datos;
    private final ControladorFactory controladorFactory;

    /**
     * Creates new form Vista
     */
    public Vista() {
        Vista.this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        initComponents();
        
        listaIndices = new HashMap<>();
        this.setLocationRelativeTo(null);
        this.controladorFactory = ControladorFactory.getInstancia();

    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        herramietas = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        panelOpciones = new javax.swing.JPanel();
        lblNavegador = new javax.swing.JLabel();
        lblTM1 = new javax.swing.JLabel();
        btnCatalogos = new javax.swing.JButton();
        btnUsuarios = new javax.swing.JButton();
        btnPantallas = new javax.swing.JButton();
        btnCuentasContables = new javax.swing.JButton();
        lblTM2 = new javax.swing.JLabel();
        lblTM3 = new javax.swing.JLabel();
        PanelPestania = new javax.swing.JTabbedPane();
        PanelInicio = new javax.swing.JPanel();
        menu = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        herramietas.setBackground(new java.awt.Color(177, 175, 175));
        herramietas.setToolTipText("");
        herramietas.setComponentPopupMenu(menu.getComponentPopupMenu());
        herramietas.setPreferredSize(new java.awt.Dimension(734, 40));

        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout herramietasLayout = new javax.swing.GroupLayout(herramietas);
        herramietas.setLayout(herramietasLayout);
        herramietasLayout.setHorizontalGroup(
            herramietasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, herramietasLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        herramietasLayout.setVerticalGroup(
            herramietasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(herramietasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        panelOpciones.setBackground(new java.awt.Color(88, 87, 87));
        panelOpciones.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(203, 200, 200)));

        lblNavegador.setBackground(new java.awt.Color(177, 175, 175));
        lblNavegador.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblNavegador.setForeground(new java.awt.Color(51, 51, 51));
        lblNavegador.setText("  N A V E G A D O R ");
        lblNavegador.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(203, 200, 200)));
        lblNavegador.setOpaque(true);

        lblTM1.setFont(new java.awt.Font("Yu Gothic Medium", 1, 12)); // NOI18N
        lblTM1.setForeground(new java.awt.Color(153, 153, 153));
        lblTM1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/app/resource/imagen/linea.png"))); // NOI18N
        lblTM1.setText("GENERAL");

        btnCatalogos.setBackground(new java.awt.Color(204, 204, 204));
        btnCatalogos.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        btnCatalogos.setForeground(new java.awt.Color(202, 202, 202));
        btnCatalogos.setText("CATALAGOS");
        btnCatalogos.setContentAreaFilled(false);
        btnCatalogos.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnCatalogos.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        btnCatalogos.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnCatalogos.setRequestFocusEnabled(false);
        btnCatalogos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnCatalogosMouseEntered(evt);
            }
        });
        btnCatalogos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCatalogosActionPerformed(evt);
            }
        });

        btnUsuarios.setBackground(new java.awt.Color(204, 204, 204));
        btnUsuarios.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        btnUsuarios.setForeground(new java.awt.Color(202, 202, 202));
        btnUsuarios.setText("USUARIOS");
        btnUsuarios.setContentAreaFilled(false);
        btnUsuarios.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnUsuarios.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        btnUsuarios.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnUsuarios.setRequestFocusEnabled(false);
        btnUsuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnUsuariosMouseEntered(evt);
            }
        });
        btnUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUsuariosActionPerformed(evt);
            }
        });

        btnPantallas.setBackground(new java.awt.Color(204, 204, 204));
        btnPantallas.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        btnPantallas.setForeground(new java.awt.Color(202, 202, 202));
        btnPantallas.setText("PANTALLAS");
        btnPantallas.setContentAreaFilled(false);
        btnPantallas.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnPantallas.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        btnPantallas.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnPantallas.setRequestFocusEnabled(false);
        btnPantallas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnPantallasMouseEntered(evt);
            }
        });
        btnPantallas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPantallasActionPerformed(evt);
            }
        });

        btnCuentasContables.setBackground(new java.awt.Color(204, 204, 204));
        btnCuentasContables.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        btnCuentasContables.setForeground(new java.awt.Color(202, 202, 202));
        btnCuentasContables.setText("CUENTAS CONTABLES");
        btnCuentasContables.setContentAreaFilled(false);
        btnCuentasContables.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnCuentasContables.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        btnCuentasContables.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnCuentasContables.setRequestFocusEnabled(false);
        btnCuentasContables.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnCuentasContablesMouseEntered(evt);
            }
        });
        btnCuentasContables.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCuentasContablesActionPerformed(evt);
            }
        });

        lblTM2.setFont(new java.awt.Font("Yu Gothic Medium", 1, 12)); // NOI18N
        lblTM2.setForeground(new java.awt.Color(153, 153, 153));
        lblTM2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/app/resource/imagen/linea.png"))); // NOI18N
        lblTM2.setText("ADMINISTRACION");

        lblTM3.setFont(new java.awt.Font("Yu Gothic Medium", 1, 12)); // NOI18N
        lblTM3.setForeground(new java.awt.Color(153, 153, 153));
        lblTM3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/app/resource/imagen/linea.png"))); // NOI18N
        lblTM3.setText("CONTABILIDAD");

        javax.swing.GroupLayout panelOpcionesLayout = new javax.swing.GroupLayout(panelOpciones);
        panelOpciones.setLayout(panelOpcionesLayout);
        panelOpcionesLayout.setHorizontalGroup(
            panelOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelOpcionesLayout.createSequentialGroup()
                .addComponent(lblNavegador, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(panelOpcionesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelOpcionesLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(btnCuentasContables, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(lblTM3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panelOpcionesLayout.createSequentialGroup()
                        .addGroup(panelOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelOpcionesLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(btnCatalogos, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(lblTM1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelOpcionesLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(panelOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnPantallas, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(lblTM2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())))
        );
        panelOpcionesLayout.setVerticalGroup(
            panelOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelOpcionesLayout.createSequentialGroup()
                .addComponent(lblNavegador, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(lblTM1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCatalogos, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(lblTM2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnPantallas, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblTM3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnCuentasContables, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        PanelPestania.setBackground(new java.awt.Color(204, 204, 204));
        PanelPestania.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(203, 200, 200)));
        PanelPestania.setForeground(new java.awt.Color(51, 51, 51));
        PanelPestania.setTabLayoutPolicy(javax.swing.JTabbedPane.SCROLL_TAB_LAYOUT);
        PanelPestania.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 18)); // NOI18N
        PanelPestania.setOpaque(true);
        PanelPestania.setRequestFocusEnabled(false);

        PanelInicio.setBackground(new java.awt.Color(255, 255, 255));
        PanelInicio.setEnabled(false);

        javax.swing.GroupLayout PanelInicioLayout = new javax.swing.GroupLayout(PanelInicio);
        PanelInicio.setLayout(PanelInicioLayout);
        PanelInicioLayout.setHorizontalGroup(
            PanelInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 810, Short.MAX_VALUE)
        );
        PanelInicioLayout.setVerticalGroup(
            PanelInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 601, Short.MAX_VALUE)
        );

        PanelPestania.addTab("  INICIO  ", PanelInicio);

        menu.setBackground(new java.awt.Color(153, 153, 153));
        menu.setBorderPainted(false);

        jMenu1.setText("Archivo");

        jMenuItem1.setText("jMenuItem1");
        jMenu1.add(jMenuItem1);
        jMenu1.add(jSeparator1);

        jMenuItem2.setText("jMenuItem2");
        jMenu1.add(jMenuItem2);

        jMenuItem3.setText("jMenuItem3");
        jMenu1.add(jMenuItem3);

        menu.add(jMenu1);

        jMenu2.setText("Edit");
        menu.add(jMenu2);

        setJMenuBar(menu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(panelOpciones, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(PanelPestania)
                .addGap(5, 5, 5))
            .addComponent(herramietas, javax.swing.GroupLayout.DEFAULT_SIZE, 1092, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(herramietas, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelOpciones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(PanelPestania))
                .addGap(5, 5, 5))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        try {
                Thread.sleep(2);
            } catch (InterruptedException e) {
            }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        System.out.println(System.lineSeparator());
    }//GEN-LAST:event_formWindowOpened

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        System.out.println("adios");
    }//GEN-LAST:event_formWindowClosed

    private void btnCatalogosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCatalogosMouseEntered
        btnCatalogos.setOpaque(true);
        btnCatalogos.setForeground(Color.BLACK);
    }//GEN-LAST:event_btnCatalogosMouseEntered

    private void btnCatalogosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCatalogosActionPerformed
        PanelPestania.addTab("", new ListaCatalogos(this.controladorFactory.GENERAL));
        TituloTab titulo = new TituloTab("  CATALOGOS  ");
        titulo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                PanelPestania.remove(PanelPestania.indexOfTabComponent(titulo));
            }
        });
        PanelPestania.setTabComponentAt(PanelPestania.getTabCount() - 1, titulo);
    }//GEN-LAST:event_btnCatalogosActionPerformed

    private void btnUsuariosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUsuariosMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btnUsuariosMouseEntered

    private void btnUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUsuariosActionPerformed
        // TODO add your handling code here:
        PanelPestania.addTab("", new ListaUsuario(this.controladorFactory.ADMINISTRACION.getControladorUsuario()));
        TituloTab titulo = new TituloTab("  USUARIOS  ");
        titulo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                PanelPestania.remove(PanelPestania.indexOfTabComponent(titulo));
            }
        });
        PanelPestania.setTabComponentAt(PanelPestania.getTabCount() - 1, titulo);        
    }//GEN-LAST:event_btnUsuariosActionPerformed

    private void btnPantallasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPantallasMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btnPantallasMouseEntered

    private void btnPantallasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPantallasActionPerformed
         PanelPestania.addTab("", new ListaPantallas(this.controladorFactory.ADMINISTRACION.getControladorPantalla()));
        TituloTab titulo = new TituloTab("  CUENTAS_CONTABLES  ");
        titulo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                PanelPestania.remove(PanelPestania.indexOfTabComponent(titulo));
            }
        });
        PanelPestania.setTabComponentAt(PanelPestania.getTabCount() - 1, titulo);
    }//GEN-LAST:event_btnPantallasActionPerformed

    private void btnCuentasContablesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCuentasContablesMouseEntered
         btnPantallas.setOpaque(true);
        btnPantallas.setForeground(Color.BLACK);
    }//GEN-LAST:event_btnCuentasContablesMouseEntered

    private void btnCuentasContablesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCuentasContablesActionPerformed
        PanelPestania.addTab("", new ListaCuentaContable(this.controladorFactory.CONTABILIDAD.getControladorCuentaContable()));
        TituloTab titulo = new TituloTab("  CUENTAS_CONTABLES  ");
        titulo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                PanelPestania.remove(PanelPestania.indexOfTabComponent(titulo));
            }
        });
        PanelPestania.setTabComponentAt(PanelPestania.getTabCount() - 1, titulo);// TODO add your handling code here:
    }//GEN-LAST:event_btnCuentasContablesActionPerformed

    public void cerrarVentana(int v) {
        if(listaIndices.get(v) != null){
        PanelPestania.remove(listaIndices.get(v));
        listaIndices.remove(v);
        }
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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Vista().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelInicio;
    private javax.swing.JTabbedPane PanelPestania;
    private javax.swing.JButton btnCatalogos;
    private javax.swing.JButton btnCuentasContables;
    private javax.swing.JButton btnPantallas;
    private javax.swing.JButton btnUsuarios;
    private javax.swing.JPanel herramietas;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JLabel lblNavegador;
    private javax.swing.JLabel lblTM1;
    private javax.swing.JLabel lblTM2;
    private javax.swing.JLabel lblTM3;
    private javax.swing.JMenuBar menu;
    private javax.swing.JPanel panelOpciones;
    // End of variables declaration//GEN-END:variables
}
