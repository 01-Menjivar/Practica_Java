
package com.mycompany.ejercicio03;


public class Factura extends Costo{
    String Emisor;
    String Cliente;
    public Factura(double precio, boolean descuento,String Emisor,String Cliente) {
        super(precio, descuento);
        this.Emisor = Emisor;
        this.Cliente = Cliente;
    }
    
    double precioTotal = 0;
    
    public void ImprimirFactura(){
    if(getDescuento()== true){
    precioTotal = getPrecio()*0.95;
        System.out.println("\nSu producto aplica al descuento"+"\nPrecio antiguo: "+getPrecio()+"\nPrecio nuevo: "+precioTotal);
    }else{
    System.out.println("\nSu producto no aplica al descuento"+"\nPrecio antiguo: "+getPrecio()+"\nPrecio nuevo: "+getPrecio());
    }
    
    
    
}

    @Override
    public String toString() {
        return "\nVendedor: "+Emisor+"\nCliente: "+Cliente;
    }
}