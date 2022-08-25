/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
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
                          
             return director1.getTitulo().compareTo(director2.getTitulo());
         }
     };
}