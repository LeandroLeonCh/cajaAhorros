/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.code.common;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Carlos
 */
public class TituloTab extends JPanel{
    
    private final JLabel titulo;
    private JButton botton;
    
    public TituloTab(String titulo){
        // Agrega ek titulo
        this.setOpaque(false);
        this.titulo = new JLabel(titulo);
        this.titulo.setFont(new Font("Tw Cen MT Condensed", 0, 18)); // NOI18N
        this.titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        
        // Agrega el boton
        this.botton = new JButton("X");
        this.botton.setBackground(new Color(204, 204, 204));
        this.botton.setFont(new Font("Tahoma", 1, 11)); // NOI18N
        this.botton.setForeground(new Color(204, 0, 0));
        this.botton.setCursor(new Cursor(Cursor.HAND_CURSOR));
        this.botton.setBorder(null);
        this.botton.setContentAreaFilled(false);
        this.botton.setRequestFocusEnabled(false);
        
        // Agrega los eventos
        this.botton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent evt) {
                botton.setOpaque(true);
            }
            @Override
            public void mouseExited(MouseEvent evt) {
                botton.setOpaque(false);
            }
        });
        
        // Agrega el layout
        GroupLayout layaut = new javax.swing.GroupLayout(this);
        this.setLayout(layaut);
        layaut.setHorizontalGroup(
            layaut.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layaut.createSequentialGroup()
                .addComponent(this.titulo, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(this.botton, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE))
        );
        layaut.setVerticalGroup(
            layaut.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(this.titulo, GroupLayout.PREFERRED_SIZE, 28, Short.MAX_VALUE)
            .addComponent(this.botton, GroupLayout.PREFERRED_SIZE, 28, Short.MAX_VALUE)
        );
    }
    
    public void addActionListener(ActionListener event){
        this.botton.addActionListener(event);
    }
}
