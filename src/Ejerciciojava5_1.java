
import Libro.Libro;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rober
 */
public class Ejerciciojava5_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Libro libro1;
        
        libro1 = new Libro();
        
      libro1.Cargarlibro();
      libro1.Informe();
        System.out.println(libro1.toString());
    }
    
}
