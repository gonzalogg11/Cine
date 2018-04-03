public class Espectador {
    protected static int numEspectadores = 0;
    protected int id;
    protected String nombre;
    protected int edad;
    protected int cartera;

    public Espectador(String nombre, int edad, int cartera) {
        numEspectadores++;
        this.id = numEspectadores;
        this.nombre = nombre;
        this.edad = edad;
        this.cartera = cartera;
    }

    public String toString() {
        return "Cliente ["+ id + "], Nombre [" + nombre + "], Edad [" 
        + edad +"], Dinero [" + cartera +"]";
    }
}
