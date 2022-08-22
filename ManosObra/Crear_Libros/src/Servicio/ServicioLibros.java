/*
EJERCICIO LISTA LIBROS
Crea una lista de Libros y muestra el título de cada uno con un bucle.
 */
package Servicio;

import Entidad.Libro;
import java.util.ArrayList;
import java.util.Scanner;

public class ServicioLibros {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    ArrayList<Libro> arrayLibros = new ArrayList();

    /// FUNCIÓN PARA CREAR Y LLENAR CON INFO UN LIBRO:
    public void crearLibro() {

        String opcion = null;

        do {
            System.out.println("Ingrese el título del libro:");
            String titulo = leer.next();
            
            Libro objetoTitulos = new Libro(titulo);
            
            arrayLibros.add(objetoTitulos);

            System.out.println("¿Desea ingresar otro título? s/n");
            opcion = leer.next().toLowerCase();

        } while (!opcion.equals("n"));

        for (Libro libro : arrayLibros) {

            System.out.println(libro);
        }
        System.out.println("");
    }
}