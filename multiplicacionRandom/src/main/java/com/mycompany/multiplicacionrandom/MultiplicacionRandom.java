/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.multiplicacionrandom;

import java.util.Scanner;

/**
 *
 * @author menji
 */
public class MultiplicacionRandom {

    
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int dato;
        double resultado;
        System.out.println("Digite un numero cualquiera: ");
        dato = in.nextInt();
        
       int numero = (int)(Math.random()*100+1);
       resultado = dato * numero;
       
        System.out.println("El resultado de la multiplicacion es: "+resultado);
        System.out.println("Los numeros multiplicados fueron: \n"+"Numero ingresado por el usuario: "+dato+"\nNumero generado aleatoriamente: "+numero);
       
    }
}
