/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Libro;

import java.util.Scanner;

/**Crear una clase llamada Libro que contenga los siguientes atributos: 
 * ISBN, Título, Autor, Número de páginas, y 
 * un constructor con todos los atributos pasados por parámetro y 
 * un constructor vacío. Crear un método para cargar un libro pidiendo los datos 
 * al usuario y luego informar mediante otro método el número de ISBN, el título, 
 * el autor del libro y el número de páginas.
 *
 * @author rober
 */
public class Libro {
    
    public int isbn;
    public String titulo;
    public String autor;
    public int numero_de_hojas;
    

    public Libro() {
    }
    
    public void Cargarlibro(){
    
        
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        System.out.println("Ingrese los datos del libro");
        
        System.out.println("ISBN");
        isbn = leer.nextInt();
                
        System.out.println("Titulo");
        titulo = leer.next();
        
        System.out.println("Autor");
        autor = leer.next();
        
        System.out.println("Numero de Hojas");
        numero_de_hojas = leer.nextInt();
               
        
}
    public void Informe(){
    Scanner leer = new Scanner(System.in);
        System.out.println("ISBM: " + isbn + ".  Titulo: " + titulo + ".  Autor: " + autor + ". Numero de Hojas: " + numero_de_hojas);
        
    }
               
        
}