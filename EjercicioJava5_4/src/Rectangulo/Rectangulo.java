/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Rectangulo;

import java.util.Scanner;

/**
 * Crear una clase Rectángulo que modele rectángulos por medio de un atributo privado base y un atributo privado altura. 
 * La clase incluirá un método para crear el rectángulo con los datos del Rectángulo dados por el usuario. 
 * También incluirá un método para calcular la superficie del rectángulo y un método para calcular el perímetro del rectángulo. 
 * Por último, tendremos un método que dibujará el rectángulo mediante asteriscos usando la base y la altura. 
 * Se deberán además definir los métodos getters, setters y constructores correspondientes.
 * 
 * Superficie = base * altura / Perímetro = (base + altura) * 2.
 */
public class Rectangulo {
   private double base;
   private double altura;

    public Rectangulo() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Escriba una base");
        base = leer.nextDouble();
        System.out.println("Ahora escriba una altura");
        altura = leer.nextDouble();
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
   
    public double superficie(){
        double superficie = base*altura;
        System.out.println("superficie = " + superficie);
        return superficie;
    }
    
    public double perimetro(){
        double perimetro = (base + altura) * 2;
        System.out.println("perimetro = " + perimetro);
        return perimetro;
    }
    
    public void imprimir(){
        
        for (int i = 0; i < altura; i++) {
            
            for (int j = 0; j < base; j++) {
                System.out.print("* ");
            }
            System.out.println(" ");
        }
    }
   
}
