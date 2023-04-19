
package com.mycompany.pruebainput;

public class Animal extends SerVivo {
    private int Edad;
    public Animal(String Nombre, String Color, int Edad) {
        super(Nombre, Color);
        this.Edad = Edad;
    }
    public Animal(){
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }
    
    
    
    @Override
    public String toString(){
    return"\nNombre: "+getNombre()+"\nColor: "+getColor()+"\nEdad: "+Edad;
    }
}
