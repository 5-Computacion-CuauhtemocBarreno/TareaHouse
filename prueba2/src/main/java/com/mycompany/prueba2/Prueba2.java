/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.prueba2;
import javax.swing.JOptionPane;


/**
 *
 * @author Zempo
 */
public class Prueba2 {

    public static void main(String[] args) {
       Object[] opciones = {"Si, gracias", "No, gracias", "Más"};
       int n = JOptionPane.showOptionDialog(null, "¿Se ha solucionado el problema", "Soluciones", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[2]);
    }
}
