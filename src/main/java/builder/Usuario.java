package main.java.builder;

import lombok.Builder;
import lombok.ToString;

import java.time.LocalDate;

@ToString
@Builder
public class Usuario {

    private String nombre;
    private String email;
    private String direccion;
    private int telefono;
    private LocalDate fechaNacimiento;

}
