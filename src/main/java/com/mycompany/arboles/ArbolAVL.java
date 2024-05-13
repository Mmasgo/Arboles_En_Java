/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.arboles;

/**
 *
 * @author MiriamMas
 */
public class ArbolAVL {
    private NodoAVL raiz;
    
    public ArbolAVL(){
        raiz=null;
    }
    
    //buscar nodo
    public NodoAVL buscar(long d, NodoAVL r){
        if(raiz==null){
            return null;
        }else if(r.dpiAVL==d){
            return r;
        }else if(r.dpiAVL<d){
            return buscar(d,r.HijoDerecho);
        }else{
            return buscar(d,r.HijoIzquierdo);
        }
        
    }
    
    //Obtener el factor de equilibrio
    
    public int ObtenerFE(NodoAVL x){
        if(x==null){
            return -1;
        }else{
            return x.fe;
        }
    }
    
    //rotacion simple a la izquierda
    public NodoAVL rotacionIzquierda (NodoAVL c){
        NodoAVL aux=c.HijoIzquierdo;
        c.HijoIzquierdo=aux.HijoDerecho;
        aux.HijoDerecho=c;
        c.fe=Math.max(ObtenerFE(c.HijoIzquierdo),ObtenerFE(c.HijoDerecho))+1;//metodo que devuelve el maximo de dos valores
        aux.fe=Math.max(ObtenerFE(aux.HijoIzquierdo),ObtenerFE(aux.HijoDerecho))+1;
        return aux;
    }
    
    //rotacion simple a la derecha
    public NodoAVL rotacionDerecha (NodoAVL c){
        NodoAVL aux=c.HijoDerecho;
        c.HijoDerecho=aux.HijoIzquierdo;
        aux.HijoIzquierdo=c;
        c.fe=Math.max(ObtenerFE(c.HijoIzquierdo),ObtenerFE(c.HijoDerecho))+1;//metodo que devuelve el maximo de dos valores
        aux.fe=Math.max(ObtenerFE(aux.HijoIzquierdo),ObtenerFE(aux.HijoDerecho))+1;
        return aux;
    }

    //rotacion doble a la derecha
    public NodoAVL rotacionDobleDerecha(NodoAVL c){
        NodoAVL temp;
        c.HijoIzquierdo=rotacionDerecha(c.HijoIzquierdo);
        temp=rotacionIzquierda(c);
        return temp;
    }    
    
    //rotacion doble a la izquierda
    public NodoAVL rotacionDobleIzquierda(NodoAVL c){
        NodoAVL temp;
        c.HijoDerecho=rotacionIzquierda(c.HijoDerecho);
        temp=rotacionDerecha(c);
        return temp; 
    }
}
