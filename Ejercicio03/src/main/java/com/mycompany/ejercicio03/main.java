/*3. Construir el siguiente código fuente:
a. Una clase Costo, con los atributos:
i. Precio.
ii. Descuentos (si aplica).
b. Construir una clase Factura que herede de la clase Costo y además debe
tener los atributos:
i. Emisor.
ii. Cliente.
iii. Y el método ImprimirFactura.
c. Finalmente imprimir el total.*/
package com.mycompany.ejercicio03;
public class main {
    public static void main(String[] args) {
       Factura f1 = new Factura(26,true,"Oscar","Rodrigo");
        System.out.println(f1.toString());
        f1.ImprimirFactura();
        
        Factura f2 = new Factura(14,false,"Andree","Raul");
        System.out.println(f2.toString());
        f2.ImprimirFactura();
        
        
    }
}
