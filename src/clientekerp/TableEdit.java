
package clientekerp;


import java.awt.Component;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

/**
 *
 * @author Christian
 */
public class TableEdit  extends DefaultTableCellRenderer{
    
    private Component componente;
    @Override
   
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
     
        componente = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        
        
       
        System.out.println("holis");
        
     return componente;   
    
}
    
}
