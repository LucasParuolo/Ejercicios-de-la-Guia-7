/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciojava5extra_4;

import Entidad.Cuenta;
import java.util.Scanner;

/**
 *
 * @author rober
 */
public class EjercicioJava5extra_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Cuenta cuenta1 = new Cuenta();
        
        System.out.println(cuenta1.saldoCuenta()-cuenta1.retirar_dinero());
        
    }
    
}
