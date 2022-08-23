/*
EJERCICIO LISTA LIBROS
Crea una lista de Libros y muestra el título de cada uno con un bucle.
 */
package Entidad;

public class Libro {
    
    private String titulo;
    
    ///CONSTR:
    public Libro() {
    }
    public Libro(String titulo) {
        this.titulo = titulo;
    }
    ///G & S:
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    ///To STRING:

    @Override
    public String toString() {
        return "Libro{ " + "titulo: " + titulo + '}';
    }
    
}
