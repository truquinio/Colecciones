/*
EJERCICIO LISTA LIBROS
Crea una lista de Libros y muestra el título de cada uno con un bucle.
 */
package Main_Libro;

import java.util.ArrayList;
import java.util.Scanner;

public class Main_Libro {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        ArrayList<String> arrayLibros = new ArrayList();

        String opcion = null;

        do {
            System.out.println("Ingrese el título del libro:");
            String title = leer.next();
            arrayLibros.add(title);

            System.out.println("¿Desea ingresar otro título? s/n");
            opcion = leer.next().toLowerCase();

        } while (!opcion.equals("n"));

        System.out.println("");

        for (String libro : arrayLibros) {
            System.out.println("Título: " + libro);
        }
        System.out.println("");
    }
}