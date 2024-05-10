/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.arboles;

import java.io.File;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author MiriamMas
 */
public class AbrirArchivo extends javax.swing.JFrame {
private ArbolBB arbolito;
    /**
     * Creates new form AbrirArchivo
     */
    public AbrirArchivo() {
        initComponents();
BotonIn.addActionListener(new java.awt.event.ActionListener() {
    public void actionPerformed(java.awt.event.ActionEvent evt) {
        BotonInActionPerformed(evt);
    }
});
BotonPre.addActionListener(new java.awt.event.ActionListener() {
    public void actionPerformed(java.awt.event.ActionEvent evt) {
        BotonPreActionPerformed(evt);
    }
});
BotonPost.addActionListener(new java.awt.event.ActionListener() {
    public void actionPerformed(java.awt.event.ActionEvent evt) {
        BotonPostActionPerformed(evt);
    }
});
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        textField1 = new java.awt.TextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        JTextArea = new javax.swing.JTextArea();
        BotonIn = new javax.swing.JButton();
        BotonPre = new javax.swing.JButton();
        BotonPost = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("...");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        textField1.setText("textField1");
        textField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textField1ActionPerformed(evt);
            }
        });

        JTextArea.setColumns(20);
        JTextArea.setRows(5);
        jScrollPane1.setViewportView(JTextArea);

        BotonIn.setText("InOrden");
        BotonIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonInActionPerformed(evt);
            }
        });

        BotonPre.setText("PreOrden");
        BotonPre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonPreActionPerformed(evt);
            }
        });

        BotonPost.setText("PostOrden");
        BotonPost.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonPostActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(BotonIn)
                        .addGap(53, 53, 53)
                        .addComponent(BotonPre)
                        .addGap(62, 62, 62)
                        .addComponent(BotonPost)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(textField1, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                                .addComponent(jButton1)))
                        .addGap(52, 52, 52))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(textField1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotonIn)
                    .addComponent(BotonPre)
                    .addComponent(BotonPost))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        arbolito=new ArbolBB();
        JFileChooser fc= new JFileChooser();//creando objeto
        
        //creando un filtro para archivos txt
        FileNameExtensionFilter filtro=new FileNameExtensionFilter(".TXT", "txt");
        
        //indicamos el filtro
        fc.setFileFilter(filtro);
        
        //abriendo ventana, guardamos la opcion seleccionada por el usuario        
        int seleccion=fc.showOpenDialog(this);
        
        //si el usuario selecciona aceptar
        if (seleccion==JFileChooser.APPROVE_OPTION){
            //seleccionamos el fichero
            File fichero=fc.getSelectedFile();
             
            //Escribe la ruta del fichero sleccionado en el campo de texto
            this.textField1.setText(fichero.getAbsolutePath());
            int LI =Integer.parseInt(JOptionPane.showInputDialog(null, "ingresa el numero de linea INICIAL que desea cargar"));
            int LF =Integer.parseInt(JOptionPane.showInputDialog(null, "ingresa el numero de linea FINAL que desea cargar"));
 
           
            //agregando al arbol
            ArchivoTexto.cargarDatosDeArchivo(arbolito, fichero.getAbsolutePath(), LI, LF);   

        }
    }//GEN-LAST:event_jButton1ActionPerformed
   

    
    private void textField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textField1ActionPerformed

    private void BotonInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonInActionPerformed
        StringBuilder sb=new StringBuilder();
        
        JTextArea.setText("");//limpiar Text
        
        //llamar al metodo InOrden y capturar la salida en el StringBuilder
        if(arbolito != null && !arbolito.EstaVacio()){
            arbolito.InOrden(arbolito.raiz,sb);
        }
        JTextArea.setText(sb.toString());//mostrar la salida en el text
    
    }//GEN-LAST:event_BotonInActionPerformed

    private void BotonPreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonPreActionPerformed

        StringBuilder sb=new StringBuilder();
        
        JTextArea.setText("");//limpiar Text
        
        //llamar al metodo InOrden y capturar la salida en el StringBuilder
        if(arbolito != null && !arbolito.EstaVacio()){
            arbolito.PreOrden(arbolito.raiz,sb);
        }
        JTextArea.setText(sb.toString());//mostrar la salida en el text
    }//GEN-LAST:event_BotonPreActionPerformed

    private void BotonPostActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonPostActionPerformed
      
        StringBuilder sb=new StringBuilder();
        
        JTextArea.setText("");//limpiar Text
        
        //llamar al metodo InOrden y capturar la salida en el StringBuilder
        if(arbolito != null && !arbolito.EstaVacio()){
            arbolito.PostOrden(arbolito.raiz,sb);
        }
        JTextArea.setText(sb.toString());//mostrar la salida en el text
    }//GEN-LAST:event_BotonPostActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonIn;
    private javax.swing.JButton BotonPost;
    private javax.swing.JButton BotonPre;
    private javax.swing.JTextArea JTextArea;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private java.awt.TextField textField1;
    // End of variables declaration//GEN-END:variables
}

