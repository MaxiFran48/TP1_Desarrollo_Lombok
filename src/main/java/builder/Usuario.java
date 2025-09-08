package main.java.builder;

import java.time.LocalDate;

public class Usuario {

    private String nombre;
    private String email;
    private String direccion;
    private int telefono;
    private LocalDate fechaNacimiento;

    private Usuario (Builder builder) {
        this.nombre = builder.nombre;
        this.email = builder.email;
        this.direccion = builder.direccion;
        this.telefono = builder.telefono;
        this.fechaNacimiento = builder.fechaNacimiento;
    }

    /**Metodo builder para hacer instancias**/
    public static class Builder {
        private String nombre;
        private String email;
        private String direccion;
        private int telefono;
        private LocalDate fechaNacimiento;

        public Builder nombre(String nombre) {
            this.nombre = nombre;
            return this;
        }

        public Builder email(String email) {
            this.email = email;
            return this;
        }

        public Builder direccion(String direccion) {
            this.direccion = direccion;
            return this;
        }

        public Builder telefono(int telefono) {
            this.telefono = telefono;
            return this;
        }

        public Builder fechaNacimiento(LocalDate fechaNacimiento) {
            this.fechaNacimiento = fechaNacimiento;
            return this;
        }

        public Usuario build() {
            return new Usuario(this);
        }

    }

    /**Metodo que nos permite mostrar los ususarios**/
    @Override
    public String toString() {
        return "Usuario:\n" +
                "   nombre = " + nombre + "\n" +
                "   email = " + email + "\n" +
                "   direccion = " + direccion + "\n" +
                "   telefono= " + telefono + "\n" +
                "   fechaNacimiento = " + fechaNacimiento;
    }

}
