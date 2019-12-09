/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.code.common;

import java.awt.Cursor;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.List;
import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 *
 * @author Carlos
 */
public class Paginador extends JPanel{
    
    public final int MAX_PAGES = 7;
    
    private JButton btnSiguiente;
    private JButton btnAnterior;
    private JPanel content;
    
    private List<JButton> paginas;
    private int pagina;
    private final int dimension;
    
    public Paginador(int paginaDefecto, int paginas){
        this.dimension = (paginas > 7 ? 7 : paginas) * 30;
        this.setOpaque(false);
        this.pagina = paginaDefecto;
        this.setSize(dimension + 68, 34);
        initComponents();
    }
    
    public Paginador(){
        this.dimension = 0;
        this.setOpaque(false);
        this.pagina = 1;
        this.setSize(dimension + 68, 34);
        initComponents();
    }
    
    private void initComponents() {
        // Agrega el layaut al container
        content = new JPanel(new GridLayout());
        content.setOpaque(false);
        // Agrega las imgenes a los botones
        btnAnterior = new JButton(new ImageIcon(getClass()
                .getResource("/app/resource/imagen/left.png")));
        btnAnterior.setCursor(new Cursor(Cursor.HAND_CURSOR));
        btnAnterior.setBorder(null);
        btnAnterior.setContentAreaFilled(false);
        btnAnterior.setRequestFocusEnabled(false);
        btnSiguiente = new JButton(new ImageIcon(getClass()
                .getResource("/app/resource/imagen/right.png")));
        btnSiguiente.setCursor(new Cursor(Cursor.HAND_CURSOR));
        btnSiguiente.setBorder(null);
        btnSiguiente.setContentAreaFilled(false);
        btnSiguiente.setRequestFocusEnabled(false);
        // Agrega los eventos a los botones
        btnAnterior.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                anterior();
            }
        });
        btnSiguiente.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                siguiente();
            }
        });
        btnAnterior.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent evt) {
                btnAnterior.setOpaque(true);
            }
            @Override
            public void mouseExited(MouseEvent evt) {
                btnAnterior.setOpaque(false);
            }
        });
        btnSiguiente.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent evt) {
                btnSiguiente.setOpaque(true);
            }
            @Override
            public void mouseExited(MouseEvent evt) {
                btnSiguiente.setOpaque(false);
            }
        });
        // Agrega el layout
        GroupLayout layout = new GroupLayout(this);
        this.setLayout(layout); 
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(btnAnterior, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(content, GroupLayout.PREFERRED_SIZE, dimension, GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(btnSiguiente, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnAnterior, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnSiguiente, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addComponent(content, GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
                .addGap(2, 2, 2))
        );
    }
    
    private void renderPaginas(){
        this.content.removeAll();
    }
   
    private List<Object> obtenerRango(int desde, int hasta){
        List<Object> rangoPaginas = new ArrayList<>();
        for (int i = desde; i <= hasta; i++) {
            rangoPaginas.add(i);
        }
        return rangoPaginas;
    }
    
    private void anterior(){
        if(this.pagina > 1){
            this.pagina--;
            this.renderPaginas();
        }
    }
    
    private void pagina(int pagina){
        
    }
    
    private void siguiente(){
        JButton BUTTON1 = new JButton("ddd");
        //BUTTON1.setSize(25, 25);
        //BUTTON1.setBackground(new java.awt.Color(153, 153, 153));
        BUTTON1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        BUTTON1.setForeground(new java.awt.Color(51, 51, 51));
        BUTTON1.setText("1");
        BUTTON1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        BUTTON1.setFocusPainted(false);
        BUTTON1.setFocusable(false);
        BUTTON1.setContentAreaFilled(false);
        BUTTON1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        content.add(BUTTON1);
        this.content.updateUI();
    }

    public int getPagina() {
        return pagina;
    }

    public void setPagina(int pagina) {
        this.pagina = pagina;
    }
    
    
}
