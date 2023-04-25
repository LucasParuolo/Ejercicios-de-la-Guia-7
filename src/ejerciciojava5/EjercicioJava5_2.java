/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciojava5;

import java.util.Scanner;
import Libro.Circunferencia;
/**
 *
 * @author rober
 */
public class EjercicioJava5_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       /*Declarar una clase llamada Circunferencia que tenga como atributo privado el radio de tipo real. 
        A continuación, se deben crear los siguientes métodos:
       
        A)Método constructor que inicialice el radio pasado como parámetro.

        B)Métodos get y set para el atributo radio de la clase Circunferencia.

        C)Método para crearCircunferencia(): que le pide el radio y lo guarda en el atributo del objeto.

        D)Método area(): para calcular el área de la circunferencia (Area=〖π*radio〗^2).

        E)Método perimetro(): para calcular el perímetro (Perimetro=2*π*radio).*/
       
       Scanner leer = new Scanner(System.in);
       
        System.out.println("Introdusca un radio");
        
        
        Circunferencia cir1;
        cir1 = new Circunferencia(leer.nextDouble());
        
        System.out.println("Radio es " + cir1.getRadio());
        System.out.println(" ");
        System.out.println("El perimetro es " + cir1.Perimetro());
        System.out.println("El area es " +  cir1.Area());
       

    }
    
}
