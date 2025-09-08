package main.java.prototype;

import main.java.builder.Usuario;
import main.java.factory.Libro;
import java.time.LocalDate;

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

    /**Metodo que nos permite mostrar los prestamos**/
    @Override
    public String toString() {
        return "Préstamo:" +
                "\n  Libro = " + libro.getTitulo() + " (" + libro.getTipo() + ")" +
                "\n" + usuario +
                "\n  Fecha de inicio = " + fechaInicio +
                "\n  Fecha de fin = " + fechaFin;
    }

    public Libro getLibro() {
        return libro;
    }

    public void setLibro(Libro libro) {
        this.libro = libro;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public LocalDate getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(LocalDate fechaFin) {
        this.fechaFin = fechaFin;
    }
}
