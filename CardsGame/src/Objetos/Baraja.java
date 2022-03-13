/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objetos;

import javax.swing.ImageIcon;

/**
 *
 * @author Guerrero
 */
public class Baraja /*extends JLabel*/ {
    private String ncardname;
    private String ncardnumber;
    private ImageIcon img;
    
    public Baraja(String ncardname, String ncardnumber, ImageIcon cardImagen) {
        this.ncardname = ncardname;
        this.ncardnumber = ncardnumber;
        this.img = cardImagen;
    }

    public ImageIcon getImg() {
        return img;
    }

    public String getNcardname() {
        return ncardname;
    }

    public String getNcardnumber() {
        return ncardnumber;
    }       
    
    @Override
   public String toString() {
        String s = "CardName: " + ncardname + "\nCardNumber: " + ncardnumber;
        return s;
    }

}


