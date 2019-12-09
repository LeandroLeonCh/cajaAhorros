/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.code.common;

import java.awt.event.KeyEvent;

/**
 *
 * @author Carlos
 */
public class Validation {
    
    
    
    public void validarNumero(KeyEvent evt){
        if (evt.getKeyChar() < '0' || evt.getKeyChar() > '9') {
            evt.consume();
        }
    }
    
    public void validarTexto(KeyEvent evt){
        if (evt.getKeyChar() < 65 || (evt.getKeyChar() > 90 && evt.getKeyChar() < 97) || evt.getKeyChar() > 122) {
            if (evt.getKeyChar() != 32) {
                evt.consume();
            }
        }
    }
}
