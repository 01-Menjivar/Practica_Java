
package package1;


public enum Amigos {
    
 //Objetos
Carolina("Ingenieria industrial",19,"Carito"),
Gabriela("Ingenieria informatica",20,"Gaby"),
Allan("Ingenieria informatica",20,"Allan"),
Raul("Arquitectura",19,"Elsenordelanoche"),
Andree("Diseno",19,"Vinicius Jr");

    
 String estudios;
 int edad;
 String pseudonimo;

     private Amigos(String estudios, int edad, String pseudonimo) {
        this.estudios = estudios;
        this.edad = edad;
        this.pseudonimo = pseudonimo;
    }

    public void setEstudios(String estudios) {
        this.estudios = estudios;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setPseudonimo(String pseudonimo) {
        this.pseudonimo = pseudonimo;
    }

    public String getEstudios() {
        return estudios;
    }

    public int getEdad() {
        return edad;
    }

    public String getPseudonimo() {
        return pseudonimo;
    }

   
   

     
  


}
