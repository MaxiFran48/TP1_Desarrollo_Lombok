package main.java.factory;


import lombok.Getter;
import lombok.ToString;

@ToString
@Getter
public class LibroFisico implements Libro {

    private String titulo;

    /**Creamos el titulo y tipo**/
    public LibroFisico(String titulo) {
        this.titulo = titulo;
    }

    /**Getter de la clase**/
    public String getTipo() {
        return "Fisico";
    }

}
