/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Datos;

import java.io.BufferedReader;
import java.io.FileReader;

/**
 *
 * @author Guerrero
 */
public class Archivos {
    public void loadList(){//No debería funcionar
       
        BufferedReader br = null;
    try{
        br = new BufferedReader(new FileReader("HistorialRobot.txt"));
        String line;
        while ((line = br.readLine()) != null){
            //AddModel.addElement(line);
        }
        
    }
    catch(Exception e){
        System.out.println(""+e);
    }
    finally{
        try{
            br.close();
        }
        catch(Exception e){
            System.out.println(""+e);
        }
    }
        
    }
}
