
package com.mycompany.ejercicio02;
 /*
2. Elaborar un programa que contenga:
a. Una clase abstracta llamada Empleado la cual contenga los atributos
privados:
i. Identificación.
ii. Nombre.
iii. Dirección.
iv. De esta clase Empleado se deben heredar sus atributos y métodos a
las clases:
 Operador.
 Directivo.
v. Imprimir los datos de al menos cinco empleados.
*/
public class main {
    public static void main(String[] args) {
        
        Operador op1 = new Operador("00068422","Oscar Ayala","Calle Mexico");
        System.out.println(op1.toString());
        
        Operador op2 = new Operador("00068421","Francisco Menjivar","Calle El Gringo");
        System.out.println(op2.toString());
        
        Directivo d1 = new Directivo("0067838","Erick Varela","Antiguo");
        System.out.println(d1.toString());
        
    }
}
