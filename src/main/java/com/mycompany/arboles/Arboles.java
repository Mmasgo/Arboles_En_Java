/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.arboles;

import javax.swing.JOptionPane;

/**
 *
 * @author MiriamMas
 */
public class Arboles {

    public static void main(String[] args) {
       int opc=0,valor, cantidadDatos;
       String nombre;
       long dato;
       
       ArbolBB arbolito=new ArbolBB();     
       
       do{
           try{
               opc=Integer.parseInt(JOptionPane.showInputDialog(null, "1. agregar\n"
               +"2.  Mostrar en InOrden\n"
               +"3. Mostrar en preOrden\n"
               +"4. Mostrar en PostOrden\n"
               +"5. Buscar nodo\n" 
               +"6. Eliminar un nodo\n"
               +"7. salir\n" 
               +"elige una opcion", "umg",JOptionPane.QUESTION_MESSAGE));
               switch(opc){
                   case 1:
                       dato=Long.parseLong(JOptionPane.showInputDialog(null, "ingresa el numero del nodo"));
                   nombre=JOptionPane.showInputDialog(null, "INGRESE NOMBRE EL NODO","umg",JOptionPane.QUESTION_MESSAGE);
                   arbolito.AgregarNodo(dato, nombre);
                       break;
                   case 2: if(!arbolito.EstaVacio()){
                       System.out.println();
                        arbolito.InOrden(arbolito.raiz);
                   }
                   break;
                   case 3:if(!arbolito.EstaVacio()){
                       System.out.println();
                        arbolito.PreOrden(arbolito.raiz);
                   }
                       break;
                   case 4:if(!arbolito.EstaVacio()){
                       System.out.println();
                        arbolito.PostOrden(arbolito.raiz);
                   }
                       break;
                   case 5:if(!arbolito.EstaVacio()){
                       String num=JOptionPane.showInputDialog(null,"Ingrese el numero del nodo a buscar.","buscar",JOptionPane.QUESTION_MESSAGE);
                       long numero=Long.parseLong(num);
                       Nodo tmp;
                       tmp=arbolito.BuscarNodo(numero);
                       if(tmp==null){
                           JOptionPane.showMessageDialog(null,"el nodo a buscar no se encuenta","error",JOptionPane.QUESTION_MESSAGE);
                       }else{
                           System.out.println("Nodo encontrado, sus datos son "+tmp.nombre);
                       }
                   }else{
                       JOptionPane.showMessageDialog(null, "esta vacio", "error", JOptionPane.INFORMATION_MESSAGE);
                   }
                       break;
                    case 6:
                        if(!arbolito.EstaVacio()){
                               dato = Long.parseLong(JOptionPane.showInputDialog(null,"Ingresa el Numero del Nodo a Eliminar...", "Eliminando un Nodo", JOptionPane.QUESTION_MESSAGE));
                               //arbolito.BuscarNodo(numero);
                               
                               if (arbolito.EliminarNodo(dato)==false){
                                   JOptionPane.showMessageDialog(null, "El Nodo a Eliminar no se encuentra en el Arbol","Nodo no Encontrado",JOptionPane.INFORMATION_MESSAGE);
                               }else{
                                   JOptionPane.showMessageDialog(null, "El Nodo ha sido eliminado del Arbol","Nodo Eliminado",JOptionPane.INFORMATION_MESSAGE);
                               }
                           }else{
                                JOptionPane.showMessageDialog(null, "El Arbol esta vacio","Error",JOptionPane.INFORMATION_MESSAGE);
                            }
                       break;   
                    case 7:
                       System.out.println("saliendo del programa");
                       break;
                   default:System.out.println("error");
                   break;
               }
           }catch(NumberFormatException n){
               JOptionPane.showInputDialog(null,"error","error",JOptionPane.INFORMATION_MESSAGE);
           }
       }while(opc!=7);
        
    }
        
    
}
