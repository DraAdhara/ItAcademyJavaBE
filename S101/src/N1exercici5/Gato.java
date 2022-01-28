package N1exercici5;

public class Gato extends Animal{
        private final boolean domestico;


    public Gato(String nombre, String color, int edad, boolean domestico) {
        super(nombre, color, edad);
        if (domestico) this.domestico = true;
        else this.domestico = false;

    }

    public void correr (int patas, int velocidad, String sonido){
        System.out.println("Estoy corriendo con mis " + patas +" patas a " + velocidad + "km/h mientras digo " + sonido + ".");

    }
}
