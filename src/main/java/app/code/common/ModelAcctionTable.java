/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.code.common;

import java.awt.Component;
import java.util.EventObject;
import javax.swing.JTable;
import javax.swing.event.CellEditorListener;
import javax.swing.table.TableCellEditor;
import javax.swing.table.TableCellRenderer;

/**
 *
 * @author Carlos
 * @param <T>
 */
public class ModelAcctionTable<T extends Component> implements TableCellRenderer, TableCellEditor {
    
    private Component selectComponente;
    public ModelAcctionTable() {

    }

    @Override
    public Component getTableCellRendererComponent(JTable table,
            Object value, boolean isSelected, boolean hasFocus, int row, int col) {
        if (value == null ) return null;
        Component componente = (T) value;
//        if (isSelected) {
//            componente.setBackground(table.getSelectionBackground());
//        }else{
//            componente.setBackground(table.getBackground());
//        }
        return componente;
    }

    @Override
    public Component getTableCellEditorComponent(JTable table,
            Object value, boolean isSelected, int row, int col) {
        //System.out.println(value);
        return (T) value;
        //componente.setBackground(table.getSelectionBackground());
    }

    @Override
    public void addCellEditorListener(CellEditorListener arg0) {
       // System.out.println(arg0);
    }

    @Override
    public void cancelCellEditing() {
        System.out.println("can");
    }

    @Override
    public Object getCellEditorValue() {
        System.out.println("hoo");
        return "";
    }

    @Override
    public boolean isCellEditable(EventObject arg0) {
        return true;
    }

    @Override
    public void removeCellEditorListener(CellEditorListener arg0) {
      //  System.out.println(arg0);
    }

    @Override
    public boolean shouldSelectCell(EventObject arg0) {
        return true;
    }

    @Override
    public boolean stopCellEditing() {
        return true;
    }

}
