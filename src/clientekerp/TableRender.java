/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clientekerp;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

/**
 *
 * @author Christian
 */
public class TableRender extends DefaultTableCellRenderer{
private Component componente;
    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
     
        componente = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    if(row%2==0){  componente.setBackground(Color.CYAN);}
    else{componente.setBackground(Color.white);}
    
    if(isSelected){componente.setBackground(Color.yellow);}
  
        
        
        
     return componente;   
    }
    
    
 
 
 
 
    
}
