
package com.mycompany.ejercicio045;

public class Mate1 {

    public static int máximo(int[] arreglo) {
        int max = arreglo[0];
        for (int i = 1; i < arreglo.length; i++) {
            if (arreglo[i] > max) {
                max = arreglo[i];
            }
        }
        return max;
    }

    public static int mínimo(int[] arreglo) {
        int min = arreglo[0];
        for (int i = 1; i < arreglo.length; i++) {
            if (arreglo[i] < min) {
                min = arreglo[i];
            }
        }
        return min;
    }

    public static int sumatorio(int[] arreglo) {
        int suma = 0;
        for (int i = 0; i < arreglo.length; i++) {
            suma += arreglo[i];
        }
        return suma;
    }

    public static double mediaAritmetica(int[] arreglo) {
        int suma = sumatorio(arreglo);
        double media = (double) suma / arreglo.length;
        return media;
    }

    public static double mediaGeometrica(int[] arreglo) {
        double producto = 1;
        for (int i = 0; i < arreglo.length; i++) {
            producto *= arreglo[i];
        }
        double raiz = Math.pow(producto, 1.0 / arreglo.length);
        return raiz;
    }

}
    
