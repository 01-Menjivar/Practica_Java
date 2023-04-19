/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.sentenciaif;

import java.util.Scanner;

/**
 *
 * @author menji
 */
public class SentenciaIf {

    public static void main(String[] args) {
        
        Scanner in = new Scanner (System.in);
        
        int numero;
        
        System.out.println("Digite un numero del 1 al 10");
        numero = in.nextInt();
        
        if(numero>=5){
            System.out.println("Su numero es mayor o igual a 5");
    }else{
            System.out.println("Su numero es menor que 5");
        }
    }
 
}
