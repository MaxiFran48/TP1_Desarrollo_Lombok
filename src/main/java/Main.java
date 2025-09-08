package main.java;

import main.java.Singleton.DataBase;
import main.java.abstractfactory.AbstractFactory;
import main.java.abstractfactory.AdminFactory;
import main.java.abstractfactory.UsuarioFactory;
import main.java.builder.Usuario;
import main.java.factory.Libro;
import main.java.factory.LogisticaLibro;
import main.java.prototype.Prestamo;
import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        /**Creamos un usuario**/
        Usuario u1 = new Usuario.Builder()
                .nombre("Juan")
                .email("juan@gmail.com")
                .direccion("Av. San Martin")
                .telefono(234123)
                .fechaNacimiento(LocalDate.of(2000, 8, 10))
                .build();

        /**Lo motramos**/
        System.out.println("----------------------------------------------------------------------");
        System.out.println(u1);
        System.out.println("----------------------------------------------------------------------");

        /**Creamos otro usuario**/
        Usuario u2 = new Usuario.Builder()
                .nombre("Federico")
                .email("fede@gmail.com")
                .direccion("Av. San Martin")
                .telefono(2412432)
                .fechaNacimiento(LocalDate.of(2000, 6, 10))
                .build();

        /**Lo motramos**/
        System.out.println("----------------------------------------------------------------------");
        System.out.println(u2);
        System.out.println("----------------------------------------------------------------------");

        /**Creamos los libros**/
        Libro l1 = LogisticaLibro.crearLibro("Fisico","It");
        Libro l2 = LogisticaLibro.crearLibro("Digital","Martin Fierro");

        System.out.println("Tipo del primer libro: " + l1.getTipo());
        System.out.println("Tipo del segundo libro: " + l2.getTipo());

        System.out.println("----------------------------------------------------------------------");
        /**Metemos los libros a la lista y los mostramos en pantalla**/
        DataBase db = DataBase.getInstance();
        DataBase db2 = DataBase.getInstance();
        DataBase db3 = DataBase.getInstance();

        /**Mostramos que es la misma BD en todos los casos**/
        System.out.println("Mostrando la BD");
        System.out.println(db);
        System.out.println(db2);
        System.out.println(db3);
        System.out.println("----------------------------------------------------------------------");

        db.agregarLibro(l1);
        db.agregarLibro(l2);
        System.out.println("Libros en la base de datos: "+ db.listarLibros());
        System.out.println("----------------------------------------------------------------------");

        /**Creamos el prestamo y lo clonamos**/
        Prestamo p1 = new Prestamo(l1, u1, LocalDate.now(), LocalDate.now().plusDays(7));
        Prestamo p2 = p1.clone();
        Prestamo p3 = p1.clone();

        p2.setLibro(l2);

        p3.setUsuario(u2);

        /**Mostramos que son independientes**/
        System.out.println(p1);
        System.out.println("----------------------------------------------------------------------");
        System.out.println(p2);
        System.out.println("----------------------------------------------------------------------");
        System.out.println(p3);
        System.out.println("----------------------------------------------------------------------");

        /**Creamos un Admin**/
        AbstractFactory fadmin = new AdminFactory();
        System.out.println(fadmin.crearUI().render()+ " creada");
        System.out.println(fadmin.crearEnvio().descripcion()+ " creada"+"\n");

        /**Creamos un Usuario**/
        AbstractFactory fusuario = new UsuarioFactory();
        System.out.println(fusuario.crearUI().render()+ " creada");
        System.out.println(fusuario.crearEnvio().descripcion()+ " creada");
        System.out.println("----------------------------------------------------------------------");



    }
}