/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Negociacion;

import Objetos.ObjData;

/**
 *
 * @author Guerrero
 */

public class DataTransfer {
    private Objetos.ObjData data = new Objetos.ObjData();
    public void username(String user){
        ObjData.setnJ(user);
    }
    
    public void puntos(String puntos){
        ObjData.setPO(puntos);
    }
    
}
