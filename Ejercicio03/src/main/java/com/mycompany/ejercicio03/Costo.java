
package com.mycompany.ejercicio03;

public class Costo {
    private double precio;
    private boolean descuento;

    public Costo(double precio, boolean descuento) {
        this.precio = precio;
        this.descuento = descuento;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public boolean getDescuento() {
        return descuento;
    }

    public void setDescuento(boolean descuento) {
        this.descuento = descuento;
    }

    

    
    
}
