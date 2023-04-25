/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import java.util.Scanner;

/**
 *
 * @author rober
 */
public class Empleado {
    private String nombre;
    private int edad;
    private int salario;

    public Empleado(String nombre, int edad, int salario) {
        this.nombre = nombre;
        this.edad = edad;
        this.salario = salario;
    }
    
    public void calcularAumento(){
       if (edad < 30) {//si edad es menos de 30
           System.out.println("El aumento sera del 5%: " + 0.05*salario);
           salario = (int) (salario*1.05); 
           System.out.println("El nuevo salario es: " + salario);
       }else{//cualquier valor posible
           System.out.println("El aumento sera del 5%: " + 0.10*salario);
           salario = (int) (salario*1.10); 
           System.out.println("El nuevo salario es: " + salario);
       }
       System.out.println("--------------------------------");
     }
    
    public void imprimirEmpleado(){
        System.out.println("Nombre = " + nombre);
        System.out.println("Edad = " + edad);
        System.out.println("Salario = " + salario);
        System.out.println("--------------------------------");
    }
    
//    public double calcularAumento(){
//        Scanner leer = new Scanner(System.in);
//        System.out.println("Determine la edad del Empleado");
//        edad = leer.nextInt();
//        System.out.println("Determine el salario del Empleado");
//        salario =
//    }

}
