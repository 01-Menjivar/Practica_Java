/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package package1;

/**
 *
 * @author menji
 */
public class main {
    public static void main(String[] args) {
        
  
       
       // Amigos especial =  Amigos.Carolina;
        
        //System.out.println("Estudios:" +especial.getEstudios());
        //System.out.println("Pseudonimo"+especial.getPseudonimo());
        
        //especial.setEdad(20);
        
        
        for(Amigos todos : Amigos.values()){
            System.out.print(todos.getEstudios()+"\n");
            System.out.print(todos.getEdad()+"\n");
            System.out.print(todos.getPseudonimo()+"\n");
        }

        
        
       
        
        
    }
    
}
