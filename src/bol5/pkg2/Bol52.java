/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bol5.pkg2;

import javax.swing.JOptionPane;

/**
 *
 * @author galle
 */
public class Bol52 {

    public static void main(String[] args) {
     
        Satelite obj1 = new Satelite ();
        obj1.verPosicion();
        JOptionPane.showMessageDialog(null, "Valor inicial de meridiano "+obj1.getMeridiano()+" de paralelo "+obj1.getParalelo()+" y de la distancia a la tierra "+obj1.getDistanciaTerra());
        
        Satelite obj2 = new Satelite ();
        String respuesta1 = JOptionPane.showInputDialog("Introduce el meridiano: ");
        obj2.getMeridiano(Double.parseDouble(respuesta1));
    
    }
}
