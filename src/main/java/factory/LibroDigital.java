package main.java.factory;

import lombok.Getter;
import lombok.ToString;

@ToString
@Getter
public class LibroDigital implements Libro{

    private String titulo;

    /**Creamos el titulo y tipo**/
    public LibroDigital(String titulo) {
        this.titulo = titulo;
    }

    /**Getter de la clase**/
    public String getTipo() {
        return "Digital";
    }

}
