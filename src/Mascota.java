public class Mascota {
    //atributos de la clase Mascotas
    String nombre;
    String especie;
    int edad;

    //Constructor
    public Mascota(String nombre, String especie, int edad){
        this.nombre = nombre;
        this.especie = especie;
        this.edad = edad;
        
    }
    //metodo
    public void mostrarInfo(){
        System.out.println("EL nombre de la mascota es: " + nombre); // se muestra el nombre de la mascota
        System.out.println("EL nombre de la especie es: " + especie); //se muestra la especie
        System.out.println("La edad de la mascota es: " + edad); //se muestra la edad
    }
}
