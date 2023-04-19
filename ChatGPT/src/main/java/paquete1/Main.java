/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete1;

import javax.swing.JOptionPane;

/**
 *
 * @author menji
 */
public class Main {
    public static void main(String[] args) {
        int cantidadProductos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de productos a agregar:"));

        // Creamos un arreglo de objetos Productos con la cantidad de productos ingresada
        Productos[] productos = new Productos[cantidadProductos];

        // Solicitamos el nombre y precio de cada producto y lo agregamos al arreglo
        for (int i = 0; i < cantidadProductos; i++) {
            String nombre = JOptionPane.showInputDialog("Ingrese el nombre del producto " + (i+1) + ":");
            double precio = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el precio del producto " + (i+1) + ":"));
            productos[i] = new Productos(nombre, precio);
        }

        // Calculamos la suma de los precios de todos los productos
        double sumaPrecios = 0;
        for (Productos producto : productos) {
            sumaPrecios += producto.getPrecio();
        }

        // Mostramos la suma de los precios en un JOptionPane
        JOptionPane.showMessageDialog(null, "La suma de los precios de todos los productos es: " + sumaPrecios);
    
    }
}
