/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.clasemath;

import java.util.Scanner;

/**
 *
 * @author menji
 */
public class ClaseMath {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int numero;
        
        //raiz cuadrada de un numero
        int raiz = (int)Math.sqrt(9.0); //para pasar a int
        double raiz2 = Math.sqrt(100.0);
        
        System.out.println(raiz);
        System.out.println(raiz2);
        
        System.out.println("Digite un numero");
        numero = in.nextInt();
         
        int resultado = (int)Math.pow(numero,2);
        
        System.out.println(numero+" elevado al cudradado es igual a "+resultado);
        
         
        
    }
}
