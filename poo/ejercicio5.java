/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabajol.poo;

/**
 *
 * @author Usuario19
 */
public class ejercicio5 {
    
    


        
        String input1 = JOptionPane.showInputDialog("Ingrese el primer número:");
        String input2 = JOptionPane.showInputDialog("Ingrese el segundo número:");

        
        double numero1 = Double.parseDouble(input1);
        double numero2 = Double.parseDouble(input2);

       
        double suma = numero1 + numero2;
        double resta = numero1 - numero2;
        double multiplicacion = numero1 * numero2;
        double division = numero1 / numero2;

       
        JOptionPane.showMessageDialog(null, "La suma es: " + suma);
        JOptionPane.showMessageDialog(null, "La resta es: " + resta);
        JOptionPane.showMessageDialog(null, "La multiplicación es: " + multiplicacion);
        JOptionPane.showMessageDialog(null, "La división es: " + division);
    }


    
}
