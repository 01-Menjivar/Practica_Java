
package com.mycompany.ejercicio02;


public class Directivo extends Empleado {
    
    public Directivo(String identificacion, String nombre, String direccion) {
        super(identificacion, nombre, direccion);
    }
    @Override
    public String toString(){
    return "Nombre: "+getNombre()+"\nIdentificacion: "+getIdentificacion()+"\nDireccion: "+getDireccion();
    }
}
