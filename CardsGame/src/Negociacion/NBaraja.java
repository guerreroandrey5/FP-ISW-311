/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Negociacion;

import Objetos.Baraja;
import java.util.ArrayList;
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
       String rute = "files/BRJ/"+ info1 + " (" + info2 + ").png";
       arraylist.add(new Baraja(info1, info2, img.getScaledImage(new ImageIcon(rute), 65, 100)));
   }
   public ArrayList getList() {
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
