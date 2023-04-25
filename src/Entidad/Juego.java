/*
 * Crea una clase "Juego" que tenga un método "iniciar_juego" que permita a 
   dos jugadores jugar un juego de adivinanza de números. 
   El primer jugador elige un número y el segundo jugador intenta adivinarlo. 
   El segundo jugador tiene un número limitado de intentos y recibe una pista 
   de "más alto" o "más bajo" después de cada intento. El juego termina cuando 
   el segundo jugador adivina el número o se queda sin intentos. Registra el 
   número de intentos necesarios para adivinar el número y 
   el número de veces que cada jugador ha ganado.
 */
package Entidad;

import java.util.Scanner;

/**
 *
 * @author rober
 */
public class Juego {
      Scanner leer = new Scanner(System.in);
    public int jugador1, jugador2;
    public int intentos;
    public int num1, num2;
    public int contador;

    public Juego(int jugador1, int jugador2, int intentos, int num1, int num2, int contador) {
        this.jugador1 = jugador1;
        this.jugador2 = jugador2;
        this.intentos = 5;
        this.num1 = num1;
        this.num2 = num2;
        this.contador= contador;
    }

    public Juego() {
    }

    public void iniciar_juego() {
        System.out.print("Jugador 1, elija un numero: ");
        this.num1 = leer.nextInt();

        System.out.print("Jugador 2, intente adivinar el numero, tiene 5 intentos: ");
       
        for (int i = 1; i < 6; i++) {
            this.num2 = leer.nextInt();
            if (num2 < num1) {
                System.out.println("El num es mas alto, intente nuevamente");
            } else if (num2 > num1) {
                System.out.println("El num es mas bajo, intente nuevamente");
            } else if (num2 == num1) {

                System.out.println("GANASTE! Solo te costo: "+ i +" intentos.");
                jugador2+=1;
                contador++;
                break;
            }
            if (i >= 5) {
                System.out.println("Se acabaron los intentos, PERDISTE!");
                jugador1+=1;
                break;
            }
        }
    }
}

