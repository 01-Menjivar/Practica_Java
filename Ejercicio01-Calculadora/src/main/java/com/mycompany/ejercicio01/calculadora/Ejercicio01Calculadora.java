/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio01.calculadora;

import java.util.Scanner;

/**
 *
 * @author menji
 */
public class Ejercicio01Calculadora {

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        int opcion;
        double a,b, resultado;
       
        
        
        System.out.println("\nBienvenido a su calculadora de terminal ");
        System.out.println("1.Sumar\n2.Restar\n3.Multiplicar\n4.Dividir\n5.Salir");
        System.out.print("Digite su opcion: ");
        opcion = in.nextInt();
        
        switch(opcion){
            case 1:
                System.out.println("Digite su numero a");
                a = in.nextDouble();
                System.out.println("Digite su numero b");
                b = in.nextDouble();
                resultado = a+b;
                System.out.println("El resultado de la suma es: "+resultado);
                break;
             case 2:
                 System.out.println("Digite su numero a");
                a = in.nextDouble();
                System.out.println("Digite su numero b");
                b = in.nextDouble();
                resultado = a-b;
                System.out.println("El resultado de la resta es: "+resultado);
             break;
             case 3:
                 System.out.println("Digite su numero a");
                a = in.nextDouble();
                System.out.println("Digite su numero b");
                b = in.nextDouble();
                resultado = a*b;
                System.out.println("El resultado de la multiplicacion es: "+resultado);
                 break;
             case 4:
                 System.out.println("Digite su numero a");
                a = in.nextDouble();
                System.out.println("Digite su numero b");
                b = in.nextDouble();
                resultado = a/b;
                System.out.println("El resultado de la division es: "+resultado);
                 break;
                 
             case 5:
                 break;
                 
                  
        }
        
        
        
    }
}
