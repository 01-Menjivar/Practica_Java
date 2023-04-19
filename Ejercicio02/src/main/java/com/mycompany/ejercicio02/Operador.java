
package com.mycompany.ejercicio02;

public class Operador extends Empleado{ 

    public Operador(String identificacion, String nombre, String direccion) {
        super(identificacion, nombre, direccion);
       
    }
    
    

    @Override
  public String toString(){
       return "Nombre: "+getNombre()+"\nIdentificacion: "+getIdentificacion()+"\nDireccion: "+getDireccion();
  }
    
}


