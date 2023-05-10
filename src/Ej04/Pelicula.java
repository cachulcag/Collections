/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ej04;

/**
 *
 * @author crist
 */
public class Pelicula {
    private String titulo;
    private String director;
    private Double duracion;

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

    public void setDuracion(Double duración) {
        this.duracion = duración;
    }

    @Override
    public String toString() {
        return "TITULO : " + titulo + ", DIRECTOR : " + director + ", DURACION : " + duracion;
    }
    
    
}
