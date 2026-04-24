/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import javax.swing.JOptionPane;


/**
 *
 * @author Zempo
 */
public class Prueba1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String nombre = JOptionPane.showInputDialog("palabra de paso:");
        if (nombre != null && nombre.equalsIgnoreCase("Cuauhtémoc")){
            JOptionPane.showMessageDialog(null, "Bienvenido"+ nombre);
        } else{
            JOptionPane.showMessageDialog(null, "Datos incorrectos", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}    

