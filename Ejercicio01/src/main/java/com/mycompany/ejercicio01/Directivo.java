
package com.mycompany.ejercicio01;

public class Directivo extends Empleado {
   private int Cantidad_Emp;

    public Directivo(String Id, String Nombre, String Dir, int Cantidad_Emp) {
        super(Id, Nombre, Dir);
        this.Cantidad_Emp=Cantidad_Emp;
    }
    
    public String toString(){
    return "\nNombre "+getNombre()+"\nID: "+getId()+"\nDireccion: "+getDir()+"\nCantidad de empleados a cargo: "+Cantidad_Emp;
    }
}
