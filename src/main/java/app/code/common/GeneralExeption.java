/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.code.common;

import java.util.List;

/**
 *
 * @author Carlos
 */
public class GeneralExeption extends Exception{
    
    public GeneralExeption(String mensaje){
        super(mensaje);
    }
    
    public GeneralExeption(List<String> mensajes){
        super("");
    }
    
}
