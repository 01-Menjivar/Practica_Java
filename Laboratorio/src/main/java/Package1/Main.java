
package Package1;

import javax.swing.JOptionPane;


public class Main {
    public static void main(String[] args) {
        Libro libro1 = new Libro();
        Libro libro2 = new Libro();
        
        libro1.setAutor("Juan Rulfo");
        libro1.setISBN("9780390764249");
        libro1.setTitulo("Pedro Paramo");
        libro1.setNumeroDePaginas(530);
        
        libro2.setAutor("JK Rowling");
        libro2.setISBN("8418173009");
        libro2.setNumeroDePaginas(835);
        libro2.setTitulo("Harry Potter");
        
        
        JOptionPane.showMessageDialog(null, ""+libro1.toString()+"\n"+libro2.toString());
        
        
        if(libro1.NumeroDePaginas>libro2.NumeroDePaginas){
            JOptionPane.showMessageDialog(null,"El libro: "+libro1.Titulo+" tiene un mayor numero de paginas ");   
        }else{
            JOptionPane.showMessageDialog(null, "El libro: "+libro2.Titulo+" tiene un mayor numero de paginas");
        }
    
}
}
J

