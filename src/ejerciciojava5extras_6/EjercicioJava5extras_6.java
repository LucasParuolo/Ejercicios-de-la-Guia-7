/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciojava5extras_6;

import Entidad.Rectangulo;

/**
 *
 * @author rober
 */
public class EjercicioJava5extras_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Rectangulo rectangulo1 = new Rectangulo(4 ,6);
        System.out.println("El area es = " + rectangulo1.calcularArea());
        rectangulo1.imprimirRectangulo();
        
        Rectangulo rec2 = new Rectangulo(6,4);
         System.out.println("El area es = " + rec2.calcularArea());
        rec2.imprimirRectangulo();
    }
    
}
