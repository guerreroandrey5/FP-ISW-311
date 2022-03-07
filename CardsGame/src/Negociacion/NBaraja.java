/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Negociacion;

import Objetos.Baraja;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import javax.swing.ImageIcon;

/**
 *
 * @author Cris
 */
public class NBaraja {
   private static ArrayList<Baraja> arraylist = new ArrayList<Baraja>();
   
   public void crearcarta(String info1, String info2){
       Imagenes img = new Imagenes();
       if("As".equals(info2)){
           info2 = "1";
       }
       if("Jota".equals(info2)){
           info2 = "11";
       } 
       if("Reina".equals(info2)){
           info2 = "12";
       } 
       if("Rey".equals(info2)){
           info2 = "13";
       } 

       String rute = "files/BRJ/"+ info1 + " (" + info2 + ").png";
       arraylist.add(new Baraja(info1, info2, img.getScaledImage(new ImageIcon(rute), 65, 100)));       
   }
   public ArrayList getList() {
       Collections.shuffle(arraylist, new Random());
       return arraylist;
   }
   
   public ArrayList repartir(ArrayList list) {
       ArrayList hand = new ArrayList();
       for (int i = 0; i < 10; i++) {
           hand.add(list.get(i));
       }
       return hand;
   }
   
}
