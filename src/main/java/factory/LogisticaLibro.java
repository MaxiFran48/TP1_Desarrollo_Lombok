package main.java.factory;

public class LogisticaLibro {

    public static Libro crearLibro(String tipo, String titulo) {
        if (tipo.equals("Fisico")) {
            return new LibroFisico(titulo);
        }
        else if (tipo.equals("Digital")) {
            return new LibroDigital(titulo);
        }
        return null;
    }

}
