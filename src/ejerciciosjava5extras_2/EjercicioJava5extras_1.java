/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosjava5extras_2;


import Paquete.Cancion;
import java.util.Scanner;

/**
 *
 * @author rober
 */
public class EjercicioJava5extras_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        Cancion can1 = new Cancion();
        System.out.println("Ingrese el titulo la cancion");
        
        can1.setTitulo(leer.nextLine()); 
        
        System.out.println("Ingrese el autor la cancion");
        can1.setAutor(leer.nextLine());
        
        System.out.println("La Cancion: ");
        System.out.println("Titulo: " + can1.getTitulo() + ". Autor: " + can1.getAutor());
    }
    
}
