/*
EJERCICIO LISTA LIBROS
Crea una lista de Libros y muestra el título de cada uno con un bucle.
 */
package Main_Libro;

import Libreria.Libro;
import Servicio.ServicioLibro;

public class Main_Libro {

    public static void main(String[] args) {
        
    ServicioLibro servicio = new ServicioLibro();

    Libro libros = new Libro();
    
    servicio.crearLibro();
    }
}