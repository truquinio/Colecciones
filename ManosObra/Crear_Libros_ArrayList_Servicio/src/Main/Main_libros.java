/*
EJERCICIO LISTA LIBROS
Crea una lista de Libros y muestra el título de cada uno con un bucle.
 */
package Main;

import Servicio.ServicioLibros;

public class Main_libros {

    public static void main(String[] args) {

        ServicioLibros librosCreados = new ServicioLibros();

        librosCreados.crearLibro();
    }
}