/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes.controller;

import classes.model.Device;
import classes.model.DeviceModel;
import javax.swing.JOptionPane;
/**
 *
 * @author User
 */
public class DeviceController {
    private DeviceModel model;
    int id = 0;
    public DeviceController(DeviceModel model) {
        this.model = model;
    }
    public void addDevice() {

            id ++;
            
            String nome = JOptionPane.showInputDialog("Nome do dispositivo:");
            if(nome == null || nome.trim().isEmpty()) return;

            String[] tipos = {"Sensor de Temperatura", "Ar-Condicionado","Caixa de som"};
            String tipo = (String) JOptionPane.showInputDialog(
                null,
                "Tipo do dispositivo:",
                "Selecione o tipo",
            JOptionPane.QUESTION_MESSAGE,
            null,
            tipos,   // opções para o usuário escolher
            tipos[0] // valor padrão selecionado
            );

            if (tipo == null) return;
            
            boolean status = false;
            
            Device device = new Device(id, nome, tipo, status);
            model.addDevice(device);
    }
    
    public void removeDevice(int selectedRow) {
        if(selectedRow >= 0) {
            int confirm = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja remover o dispositivo selecionado?", "Confirmação", JOptionPane.YES_NO_OPTION);
            if(confirm == JOptionPane.YES_OPTION) {
                model.removeDevice(selectedRow);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Selecione um dispositivo para remover.", "Aviso", JOptionPane.WARNING_MESSAGE);
        }
    }
    
    public void toggleDeviceStatus(int selectedRow) {
        if(selectedRow >= 0) {
            model.toggleStatus(selectedRow);
        } else {
            JOptionPane.showMessageDialog(null, "Selecione um dispositivo para ligar/desligar.", "Aviso", JOptionPane.WARNING_MESSAGE);
        }
    }
    
    
}
