package N1exercici3;


public class DemoCarga {
    static int estatico = 0;

    public DemoCarga() {
        System.out.println("Este es el constructor de la clase DemoCarga.");
    }

    static {
        System.out.println("Este bloque es estático.");
    }

    {
        System.out.println("Este bloque es de iniciación.");
    }
}