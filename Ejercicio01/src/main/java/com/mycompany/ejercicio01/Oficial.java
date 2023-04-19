
package com.mycompany.ejercicio01;

public class Oficial extends Operario {
    private String Desc_Trabajo;
    public Oficial(String Id, String Nombre, String Dir, String Fecha_Cont, String Desc_Trabajo) {
        super(Id, Nombre, Dir, Fecha_Cont);
        this.Desc_Trabajo = Desc_Trabajo;
        
    }
    public String toString(){
    return "\nNombre "+getNombre()+"\nID: "+getId()+"\nDireccion: "+getDir()+"\nFecha de contratacion: "+getFecha_Cont()+"\nDescripcion del trabajo"+Desc_Trabajo;
    }
}
