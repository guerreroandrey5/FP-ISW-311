/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Negociacion;

import Objetos.Baraja;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Random;
import javax.swing.ImageIcon;

/**
 *
 * @author Cris
 */
public class NBaraja {
   private static ArrayList<Baraja> arraylist = new ArrayList<Baraja>();
   private static HashMap<String, String> palos = new HashMap();
   
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
   
   public void definirPalos() {
       Random r = new Random();
       ArrayList seleccionados = new ArrayList();
       String Def = "Fuerte";
       for (int i = 1; i < 3; i++) {
           int palo = r.nextInt(4)+1;
           while(seleccionados.contains(palo)) {
               palo = r.nextInt(4)+1;
           }
           seleccionados.add(palo);
           if (palos.size() == 1) {
               Def = "Debil";
           }
           String paloF = "";
           switch (palo) {
               case 1:
                   paloF = "Treboles";
                   break;
               case 2:
                   paloF = "Diamantes";
                   break;
               case 3:
                   paloF = "Corazones";
                   break;
               case 4:
                   paloF = "Picas";
                   break;
           }
           palos.put(paloF, Def);           
       }

       for (int i = 1; i < 5; i++) {
           int palo = r.nextInt(4)+1;
           while(seleccionados.contains(palo)) {
               palo = r.nextInt(4)+1;
           }
                      String paloF = "";
           switch (palo) {
               case 1:
                   paloF = "Treboles";
                   break;
               case 2:
                   paloF = "Diamantes";
                   break;
               case 3:
                   paloF = "Corazones";
                   break;
               case 4:
                   paloF = "Picas";
                   break;
           }
           palos.put(paloF,"Regular");
       }
       System.out.println(palos);
   }
   
   public ArrayList getList() {
       Collections.shuffle(arraylist, new Random());
       return arraylist;
   }
   
   public HashMap getPalos() {
       return palos;
   }
   
   
   
   public ArrayList repartir(ArrayList list) {
       ArrayList hand = new ArrayList();
       for (int i = 0; i < 10; i++) {
           hand.add(list.get(i));
       }
       return hand;
   }
   
}
