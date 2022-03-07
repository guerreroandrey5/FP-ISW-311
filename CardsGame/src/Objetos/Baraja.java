/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objetos;

/**
 *
 * @author Guerrero
 */
public class Baraja {
    private String ncardname;
    private String ncardnumber;

    public Baraja(String ncardname, String ncardnumber) {
        this.ncardname = ncardname;
        this.ncardnumber = ncardnumber;
        
    }
    @Override
   public String toString() {
        String s = "CardName: " + ncardname + "\nCardNumber: " + ncardnumber;
        return s;
    }

}


