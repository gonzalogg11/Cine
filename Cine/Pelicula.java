public class Pelicula {
    protected String titulo;
    protected int duracion;
    protected int minedad;
    protected ListaGeneros genero;

    public Pelicula(String titulo, int duracion, int minedad, ListaGeneros genero) {
        this.titulo = titulo;
        this.duracion = duracion;
        this.minedad = minedad;
        this.genero = genero;
    }

    public String toString() {
        return "Titulo ["+ titulo + "], Duracion [" + duracion + "], Calificacion [" 
        + minedad +"], Genero [" + genero +"]";
    }
}