
package Paquete1;


public class Clase2 {
    
    public static void main(String[] args) {
        Clase1 p1 = new Clase1();
        p1.numero = 15;
        /* Cuando dejamos la configuracion por defecto, podemos instanciar objetos entre las 
        diferentes clases de un mismo paquete
        */
        
        Clase1 p2 = new Clase1();
        //p2."color" = ???
        
        /*En este caso no puedo instanciar el objeto con el atributo "color" ya que este es privado 
        y solo se puede acceder a el desde la misma clase
        */
        
        Clase1 e1 = new Clase1();
        p2.edad = 15; //Este atributo es facilmente accesible ya que es publico
    }
    
}
