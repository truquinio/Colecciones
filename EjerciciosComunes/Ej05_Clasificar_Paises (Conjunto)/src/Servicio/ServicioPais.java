/*
Se requiere un programa que lea y guarde países, y para evitar que se ingresen repetidos 
usaremos un conjunto. El programa pedirá un país en un bucle, se guardará el país en el 
conjunto y después se le preguntará al usuario si quiere guardar otro país o si quiere salir, 
si decide salir, se mostrará todos los países guardados en el conjunto. (Recordemos hacer 
los servicios en la clase correspondiente).

Después deberemos mostrar el conjunto ordenado alfabéticamente: para esto recordar 
cómo se ordena un conjunto.

Por último, al usuario se le pedirá un país y se recorrerá el conjunto con un Iterator, se 
buscará el país en el conjunto y si está en el conjunto se eliminará el país que ingresó el 
usuario y se mostrará el conjunto. Si el país no se encuentra en el conjunto se le informará 
al usuario.
 */
package Servicio;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author FT
 */
public class ServicioPais {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    //Conjunto que contendrá a los países:
    HashSet<String> conjuntoPaises = new HashSet();

///MÉTODO CREAR PAÍSES:
    public void crearPaises() {

        String opcionSiNo;

        do {

            System.out.println("Ingrese país:");
            conjuntoPaises.add(leer.next().toLowerCase());

            do {

                System.out.println("\n¿Desea crear otro país? s/n");
                opcionSiNo = leer.next().toLowerCase();

            } while (!opcionSiNo.equals("n") && !opcionSiNo.equals("s"));

            System.out.println("");

        } while (!opcionSiNo.equals("n"));
    }

///MOSTRAR PAÍSES:
    public void mostrarPaises() {

        for (String paisesForEach : conjuntoPaises) {

            System.out.println("País: " + paisesForEach);
        }
        System.out.println("");
    }

///ORDENAR PAÍSES (A-Z):
    public void ordenarPaises() {

        ArrayList<String> arrayListaPaises = new ArrayList(conjuntoPaises);

        Collections.sort(arrayListaPaises);

        System.out.println("Conjunto de países:");

        for (String listaPaisesForEach : arrayListaPaises) {

            System.out.println("País: " + listaPaisesForEach);
        }
    }

///RECORRER PAISES ITERATOR:
    public void eliminarPaises() {

        System.out.println("\nIngrese país a eliminar:");
        String buscarPais = leer.next().toLowerCase();

        //Creo objeto iterator para recorrer la lista:
        Iterator objetoIterator = conjuntoPaises.iterator();

        System.out.println("\nBuscando país...");

///ELIMINA PAÍS INGRESADO por TECLADO:
        boolean paisEncontrado = false;

        while (objetoIterator.hasNext()) {

            if (objetoIterator.next().equals(buscarPais)) {

                objetoIterator.remove();

                paisEncontrado = true;
            }
        }
        if (paisEncontrado) {
            System.out.println("País eliminado.\n");

            System.out.println("Países que quedan:");
            mostrarPaises();

        } else {

            System.out.println("País no encontrado.\n");
        }
    }

    public void ordenarServicio() {

        crearPaises();

        ordenarPaises();

        eliminarPaises();
    }
}