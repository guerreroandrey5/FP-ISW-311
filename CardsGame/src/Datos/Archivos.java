/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Datos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Guerrero
 */
public class Archivos {
    public DefaultTableModel RecordsTablez = new DefaultTableModel();
    public DefaultTableCellRenderer MyHeaderRender = new DefaultTableCellRenderer(); 
    private String ruta = System.getProperties().getProperty("user.dir");
    public void loadList(){//No debería funcionar
       
                 
        File archivo = null;
        FileReader FileR = null;
        BufferedReader BufferedR = null;
        try{
            archivo = new File(ruta + "//files/data.txt");
            FileR = new FileReader(archivo);
            BufferedR = new BufferedReader(FileR);
            String data;           
            RecordsTablez.addColumn("Puntajes de CardsGame");
            while((data = BufferedR.readLine()) != null){
                System.out.println(data);
                RecordsTablez.addRow(new String []{data});
            }   
        }catch (Exception e){JOptionPane.showMessageDialog(null, "No hay datos registrados sobre Puntajes, el registro se mostrará en blanco");}finally{try{if(null!=FileR) {FileR.close();}}catch(IOException e2){
            
        }
    }
    }
}
