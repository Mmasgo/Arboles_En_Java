/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.arboles;

/**
 *
 * @author MiriamMas
 */
public class ArbolBB {
    Nodo raiz;
          
    public ArbolBB(){
        raiz=null;
    }
    
    public void AgregarNodo(Long d, String nom){
        Nodo nuevo= new Nodo(d,nom);


        if(raiz==null){
            raiz=nuevo;
        }else{
            Nodo auxiliar=raiz;
            Nodo padre;
           
            while(true){
                padre=auxiliar;
                if(d<auxiliar.dpi){
                    auxiliar=auxiliar.HijoIzquierdo;
                    if(auxiliar==null){
                        padre.HijoIzquierdo= nuevo;
                        return;
                    }
                }else{
                    auxiliar=auxiliar.HijoDerecho;
                    if(auxiliar==null){
                        padre.HijoDerecho=nuevo;
                        return;
                    }
                }
            }
        }
    }
    public boolean EstaVacio(){
         return raiz==null;
    }
   
    public void InOrden(Nodo r){
        if(r!=null){
            InOrden(r.HijoIzquierdo);
            System.out.println(r.dpi);
            InOrden(r.HijoDerecho);
        }
    }
    public void PreOrden(Nodo r){
        if(r!=null){
            System.out.println(r.dpi);
            PreOrden(r.HijoIzquierdo);
            PreOrden(r.HijoDerecho);
        }
    }
    
      public void PostOrden(Nodo r){
        if(r!=null){
            PostOrden(r.HijoIzquierdo);
            PostOrden(r.HijoDerecho);
            System.out.println(r.dpi);
        }
    }
      
      //metodo para buscar nodo en el arbol
      
      public Nodo BuscarNodo(Long d){
          Nodo r;

          Nodo aux=raiz;
          String nom;
          while(aux.dpi!=d){
              if(d<aux.dpi){
                  aux=aux.HijoIzquierdo;      
              }else{
                  aux=aux.HijoDerecho;
              }
              if(aux==null){
                  return null;
              }
          }
          return aux;
          
      }
      
      //metodo para eliminar un nodo del arbol
      
      public boolean EliminarNodo(Long d){
          Nodo auxiliar=raiz;
          Nodo padre=raiz;
         //buscando nodo 
          boolean EsHijoIzq=true;
          
          while(auxiliar.dpi!=d){
              padre=auxiliar;
              if(d<auxiliar.dpi){
                  EsHijoIzq=true;
                  auxiliar=auxiliar.HijoIzquierdo;
              }else{
                  EsHijoIzq=false;
                  auxiliar=auxiliar.HijoDerecho;
              }if(auxiliar==null){
                  return false;//nunca lo encontró
              }
          }//fin del while
         //eliminando

         if(auxiliar.HijoIzquierdo==null && auxiliar.HijoDerecho==null){
             if(auxiliar==raiz){
                 raiz=null;   //de una hoja o solo raiz
             }else if(EsHijoIzq){
                 padre.HijoIzquierdo=null;
             }else{
                 padre.HijoDerecho=null;
             }
         }
          //cuando tenga hijos
         else if(auxiliar.HijoDerecho==null){
             if(auxiliar==raiz){
                 raiz=auxiliar.HijoIzquierdo;
             }else if(EsHijoIzq){
                 padre.HijoIzquierdo=auxiliar.HijoIzquierdo;
             }else{
                 padre.HijoDerecho=auxiliar.HijoIzquierdo;
             }
         }else if(auxiliar.HijoIzquierdo==null){
             if(auxiliar==raiz){
                 raiz=auxiliar.HijoDerecho;
             }else if(EsHijoIzq){
                 padre.HijoIzquierdo=auxiliar.HijoDerecho;
             }else{
                 padre.HijoDerecho=auxiliar.HijoDerecho;
             }
         }else{
             Nodo reemplazo=ObtenerNodoReemplazo(auxiliar);
             if(auxiliar==raiz){
                 raiz=reemplazo;
             }else if(EsHijoIzq){
                 padre.HijoIzquierdo=reemplazo;
             }else{
                 padre.HijoDerecho=reemplazo;
             }
             reemplazo.HijoIzquierdo=auxiliar.HijoIzquierdo;
         }return true;
      }
      
      public Nodo ObtenerNodoReemplazo(Nodo NodoReemp){
          Nodo reemplazopadre=NodoReemp;
          Nodo reemplazo=NodoReemp;
          Nodo auxiliar=NodoReemp;
          
          while(auxiliar!=null){
              reemplazopadre=reemplazo;
              reemplazo=auxiliar;
              auxiliar=auxiliar.HijoIzquierdo;
          }
          if(reemplazo!=NodoReemp.HijoDerecho){
              reemplazopadre.HijoIzquierdo=reemplazo.HijoDerecho;
              reemplazo.HijoDerecho=NodoReemp.HijoDerecho;
          }
          System.out.println("el nodo reemplazo es "+reemplazo.dpi);
          return reemplazo;
      }
}
