/*
Continuando el ejercicio anterior, después de mostrar los perros, al usuario se le pedirá 
un perro y se recorrerá la lista con un Iterator, se buscará el perro en la lista.  Si el perro 
está en la lista, se eliminará el perro que ingresó el usuario y se mostrará la lista 
ordenada. Si el perro no se encuentra en la lista, se le informará al usuario y se mostrará 
la lista ordenada.
 */
package Main_Perros;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class Main_Dogs {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        ArrayList<String> arrayRazas = new ArrayList();

        String opcionSiNo = null;

///CREA LAS RAZAS DE PERROS:        
        do {
            System.out.println("Ingrese raza de perro:");
            String raza = leer.next().toLowerCase();
            arrayRazas.add(raza);

            do {

                System.out.println("\n¿Desea ingresar otra raza? s/n");
                opcionSiNo = leer.next().toLowerCase();

                System.out.println("");

            } while (!opcionSiNo.equals("n") && !opcionSiNo.equals("s"));

        } while (!opcionSiNo.equals("n"));

        
///IMPRIMO TODAS LAS RAZAS INGRESADAS:
        for (String arrayRazaForEach : arrayRazas) {
            System.out.println("Raza perro: " + arrayRazaForEach);
        }
        System.out.println("");

        System.out.println("Ingrese la raza a eliminar:");
        String buscarRaza = leer.next().toLowerCase();

        //Creo objeto iterator para recorrer la lista:
        Iterator objetoIterator = arrayRazas.iterator();

        System.out.println("\nBuscando raza...");

        
///ELIMINA RAZA INGRESADA por TECLADO:
        boolean razaEncontrada = false;

        while (objetoIterator.hasNext()) {

            if (objetoIterator.next().equals(buscarRaza)) {

                objetoIterator.remove();

                razaEncontrada = true;
            }
        }
        if (razaEncontrada) {
            System.out.println("La raza fue eliminada.\n");
            
        } else {
            
            System.out.println("La raza no fue encontrada.\n");
        }

///IMPRIMO LAS RAZAS QUE QUEDAN:
        Collections.sort(arrayRazas);

        System.out.println("Aún quedan:");
        
        for (String arrayRaza : arrayRazas) {

            System.out.println("Raza perro: " + arrayRaza);
        }
        System.out.println("");
    }
}