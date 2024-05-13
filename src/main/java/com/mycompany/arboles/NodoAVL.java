/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.arboles;

/**
 *
 * @author MiriamMas
 */
public class NodoAVL {
    String nombre;
    long dpiAVL;
    int fe;
    NodoAVL HijoIzquierdo, HijoDerecho;
    
    public NodoAVL(long dpi, String nombre){
        this.dpi=dpi;
        this.nombre=nombre;
        this.fe=0;
        this.HijoIzquierdo=null;
        this.HijoDerecho=null;        
    }
    
}
