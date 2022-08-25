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
package Entidad;

import java.util.Comparator;

public class Comparador {
    
    //utilizamos la interfaz Comparator con su función compare() dentro de nuestra clase entidad.
     public static Comparator<Pelicula> compararDuracionAscendente = new Comparator <Pelicula>() {
         @Override
         
         public int compare(Pelicula duracion1, Pelicula duracion2) {
                          
             return duracion1.getDuracion().compareTo(duracion2.getDuracion());
         }
     };
     
     public static Comparator<Pelicula> compararDuracionDescendente = new Comparator <Pelicula>() {
         @Override
         
         public int compare(Pelicula duracion1, Pelicula duracion2) {
                          
             return duracion2.getDuracion().compareTo(duracion1.getDuracion()); //CAMBIO EL ORDEN
         }
     };
     
     public static Comparator<Pelicula> compararTitulos = new Comparator <Pelicula>() {
         @Override
         
         public int compare(Pelicula titulo1, Pelicula titulo2) {
                          
             return titulo1.getTitulo().compareTo(titulo2.getTitulo());
         }
     };
     
     public static Comparator<Pelicula> compararDirector = new Comparator <Pelicula>() {
         @Override
         
         public int compare(Pelicula director1, Pelicula director2) {
                          
             return director1.getDirector().compareTo(director2.getDirector());
         }
     };
}
