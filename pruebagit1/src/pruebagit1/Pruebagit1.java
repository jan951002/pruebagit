/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pruebagit1;

import javax.swing.JOptionPane;

/**
 *
 * @author jan
 */
public class Pruebagit1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int a, b, r;
        
        a=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer numero"));
        b=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo numero"));
        
        r = a-b;
        
       JOptionPane.showMessageDialog(null, "El resultado de la resta es "+r);
        
    }
    
}
