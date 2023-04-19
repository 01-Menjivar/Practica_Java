
package com.mycompany.ejercicio01;

public class Empleado {
    private String Id;
    private String Nombre;
    private String Dir;

    public Empleado(String Id, String Nombre, String Dir) {
        this.Id = Id;
        this.Nombre = Nombre;
        this.Dir = Dir;
    }

    public String getId() {
        return Id;
    }

    public void setId(String Id) {
        this.Id = Id;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getDir() {
        return Dir;
    }

    public void setDir(String Dir) {
        this.Dir = Dir;
    }
    
    public String toString(){
    return "\nNombre "+Nombre+"\nID: "+Id+"\nDireccion: "+Dir;
    }
    
    
    
}
