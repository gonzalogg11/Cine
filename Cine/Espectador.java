public class Espectador {
    protected static int id = 0000;
    protected String nombre;
    protected int edad;
    protected int cartera;

    public Espectador(String nombre, int edad, int cartera) {
        id = id++;
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
        this.cartera = cartera;
    }

    public String toString() {
        return "Cliente ["+ id + "], Nombre [" + nombre + "], Edad [" 
        + edad +"], Dinero [" + cartera +"]";
    }
}