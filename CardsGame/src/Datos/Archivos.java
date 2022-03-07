/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Datos;

import Objetos.Baraja;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
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
    
    private ArrayList<Baraja> arraylist = new ArrayList<Baraja>();
    public void loadCards() throws FileNotFoundException{ 

    File myFile = new File(ruta + "//files/Baraja.txt");
    Scanner sc = new Scanner(myFile);

        while (sc.hasNextLine()) 
    {
        String[] stdinfo = sc.nextLine().split(",");
        arraylist.add(new Baraja(stdinfo[1], stdinfo[0]));
    }

         Random r = new Random();
        int number = r.nextInt(51)+1;
        System.out.println(number);//Debug para mostrar el numero random generado
        System.out.println(arraylist.get(number));//Para ver todo el array simplemente dejar "arraylist" dentro del parentesis
    }
    
}

