
package Paquete1;

import javax.swing.JOptionPane;

public class Main{
    public static void main(String[] args) {
        
        int cantidad;
        double total = 0;
        
       cantidad = Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de productos a ingresar"));
        
        Productos [] listadoProductos = new Productos[cantidad];
            
        for (int i = 0; i<cantidad; i++){
        Productos producto = new Productos();
        producto.setNombre(JOptionPane.showInputDialog("Nombre del producto: "));
        producto.setPrecio(Double.parseDouble(JOptionPane.showInputDialog("Precio y por que tan caro: ")));
        listadoProductos[i] = producto;
        }
            
        for(Productos producto:listadoProductos)
        {
        total += producto.getPrecio();
        }
        
        JOptionPane.showMessageDialog(null, "El total es: "+total);
        
    }
}
