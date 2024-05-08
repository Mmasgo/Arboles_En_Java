/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.arboles;

/**
 *
 * @author MiriamMas
 */
public class Nodo {
    String nombre;
    long dpi;
    Nodo HijoIzquierdo, HijoDerecho;

    public Nodo(long dpi, String nombre) {
       this.dpi=dpi;
        this.nombre = nombre;
        this.HijoIzquierdo = null;
        this.HijoDerecho = null;
    }

    public String getNombre() {
        return nombre;
    }

    public Long getDpi() {
        return dpi;
    }
    
}
