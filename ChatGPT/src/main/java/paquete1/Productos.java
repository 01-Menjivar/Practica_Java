/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete1;

/**
 *
 * @author menji
 */
public class Productos {
    private String nombre;
    private double precio;

    // Constructor con parámetros
    public Productos(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    // Constructor sin parámetros
    public Productos() {}

    // Métodos get y set
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
}
