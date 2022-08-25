/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

public class Pelicula {

///ATRIBUTOS:
    private String titulo;
    private String director;
    private Double duracion;
    
///CONSTR:
    public Pelicula() {
    }
    public Pelicula(String titulo, String director, Double duracion) {
        this.titulo = titulo;
        this.director = director;
        this.duracion = duracion;
    }

///G & S:
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getDirector() {
        return director;
    }
    public void setDirector(String director) {
        this.director = director;
    }
    public Double getDuracion() {
        return duracion;
    }
    public void setDuracion(Double duracion) {
        this.duracion = duracion;
    }
    
///TOSTRING:

    @Override
    public String toString() {
        return "Titulo: " + titulo + ", Director:" + director + ", Duracion=" + duracion;
    }
    
}