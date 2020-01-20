/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.code.common;

import app.code.utils.TiposAccion;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 *
 * @author Carlos
 */
public class PanelAcctionTable extends JPanel {
    
    private int index;
    
    public PanelAcctionTable(){
        this.index = 0;
        this.setLayout(null);
    }
    
    
    public void agregarAccion(Enum tipo, IEventCostomComponent accion) {
        JButton button = null;
        if (tipo == TiposAccion.EDITAR) {
            button = crearBoton(new ImageIcon(getClass().getResource("/app/resource/imagen/edit.png")));
        }else if(tipo == TiposAccion.ELIMINAR){
            button = crearBoton(new ImageIcon(getClass().getResource("/app/resource/imagen/delete.png")));
        }
        // Verifica si se creo un boton
        if ( button != null ){
            button.setBounds(index, 0, 22, 24);
            button.addActionListener((ev) -> {accion.ejecutar();});
            add(button);
            index += 21;
        }
    }
    
    public void agregarActivar(boolean activo, IEventCostomComponent accion){
        JButton button;
        if (activo){
           button = crearBoton(new ImageIcon(getClass().getResource("/app/resource/imagen/activo.png")));
        }else{
           button = crearBoton(new ImageIcon(getClass().getResource("/app/resource/imagen/desactivo.png")));
        }
        button.setBounds(index, 0, 22, 24);
        button.addActionListener((ev) -> {accion.ejecutar();});
        add(button);
        index += 21;
    }
    
    private JButton crearBoton(ImageIcon icono){
        JButton button = new JButton(icono);
        button.setBackground(new java.awt.Color(204, 204, 204));
        button.setContentAreaFilled(false);
        button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        button.setFocusPainted(false);
        button.setRequestFocusEnabled(false);
        button.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent evt) {
                button.setOpaque(true);
            }
            @Override
            public void mouseExited(MouseEvent evt) {
                button.setOpaque(false);
            }
        });
        return button;
    }
}
