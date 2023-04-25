/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciojava5extra_3;

import java.util.Scanner;
import Entidad.Juego;
/**
 *
 * @author rober
 */
public class EjercicioJava5extra_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Juego juego1 = new Juego();
        Scanner leer = new Scanner(System.in);
        
        System.out.println("¿Cuantas veces queres jugar?");
        int cont = leer.nextInt();
        
        for (int i = 0; i < cont; i++) {
             juego1.iniciar_juego();
            System.out.println("");
        }
        System.out.println("El jugador 1 ha ganado: "+ juego1.jugador1+ " veces.");
        System.out.println("El jugador 2 ha ganado: "+ juego1.jugador2+ " veces.");
       
        
    }
    
}
    
    

