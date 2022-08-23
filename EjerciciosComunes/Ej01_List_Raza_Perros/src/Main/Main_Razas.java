/*
Diseñar un programa que lea y guarde razas de perros en un ArrayList de tipo String. El 
programa pedirá una raza de perro en un bucle, el mismo se guardará en la lista y 
después se le preguntará al usuario si quiere guardar otro perro o si quiere salir. Si decide 
salir, se mostrará todos los perros guardados en el ArrayList. 
 */
package Main;

import java.util.ArrayList;
import java.util.Scanner;

public class Main_Razas {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        ArrayList<String> arrayRazas = new ArrayList();

        String opcion = null;

        ///CREAR LAS RAZAS DE PERROS:        
        do {
            System.out.println("Ingrese raza de perro:");
            String title = leer.next();
            arrayRazas.add(title);

            System.out.println("¿Desea ingresar otra raza? s/n");
            opcion = leer.next().toLowerCase();

        } while (!opcion.equals("n"));

        System.out.println("");

        for (String razaAuxiliar : arrayRazas) {
            System.out.println("Raza perro: " + razaAuxiliar);
        }
        System.out.println("");
    }
}