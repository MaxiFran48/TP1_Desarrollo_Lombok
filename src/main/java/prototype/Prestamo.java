package main.java.prototype;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import main.java.builder.Usuario;
import main.java.factory.Libro;
import java.time.LocalDate;

@ToString
@Getter
@Setter
public class Prestamo implements Cloneable{

    private Libro libro;
    private Usuario usuario;
    private LocalDate fechaInicio;
    private LocalDate fechaFin;

    public Prestamo(Libro libro, Usuario usuario, LocalDate fechaInicio, LocalDate fechaFin) {
        this.libro = libro;
        this.usuario = usuario;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
    }

    /**Metodo para clonar los prestamos, con shallow**/
    public Prestamo clone() {
        try {
            return (Prestamo) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }
}
