public class TestCine{
    public static void main (String argv[]){
        Pelicula Avatar = new Pelicula("Avatar", 150, 15, ListaGeneros.Aventuras );
        
        SalaCine Cinesa = new SalaCine(8,8, Avatar,12);
        
        Cinesa.venderAsiento(new Espectador("Pablo", 19, 50),Avatar);
        Cinesa.venderAsiento(new Espectador("Gonzalo", 18, 20),Avatar);
        Cinesa.venderAsiento(new Espectador("Sergio", 20, 21),Avatar);
        Cinesa.venderAsiento(new Espectador("Alex", 18, 30),Avatar);
        Cinesa.venderAsiento(new Espectador("Jimena", 19, 50),Avatar);
        Cinesa.venderAsiento(new Espectador("Luis", 23, 40),Avatar);
        Cinesa.venderAsiento(new Espectador("Guille", 18, 10),Avatar);
        Cinesa.venderAsiento(new Espectador("Silvia", 23, 8),Avatar);
        Cinesa.venderAsiento(new Espectador("Daniel", 23, 30),Avatar);
        Cinesa.venderAsiento(new Espectador("Javier", 13, 12),Avatar);
        Cinesa.venderAsiento(new Espectador("Jose", 19, 50),Avatar);
        Cinesa.venderAsiento(new Espectador("Elena", 19, 50),Avatar);
        
        Cinesa.MostrarSala();
        System.out.println("-----------------------------------------");
        System.out.println("            INFORMACION SESION           ");
        System.out.println("-----------------------------------------");
        System.out.println("Pelicula: [" + Avatar.titulo + "]");
        System.out.println("Nº de Espectadores: "+ Cinesa.cantEspectadores());
        System.out.println("Recaudacion: " + Cinesa.recaudacion());
        Cinesa.informeSala();
    }
 

    
}