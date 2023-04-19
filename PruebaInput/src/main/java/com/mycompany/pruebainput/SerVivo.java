
package com.mycompany.pruebainput;

public class SerVivo {
    private String Nombre;
    private String Color;

    public SerVivo(String Nombre, String Color) {
        this.Nombre = Nombre;
        this.Color = Color;
    }
    
    public SerVivo(){}

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String Color) {
        this.Color = Color;
    }

    @Override
    public String toString() {
        return "\nNombre: "+getNombre()+"\nColor: "+getColor();
    }
    
    
    
}
