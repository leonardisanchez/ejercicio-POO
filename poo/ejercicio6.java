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
public class ejercicio6 {
    import javax.swing.JOptionPane;


     
        String input1 = JOptionPane.showInputDialog("Ingrese el primer número:");
        String input2 = JOptionPane.showInputDialog("Ingrese el segundo número:");

     
        double numero1 = Double.parseDouble(input1);
        double numero2 = Double.parseDouble(input2);

       
        double suma = numero1 + numero2;
        double resta = numero1 - numero2;
        double multiplicacion = numero1 * numero2;
        double division = numero1 / numero2;

        
        String mensaje = "La suma es: " + suma + "\n"
                        + "La resta es: " + resta + "\n"
                        + "La multiplicación es: " + multiplicacion + "\n"
                        + "La división es: " + division;

       
        JOptionPane.showMessageDialog(null, mensaje);
    }
}

    
}
