
package com.mycompany.pruebainput;

import java.util.Scanner;

public class main {
   
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        SerVivo leon = new SerVivo();
        System.out.println("Escriba el nombre del animal");
        String nombre = in.nextLine();
        leon.setNombre(nombre);
        System.out.println("Escriba el color del animal");
        String color = in.nextLine();
        leon.setColor(color);
        
        System.out.println(leon.toString());
        
        Animal raton = new Animal();
        System.out.println("Escriba el nombre del otro animal");
         nombre = in.nextLine();
        raton.setNombre(nombre);
        System.out.println("Escriba el color del otro animal");
        color = in.nextLine();
        raton.setColor(color);
        System.out.println("Digite la edad de este animal");
        int edad = in.nextInt();
        raton.setEdad(edad);
        System.out.println(raton.toString());
        
        
    }
    
    
    
}
