/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciojava5_3;

import Operacion.Operacion;

/**
 *
 * @author rober
 */
public class EjercicioJava5_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Operacion m1 = new Operacion(); 
        
        m1.crearOperacion();
        System.out.println("La suma entre los dos numeros da igual " + m1.sumar());
        System.out.println("La resta entre los dos numeros da igual " + m1.restar());
        System.out.println("La multiplicacion entre los dos numeros da igual " + m1.multi());
        System.out.println("La division entre los dos numeros da igual " + m1.divi());
        
    }
    
}
