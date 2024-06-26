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
    NodoAVL raiz;
    
    public ArbolAVL(){
        raiz=null;
    }
    
    
    public boolean EstaVacio(){
         return raiz==null;
    }
    
    //buscar nodo
    public NodoAVL buscar(long d){
         NodoAVL r;

          NodoAVL aux=raiz;
          String nom;
          while(aux.dpiAVL!=d){
              if(d<aux.dpiAVL){
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
    public NodoAVL rotacionDobleIzquierda(NodoAVL c){
        NodoAVL temp;
        c.HijoIzquierdo=rotacionDerecha(c.HijoIzquierdo);
        temp=rotacionIzquierda(c);
        return temp;
    }    
    
    //rotacion doble a la izquierda
    public NodoAVL rotacionDobleDerecha(NodoAVL c){
        NodoAVL temp;
        c.HijoDerecho=rotacionIzquierda(c.HijoDerecho);
        temp=rotacionDerecha(c);
        return temp; 
    }
    
    //metodo para insertar AVL
    public NodoAVL insertarAVL(NodoAVL nuevo, NodoAVL subAr){
        NodoAVL nuevoPadre=subAr;
        if(nuevo.dpiAVL<subAr.dpiAVL){
            if(subAr.HijoIzquierdo==null){
                subAr.HijoIzquierdo=nuevo;
            }else{
                subAr.HijoIzquierdo=insertarAVL(nuevo, subAr.HijoIzquierdo);
                if((ObtenerFE(subAr.HijoIzquierdo)-ObtenerFE(subAr.HijoDerecho)==2)){
                    if(nuevo.dpiAVL<subAr.HijoIzquierdo.dpiAVL){
                        nuevoPadre=rotacionIzquierda(subAr);
                    }else{
                        nuevoPadre=rotacionDobleIzquierda(subAr);
                    }
                }
            }
        }else if(nuevo.dpiAVL>subAr.dpiAVL){
            if(subAr.HijoDerecho==null){
                subAr.HijoDerecho=nuevo;
            }else{
                subAr.HijoDerecho=insertarAVL(nuevo, subAr.HijoDerecho);
                if((ObtenerFE(subAr.HijoDerecho)-ObtenerFE(subAr.HijoIzquierdo)==2)){
                    if(nuevo.dpiAVL>subAr.HijoDerecho.dpiAVL){
                        nuevoPadre=rotacionDerecha(subAr);
                    }else{
                        nuevoPadre=rotacionDobleDerecha(subAr);
                    }
                }
            }
        }else{
            System.out.println("Nodo duplicado");
        }
        //actualizando altura
        if((subAr.HijoIzquierdo==null)&&(subAr.HijoDerecho!=null)){
            subAr.fe=subAr.HijoDerecho.fe+1;           
        }else if((subAr.HijoDerecho==null)&&(subAr.HijoIzquierdo!=null)){
            subAr.fe=subAr.HijoIzquierdo.fe+1;
        }else{
            subAr.fe=Math.max(ObtenerFE(subAr.HijoIzquierdo), ObtenerFE(subAr.HijoDerecho))+1;
        }
        return nuevoPadre;
    }
    
    //metodo para insertar
    public void insertar(long dpi, String nombre){
        NodoAVL nuevo= new NodoAVL(dpi, nombre);
        if(raiz==null){
            raiz=nuevo;
        }else{
            raiz=insertarAVL(nuevo, raiz);
        }
    }
    
    //recorridos
        public void InOrden(NodoAVL r, StringBuilder sb){
        if(r!=null){
            InOrden(r.HijoIzquierdo,sb);
            sb.append(r.dpiAVL).append("\n");
            InOrden(r.HijoDerecho,sb);
        }
    }
    public void PreOrden(NodoAVL r, StringBuilder sb){
        if(r!=null){
            sb.append(r.dpiAVL).append("\n");
            PreOrden(r.HijoIzquierdo,sb);
            PreOrden(r.HijoDerecho,sb);
        }
    }
    
      public void PostOrden(NodoAVL r, StringBuilder sb){
        if(r!=null){
            PostOrden(r.HijoIzquierdo,sb);
            PostOrden(r.HijoDerecho,sb);
           sb.append(r.dpiAVL).append("\n");
        }
    }
      public boolean eliminarAVL(Long dpiAVL){
          raiz=EliminarNodo(raiz,dpiAVL);
          return true;
      }
      //eliminar nodo
      public NodoAVL EliminarNodo(NodoAVL nodoActual, Long dpiAVL){
          if(nodoActual==null)
              return nodoActual;
          
          if(dpiAVL<nodoActual.dpiAVL){
              nodoActual.HijoIzquierdo=EliminarNodo(nodoActual.HijoIzquierdo, dpiAVL);       
          }else if(dpiAVL>nodoActual.dpiAVL){
              nodoActual.HijoDerecho=EliminarNodo(nodoActual.HijoDerecho,dpiAVL);
          }else{
              //Nodo hoja
              if((nodoActual.HijoIzquierdo==null)||(nodoActual.HijoDerecho==null)){
                  NodoAVL temporal=null;
                  if(temporal==nodoActual.HijoIzquierdo){
                      temporal=nodoActual.HijoDerecho;
                  }else{
                      temporal=nodoActual.HijoIzquierdo;
                  }
                  
                  //si no tiene hijos
                  if(temporal==null){
                      nodoActual=null;
                  }else{
                      //con un hijo
                      nodoActual=temporal;
                  }
              }else{
                  
                  NodoAVL temporal=getNodoConValorMaximo(nodoActual.HijoIzquierdo);
                  nodoActual.dpiAVL=temporal.dpiAVL;
                  nodoActual.HijoIzquierdo=EliminarNodo(nodoActual.HijoIzquierdo,temporal.dpiAVL);
              }
          }//si solo tiene un nodo
          if(nodoActual==null)
              return nodoActual;
          
          //actualizar altura
          nodoActual.fe=Math.max(ObtenerFE(nodoActual.HijoIzquierdo), ObtenerFE(nodoActual.HijoDerecho))+1;
          int factorE=ObtenerFE(nodoActual);
          
          //realizando rotaciones
          if(factorE==-2 && ObtenerFE(nodoActual.HijoIzquierdo)<0){
              return rotacionDerecha(nodoActual);
          }
          //rotacion simple izquierda
          if(factorE>1 && ObtenerFE(nodoActual.HijoDerecho)>0){
              return rotacionIzquierda(nodoActual);
          }          
          //rotacion ID
          if(factorE==-2 && ObtenerFE(nodoActual.HijoIzquierdo)>0){
              return rotacionDobleIzquierda(nodoActual);
          }   
                    if(factorE==2 && ObtenerFE(nodoActual.HijoDerecho)<0){
              return rotacionDobleDerecha(nodoActual);
          }
                    return nodoActual;
      }
      

            
            private NodoAVL getNodoConValorMaximo(NodoAVL node) {
               NodoAVL actual=node;
               
               while(actual.HijoDerecho!=null){
                   actual=actual.HijoDerecho;
               }
               return actual;
            }
}
