package main.java.Singleton;

import main.java.factory.Libro;
import java.util.ArrayList;
import java.util.List;

public class DataBase {

    /**lista para guardar los libros creados**/
    private final List<Libro> libros = new ArrayList<>();

    /**Unica instancia de databse**/
    private static volatile DataBase instance;

    /**El contructor de la clase**/
    private DataBase() {}

    /**El metodo para crear la instancia si no existe**/
    public static DataBase getInstance() {
        if (instance == null) {
            synchronized (DataBase.class) {
                if (instance == null) {
                    instance = new DataBase();
                }
            }
        }
        return instance;
    }

    public void agregarLibro(Libro libro) {
        libros.add(libro);
    }

    public void eliminarLibro(Libro libro) {
        libros.remove(libro);
    }

    public List<Libro> listarLibros() {
        return libros;
    }

}
