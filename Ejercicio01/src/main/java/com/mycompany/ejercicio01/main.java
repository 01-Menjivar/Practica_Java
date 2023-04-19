


/*1. Realizar el diagrama UML de un empleado, que contenga:
a. Los siguientes atributos:
i. Identificación
ii. Nombre
iii. Dirección
b. Métodos getters, setters y toString públicos.
c. El Empleado va a heredar sus atributos a las siguientes clases, y generará un
nuevo toString de ellas, que incluya sus atributos extras:
i. Operario
 Fecha de contratación
ii. Directivo
 Cantidad de empleados a cargo

d. Operario va a heredar sus atributos y métodos a las siguientes clases, y va a
generar un nuevo método toString:
i. Oficial
 Descripción del trabajo.
*/

package com.mycompany.ejercicio01;

public class main {
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("00068422","Oscar Ayala","Calle Mexico");
        System.out.println(empleado1.toString());
        
        Operario operario1 = new Operario("00069467","Francisco Daniel","Calle El Gringo","18/03/2022");
        System.out.println(operario1.toString());
        
        Directivo directivo1 = new Directivo("0838328","Allan Escalante","Daguestan",35);
        System.out.println(directivo1.toString());
        
        Oficial oficial1 = new Oficial("09340342","Gabriela Quintero","Santa Tecla","18/09/2022","Ordenado");
        System.out.println(oficial1.toString());
        
    }
}
