/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.arboles;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author MiriamMas
 */
public class ArchivoTexto {
    
    public static ArrayList<Nodo> hojas=new ArrayList<>();
    
    public static void cargarDatosDeArchivo(ArbolBB arch, String rutaArchivo, int lineaInicial, int LineaFinal) {
    try {
        BufferedReader reader = new BufferedReader(new FileReader(rutaArchivo));
        String linea = reader.readLine(); // Omitir la línea de encabezado
        int contador=0;
        

           while ((linea = reader.readLine()) != null){
               contador++;
               if(contador>=lineaInicial && contador <=LineaFinal){
            String[] partes = linea.split("\t"); // Separar el nombre y el DPI
            String nombre = partes[0].replaceAll("1", " ");
            String dpiST = partes[1];
            long dpi = Long.parseLong(dpiST);
            arch.AgregarNodo(dpi, nombre);
            hojas.add(new Nodo(dpi,nombre));
        }
           }
        reader.close();
    } catch (IOException e) {
        System.out.println("Ocurrió un error al leer el archivo: " + e.getMessage());
        e.printStackTrace();
    }

    
}    
}
