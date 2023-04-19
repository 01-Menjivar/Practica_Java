
package com.mycompany.ejercicio01;

public class Operario extends Empleado {
 private String Fecha_Cont;
    public Operario(String Id, String Nombre, String Dir, String Fecha_Cont) {
        super(Id, Nombre, Dir);
        this.Fecha_Cont=Fecha_Cont;
    }

    public String getFecha_Cont() {
        return Fecha_Cont;
    }

    public void setFecha_Cont(String Fecha_Cont) {
        this.Fecha_Cont = Fecha_Cont;
    }
    
 @Override
    public String toString(){
    return "\nNombre "+getNombre()+"\nID: "+getId()+"\nDireccion: "+getDir()+"\nFecha de contratacion: "+Fecha_Cont;
    }
    
}
