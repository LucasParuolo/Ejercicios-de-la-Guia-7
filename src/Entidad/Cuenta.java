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
public class Cuenta {
        Scanner leer = new Scanner(System.in);
    public double saldo;
    public String titular;
    public double retiro;
    
    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public Cuenta() {
    }

    public Cuenta(double saldo, String titular) {
        this.saldo = saldo;
        this.titular = titular;
    }

    public double saldoCuenta() {
        System.out.println("Ingrese el saldo de la cuenta");
        saldo = leer.nextDouble();
        return saldo;
    }

    public double retirar_dinero() {
        System.out.println("Ingrese la cantidad que quiere retirar");
        retiro= leer.nextDouble();
        
        return retiro;
    }
    
}
            

