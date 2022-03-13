/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Datos;

import Negociacion.NBaraja;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Guerrero
 */
public class Archivos {
    private Objetos.ObjData data = new Objetos.ObjData();
    private static Date fecha = new Date();
    private NBaraja BRJ = new NBaraja();
    public DefaultTableModel RecordsTablez = new DefaultTableModel();
    public DefaultTableCellRenderer MyHeaderRender = new DefaultTableCellRenderer(); 
    private String ruta = System.getProperties().getProperty("user.dir");
    private NBaraja Brj = new NBaraja();
    private static String nJ = "";
    private static String PO = "";
    private static HashMap<String, String> PD = new HashMap();
    private static String RE ="";
    private ArrayList<String> arrl = new ArrayList<String>();
    public void savePal() throws IOException{
        PD = BRJ.getPalos();          
            for ( Map.Entry<String, String> entry : PD.entrySet()){

        try {
            
            File archivo = new File(ruta + "//files/dataB.txt");
            try (FileWriter writez = new FileWriter(archivo, true)) {
                writez.write(RE = ("Carta=" + entry.getKey() + "Palo=" + entry.getValue()) + "\n");
                                
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error al guardar datos!", "Error", 0);
        }
    }
    }
    public void guardarDatos() {//Almacena los datos del juego
        nJ = data.getnJ();
        PO = data.getPO();
        try {
            File archivo = new File(ruta + "//files/data.txt");
            try (FileWriter writez = new FileWriter(archivo, true)) {
                writez.write("<------------------------------>\nFecha: " + fecha.toLocaleString()
                        + "\nNombre del Jugador: " + nJ 
                                + "\nPuntos Obtenidos: " + PO + "\n");
                                
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error al guardar datos!", "Error", 0);
        }
    }
    
    public void loadList(){
       
                 
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
    
    public void loadCards() throws FileNotFoundException{ 

    File myFile = new File(ruta + "//files/Baraja.txt");
    Scanner sc = new Scanner(myFile);

        while (sc.hasNextLine()) 
    {
        String[] stdinfo = sc.nextLine().split(",");
        Brj.crearcarta(stdinfo[1],stdinfo[0]);
        }
    }
    
    public void loadPer() throws FileNotFoundException{
       
        Scanner s = new Scanner(new File(ruta + "//files/dataB.txt"));
        
        while (s.hasNext()){
                            arrl.add(s.next());
                                                }
        s.close();
        
                    }

    public ArrayList<String> getArrl() {
        return arrl;
    }
   
}

