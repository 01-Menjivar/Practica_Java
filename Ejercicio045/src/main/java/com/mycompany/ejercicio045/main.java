/*
Construir una clase final Mate2, esta debe heredar los metodos estaticos de Mate1
a. minimo
b. minimo
c. sumatorio
d. mediaAritmetica
e.mediaGeometrica
*/
package com.mycompany.ejercicio045;

public class main {
    public static void main(String[] args) {
     int[] miArreglo = {2, 4, 6, 8, 10};
     
     
        int suma = Mate2.sumarArreglo(miArreglo);
        System.out.println("La suma de los elementos del arreglo es: " + suma);
        
        int maximo = Mate2.Maximo(miArreglo);
        System.out.println("El maximo es "+maximo);
        
        int minimo = Mate2.Minimo(miArreglo);
        System.out.println("El minimo es "+minimo);
        
        double mediaA = Mate2.MediaAritmetica(miArreglo);
        System.out.println("La media aritemtica es: "+mediaA);
        
        double mediaG = Mate2.MediaGeometrica(miArreglo);
        System.out.println("La media geonetrica es: "+mediaG);
    }
}
