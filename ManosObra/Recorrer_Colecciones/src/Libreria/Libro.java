/*
EJERCICIO LISTA LIBROS
Crea una lista de Libros y muestra el título de cada uno con un bucle.
 */
package Libreria;

public class Libro {
    
////    ATRIBUTOS
    private String Titulo;
    
////    CONSTRUCTORES

    public Libro() {
    }
    public Libro(String Titulo) {
        this.Titulo = Titulo;
    }

////    GETTERS & SETTERS

    public String getTitulo() {
        return Titulo;
    }
    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

////    TO STRING

    @Override
    public String toString() {
        return "Libro{" + "Titulo=" + Titulo + '}';
    }
}