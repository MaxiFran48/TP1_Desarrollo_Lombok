package main.java.factory;

public class LibroDigital implements Libro{

    private String titulo;

    /**Creamos el titulo y tipo**/
    public LibroDigital(String titulo) {
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }

    /**Getter de la clase**/
    public String getTipo() {
        return "Digital";
    }

    /**Metodo que nos permite mostrar los libros**/
    @Override
    public String toString() {
        return getTitulo() + " (" + getTipo() + ")";
    }

}
