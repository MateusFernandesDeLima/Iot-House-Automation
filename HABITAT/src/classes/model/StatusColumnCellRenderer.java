/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes.model;

import classes.view.DeviceGerView;
import java.awt.Color;
import java.awt.Component;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

/**
 *
 * @author User
 */
    public class StatusColumnCellRenderer extends DefaultTableCellRenderer {
    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, 
            boolean isSelected, boolean hasFocus, int row, int column) {
        
        super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);

        if ("Ligado".equals(value)) {
            setForeground(new Color(0, 128, 0)); // verde
        } else if ("Desligado".equals(value)) {
            setForeground(Color.RED); // vermelho
        } else {
            setForeground(Color.BLACK); // cor padrão
        }

        return this;
    }
}
    