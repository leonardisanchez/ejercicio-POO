/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabajol.poo;

import javax.swing.JOptionPane;

/**
 *
 * @author Usuario19
 */
public class ejercicio4 {
    
   


        String input1 = JOptionPane.showInputDialog("Ingresa el primer número:");
        int numero1 = Integer.parseInt(input1);

       
        String input2 = JOptionPane.showInputDialog("Ingresa el segundo número:");
        int numero2 = Integer.parseInt(input2);

        
        int suma = numero1 + numero2;

       
        JOptionPane.showMessageDialog(null, "La suma de " + numero1 + " y " + numero2 + " es: " + suma);
    }
}


