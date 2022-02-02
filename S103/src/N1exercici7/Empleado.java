package N1exercici7;

public class Empleado {

    private static String nombre;
    private double sueldo;

    public Empleado(String nombre) {
        this.nombre = nombre;
        sueldo = 1000;
    }
@Override
    public String toString() {

        return"[Nombre ="+nombre+",sueldo="+sueldo+"]";
    }
}

