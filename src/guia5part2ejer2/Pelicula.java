
package guia5part2ejer2;

import java.util.Objects;

class Pelicula {

    private String titulo;
    private String director;
    private int duracion;

    public Pelicula(String titulo, String director, int duracion) {
        this.titulo = titulo;
        this.director = director;
        this.duracion = duracion;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDirector() {
        return director;
    }

    public int getDuracion() {
        return duracion;
    }

    @Override
    public String toString() {
        return "Título: " + titulo + ", Director: " + director + ", Duración: " + duracion + " horas";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Pelicula pelicula = (Pelicula) obj;
        return titulo.equals(pelicula.titulo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(titulo);
    }
}
