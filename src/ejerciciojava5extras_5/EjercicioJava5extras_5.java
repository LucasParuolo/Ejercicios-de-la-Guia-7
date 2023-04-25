/*
 * Crea una clase "Empleado" que tenga atributos como "nombre", "edad" y "salario". 
 * Luego, crea un método "calcular_aumento" que calcule el aumento salarial de 
 * un empleado en función de su edad y salario actual. El aumento salarial debe 
 * ser del 10% si el empleado tiene más de 30 años o del 5% si tiene menos de 30 años.
 */
package ejerciciojava5extras_5;

import Entidad.Empleado;

/**
 *
 * @author rober
 */
public class EjercicioJava5extras_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Empleado emp1 = new Empleado("Maria", 20, 40000);
        Empleado emp2 = new Empleado ("Norberto", 32, 40000);
        Empleado emp3 = new Empleado ("Lariza", 30, 100000);
        Empleado emp4 = new Empleado ("Mateo", 27, 100000);
        emp1.imprimirEmpleado();
        emp1.calcularAumento();
        emp1.imprimirEmpleado();
        
        emp2.imprimirEmpleado();
        emp2.calcularAumento();
        emp2.imprimirEmpleado();
        
        emp3.imprimirEmpleado();
        emp3.calcularAumento();
        emp3.imprimirEmpleado();
        
        emp4.imprimirEmpleado();
        emp4.calcularAumento();
        emp4.imprimirEmpleado();
    }
    
}
