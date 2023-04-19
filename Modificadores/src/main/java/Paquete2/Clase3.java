
package Paquete2;

import Paquete1.Clase1; //Necesitamos


public class Clase3 {
    public static void main(String[] args) {
        Clase1 objeto1 = new Clase1();
        //objeto1."numero"
        
        /*
        Esto nos tira un error porque el atributo numero no es un atributo publico de la clase 1, 
        ya que ademas de importar el paquete debemos estar seguros que el paquetesea public
        y no default y mucho menos private
        */
        
        Clase1 age = new Clase1();
        age.edad = 14; //Ahora es facilmente accesible desde otro paquete ya que el atriibuto es publico
        
    }
}
