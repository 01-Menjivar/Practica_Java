
package ClasesYObjetos;
public class Coche {
    
    //Atributos o variables
    String color;
    String marca;
    int km;
    
    //Metodos main
    public static void main(String[] args) {
        /*Para crear una clase
        <nombre de la clase> <nombre del objeto> = new <nombre de la clase>
        */
        Coche coche1 = new Coche();
         
        coche1.color = "Gris";
        coche1.km = 12000;
        coche1.marca = "Toyota";
        
        System.out.println("El color del coche1 es "+coche1.color);
        
    }
    
    
}
