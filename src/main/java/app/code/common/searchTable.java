/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.code.common;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.LayoutStyle;

/**
 *
 * @author Carlos
 */
public class searchTable extends JPanel {
    
    private final JTextField txtBuscar;
    private final JButton btnBuscar;
    private IEventCostomSearch accion;
    
    public searchTable() {
        txtBuscar = new JTextField();
        btnBuscar = new JButton();
        this.inicializar();
    }
    
    
    private void inicializar(){
        this.setBackground(new Color(204, 204, 204));
        
        txtBuscar.setBackground(this.getBackground());
        txtBuscar.setFont(new Font("Trebuchet MS", 0, 13)); // NOI18N
        txtBuscar.setBorder(null);
        txtBuscar.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent ke) {
                if (ke.getKeyCode() == 10){
                    accion.ejecutar(txtBuscar.getText());
                }
            }
        });

        btnBuscar.setIcon(new ImageIcon(getClass()
                .getResource("/app/resource/imagen/search.png"))
        ); // NOI18N
        btnBuscar.setBorder(null);
        btnBuscar.setContentAreaFilled(false);
        btnBuscar.setCursor(new Cursor(Cursor.HAND_CURSOR));
        btnBuscar.setFocusPainted(false);
        btnBuscar.setRequestFocusEnabled(false);
        btnBuscar.addActionListener((ev) -> {
            accion.ejecutar(txtBuscar.getText()); 
        });
        btnBuscar.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent me) {
                btnBuscar.setOpaque(true);
            }
            @Override
            public void mouseExited(MouseEvent me) {
                btnBuscar.setOpaque(false);
            }
        });
        GroupLayout pnlBuscadorLayout = new GroupLayout(this);
        this.setLayout(pnlBuscadorLayout);
        pnlBuscadorLayout.setHorizontalGroup(
            pnlBuscadorLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(pnlBuscadorLayout.createSequentialGroup()
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtBuscar, GroupLayout.PREFERRED_SIZE, 299, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnBuscar, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE))
        );
        pnlBuscadorLayout.setVerticalGroup(
            pnlBuscadorLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(pnlBuscadorLayout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(txtBuscar, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))
            .addComponent(btnBuscar, GroupLayout.Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
        );
    }
    
    public void setAccion(IEventCostomSearch accion){
        this.accion = accion;
    }
    
}
