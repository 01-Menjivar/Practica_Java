
package Package1;

public class Main {
    public static void main(String[] args) {
        
        Clase1 o1 = new Clase1();
        o1.SetEdad(15); //Con el uso de los setters puede acceder a cualquier campo sin
                             //importar su acceso
        
         System.out.println("La edad es "+o1.GetEdad());
                       
          Clase1 objeto2 = new Clase1();
         objeto2.setNombre("Oscar");
         
         System.out.println("El nombres es: "+objeto2.getNombre());
         
         
         
    }
    
   
    
}
