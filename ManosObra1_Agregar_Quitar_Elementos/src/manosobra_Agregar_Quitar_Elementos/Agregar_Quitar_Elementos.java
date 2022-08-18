/*
EJERCICIO COLECCIONES
Toma la Lista, el Conjunto y el Mapa del ejemplo y agrega 5 objetos a cada uno.
 */
package manosobra_Agregar_Quitar_Elementos;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeSet;

public class Agregar_Quitar_Elementos {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");

//LISTA:  (Pueden repetir elementos)
        System.out.println("___LISTAS______________________________________\n");
        
        ArrayList<Integer> numerosA = new ArrayList();

        System.out.println("Listado vacío: " + numerosA);

        //int x = 10;
        //Agregar 5 elementos con FOR (i):
        for (int i = 0; i < 5; i++) {
            numerosA.add(i);
        }
        System.out.println("Listado lleno c/ for (i): " + numerosA + "\n");

        //Agregar 5 elementos con FOR EACH:
        for (Integer integer : numerosA) {
            System.out.println("Listado lleno c/ for each: " + integer);
        }
        System.out.println("");

        //Eliminar por índice:
        numerosA.remove(2); //remove.int

        System.out.println("Elimino índice 2 del listado: " + numerosA);

        //Eliminar por elementos:
        numerosA.remove(2); //remove.object

        System.out.println("Elimino objeto 2 del listado: " + numerosA);

//CONJUNTO:  (No pueden repetir elementos)
        System.out.println("\n___CONJUNTOS_________________________________\n");

        TreeSet<Integer> numerosB = new TreeSet();

        System.out.println("Conjunto vacío: " + numerosB);

        //Agregar 5 elementos con FOR (i):
        for (int i = 0; i < 5; i++) {
            numerosB.add(i);
        }
        System.out.println("Conjunto lleno: " + numerosB + "\n");

        //Agregar 5 elementos con FOR EACH:
        for (Integer integer : numerosB) {
            System.out.println("Conjunto lleno c/ for each: " + integer);
        }
        System.out.println("");

        //Eliminar por elementos:
        numerosB.remove(3);

        System.out.println("Elimino objeto 3 del conjunto: " + numerosA);

//MAPA:
        System.out.println("\n___MAPAS_____________________________________\n");

        HashMap<Integer, String> alumnos = new HashMap();

        System.out.println("Mapa vacío: " + alumnos + "\n");

        int dni;
        String nombre;

        //Agregar 2 elementos con FOR (i):
        for (int i = 0; i < 2; i++) {

            System.out.println("Ingrese DNI:");
            dni = leer.nextInt();

            System.out.println("Ingrese nombre:");
            nombre = leer.next().toLowerCase();

            alumnos.put(dni, nombre);
        }
        System.out.println("\nMapa lleno con for (i): " + alumnos + "\n");

        //Agregar 2 elementos con FOR EACH:
        System.out.println("Mapa lleno con for each: ");
        for (Map.Entry<Integer, String> entry : alumnos.entrySet()) {
            Integer key = entry.getKey();
            String value = entry.getValue();

            System.out.println("DNI: " + entry.getKey() + ", Nombre: " + entry.getValue());
        }

        //Eliminar por llave:
        System.out.println("\nIngrese el DNI a eliminar:");
        int dni2 = leer.nextInt();

        alumnos.remove(dni2);

        System.out.println("\nLa llave que queda es: " + alumnos + "\n");
    }
}
