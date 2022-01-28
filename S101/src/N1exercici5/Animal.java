package N1exercici5;

public class Animal {

    private String nombre;
    private String color;
    private int edad;

    public Animal (String nombre, String color, int edad){
        this.nombre = nombre;
        this.color  = color;
        this.edad   = edad;
    }

    public void correr (){
        System.out.println("Estoy corriendo.");
    }

    public void correr(int patas){
        System.out.println("Estoy corriendo con mis " + patas + " patas.");
    }
    public void correr(int patas, int velocidad){
        System.out.println("Estoy corriendo con mis " + patas + " patas a " + velocidad + "km/h.");
    }

}
