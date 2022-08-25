/*
Un cine necesita implementar un sistema en el que se puedan cargar peliculas. Para esto, 
tendremos una clase Pelicula con el título, director y duración de la película (en horas). 
Implemente las clases y métodos necesarios para esta situación, teniendo en cuenta lo 
que se pide a continuación:

En el servicio deberemos tener un bucle que crea un objeto Pelicula pidiéndole al usuario 
todos sus datos y guardándolos en el objeto Pelicula.
Después, esa Pelicula se guarda una lista de Peliculas y se le pregunta al usuario si quiere 
crear otra Pelicula o no.

Después de ese bucle realizaremos las siguientes acciones: 

•  Mostrar en pantalla todas las películas.
•  Mostrar en pantalla todas las películas con una duración mayor a 1 hora.
•  Ordenar las películas de acuerdo a su duración (de mayor a menor) y mostrarlo en 
pantalla.
•  Ordenar las películas de acuerdo a su duración (de menor a mayor) y mostrarlo en 
pantalla.
•  Ordenar las películas por título, alfabéticamente y mostrarlo en pantalla.
•  Ordenar las películas por director, alfabéticamente y mostrarlo en pantalla.
 */
package Servicio;

import Entidad.Comparador;
import Entidad.Pelicula;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ServicioPeli {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    //Lista que contendrá a las películas:
    ArrayList<Pelicula> arrayMovies = new ArrayList();

    ///MÉTODO CREAR PELÍCULA:
    public void crearPelicula() {

        String opcionSiNo;

        do {

            System.out.println("Ingrese título de película:");
            String titulo = leer.next().toLowerCase();

            System.out.println("\nIngrese director:");
            String director = leer.next().toLowerCase();

            System.out.println("\nIngrese duración:");
            double duracion = leer.nextFloat();

            arrayMovies.add(new Pelicula(titulo, director, duracion));

            do {

                System.out.println("\n¿Desea crear otra película? s/n");
                opcionSiNo = leer.next().toLowerCase();

            } while (!opcionSiNo.equals("n") && !opcionSiNo.equals("s"));

            System.out.println("");

        } while (!opcionSiNo.equals("n"));
    }

///MOSTRAR TODAS LAS PELIS:  
public void mostrarPeliculas(){
    
    for (Pelicula moviesForEach : arrayMovies) {
        
        System.out.println(moviesForEach);
    }
    System.out.println("");
}    
    
    
///MOSTRAR PELIS > 1hr:
    public void mostrarPeliculas1hr() {     
        
        for (Pelicula moviesForEach : arrayMovies) {

            if (moviesForEach.getDuracion() > 1) {

                System.out.println(moviesForEach);
            }
        }
        System.out.println("");
    }

///ORDENAR PELIS ASCENDENTE y DESCENDENTE:
    public void ordenarPeliculas(){
        
        System.out.println("\nDuración (- a +)");
        Collections.sort(arrayMovies, Comparador.compararDuracionAscendente);
        
        mostrarPeliculas();
        
        System.out.println("\nDuración (+ a -)");
        Collections.sort(arrayMovies, Comparador.compararDuracionDescendente);
        
        mostrarPeliculas();
    }

///ORDENAR PELIS x TÍTULO:
    public void ordenarTitulos(){
        
        Collections.sort(arrayMovies, Comparador.compararTitulos);
        
        mostrarPeliculas();
    }
    
///ORDENAR PELIS x DIRECTOR:    
    public void ordenarDirector(){
        
        Collections.sort(arrayMovies, Comparador.compararDirector);
        
        mostrarPeliculas();
    }

///ORDENAR TODOS LOS MÉTODOS:
    public void servicioOrdenado(){
        
        crearPelicula();
        
        System.out.println("\nPELIS > 1hr_______________________");
        mostrarPeliculas1hr();
        
        System.out.println("\nORDENANDO PELIS___________________");
        ordenarPeliculas();
        
        System.out.println("\nTítulos (A-Z)___________________");
        ordenarTitulos();
        
        System.out.println("\nDirector (A-Z)___________________");
        ordenarDirector();
    }
}
