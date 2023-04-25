/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Libro;

/**
 *
 * @author rober
 */
public class Circunferencia {
    private double radio;
    public double area;
    public double perimetro;

    public Circunferencia(double radio) {
        this.radio = radio;
    }

    
    //no se usan al ser privados
    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    
    public void crearCircunferencia(double radio){
       this.radio = radio;    
    }
    
    public double Area (){
        double area = Math.PI*Math.pow(radio, 2);
        return area;
    }
    
    public double Perimetro(){
        double perimetro = 2*Math.PI*radio;
        return perimetro;
    }
}
