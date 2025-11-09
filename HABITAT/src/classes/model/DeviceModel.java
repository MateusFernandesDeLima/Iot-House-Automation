/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes.model;

import javax.swing.table.DefaultTableCellRenderer;
import classes.model.Device;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import java.awt.*;

public class DeviceModel extends AbstractTableModel {
    private List<Device> devices = new ArrayList<>();
    private final String[] colunas = {"ID", "NOME", "TIPO", "STATUS"};
    
    @Override
    public int getRowCount(){
        return devices.size();
    }
    
    @Override
    public int getColumnCount(){
        return colunas.length;
    }
    
    @Override
    public String getColumnName(int column) {
        return colunas[column];
    }
    
    @Override
    public Class<?> getColumnClass(int columnIndex) {
        switch(columnIndex){
            case 0: return Integer.class;
            case 1: case 2: case 3: return String.class;
            default: return Object.class;
        }
    }
    
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Device d = devices.get(rowIndex);
        switch (columnIndex) {
            case 0: return d.getId();
            case 1: return d.getNome();
            case 2: return d.getTipo();
            case 3: return d.isStatus() ? "Ligado" : "Desligado";
            default: return null;
        }
    }
    
    public void addDevice(Device device) {
        devices.add(device);
        fireTableRowsInserted(devices.size() - 1, devices.size() - 1);
    }
    
    public void removeDevice(int rowIndex) {
        devices.remove(rowIndex);
        fireTableRowsDeleted(rowIndex, rowIndex);
    }
    
    public void toggleStatus(int rowIndex) {
        Device d = devices.get(rowIndex);
        d.setStatus(!d.isStatus());
        fireTableRowsUpdated(rowIndex, rowIndex);
    }
}
