
package Package1;


public class Libro {
    
   String ISBN;
   String Titulo;
   String Autor;
   int NumeroDePaginas;
   
   public void setISBN(String ISBN){
   this.ISBN = ISBN;
   }

    public void setAutor(String Autor) {
        this.Autor = Autor;
    }
    
    public void setTitulo(String Titulo){
    this.Titulo = Titulo;
    }
   
    public void setNumeroDePaginas(int NumeroDePaginas){
    this.NumeroDePaginas = NumeroDePaginas;
    }

    public String getISBN() {
        return ISBN;
    }
   
    public String getTitulo(){
    return Titulo;
    }
    
    public String getAutor(){
    return Autor;
    }
    
    public int getNumeroDePaginas(){
    return NumeroDePaginas;
    }

    
   @Override
    public String toString() {
        return "El Libro "+Titulo+" con ISBN " +ISBN+" del autor "+Autor+" tiene "+NumeroDePaginas+" paginas";
    }

    
    
    
    
}
