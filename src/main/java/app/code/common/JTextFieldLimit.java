/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.code.common;

import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;
import java.util.regex.Pattern;

/**
 *
 * @author Carlos
 */
public class JTextFieldLimit extends PlainDocument {
  
  private final int limit;
  private final String regex;
  
  // Constantes 
  private final int NUMERO = 1;
  private final int TEXTO = 2;
  
  public JTextFieldLimit(int limit, int tipo) {
    super();
    this.limit = limit;
    switch(tipo){
        case NUMERO:
            this.regex = "^\\d+$";
            break;
        case TEXTO:
            this.regex = "^([A-Za-z]+\\s?)+$";
            break; 
        default:
            this.regex = "";
            break;
    }
  }
    /**
     * Metodo que inserta el texto
     * @param offset
     * @param str
     * @param attr
     * @throws BadLocationException
     */
    @Override
  public void insertString(int offset, String str, AttributeSet attr) throws BadLocationException {
    if (str == null)
      return;

    if ((offset + str.length()) <= limit) {
        if(this.regex.isEmpty()){
            super.insertString(offset, str, attr);
        }else{
            if (Pattern.compile(this.regex).matcher(str).find()) {
                super.insertString(offset, str, attr);
            }
        }
    }
  }
}