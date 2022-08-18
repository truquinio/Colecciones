/*
EJERCICIO LISTA LIBROS
Crea una lista de Libros y muestra el título de cada uno con un bucle.
 */
package Servicio;

import java.util.ArrayList;
import java.util.Scanner;

public class ServicioLibro {

    private Scanner leer = new Scanner(System.in).useDelimiter("\n");

/// FUNCIÓN PARA CREAR Y LLENAR CON INFO UN LIBRO:
    public void crearLibro() {

        //LISTA:  (Pueden repetir elementos)
        ArrayList<String> libros = new ArrayList();
        
        System.out.println("Ingrese la cantidad de libros:");
        int cantidad = leer.nextInt();

        //Agregar elementos con FOR (i):
        for (int i = 0; i < cantidad; i++) {
            System.out.println("Ingrese el título del libro:");
            String title = leer.next();
            libros.add(title);
        }
        
        System.out.println("\nMuestra libros c/ for (i): " + libros);

        //Agregar elementos con FOR EACH:
        System.out.print("Muestra libros c/ for each: ");
        for (String String : libros) {
            System.out.print(String + " ");
        }
        System.out.println("\n");
    }
}