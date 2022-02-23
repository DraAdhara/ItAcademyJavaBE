package N1exercici2;

public class ClasePadre {
    private int edad;
    private String nombre;
    private String apellido;

    public ClasePadre(int edad,String nombre, String apellido) {
        this.edad = edad;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public String programar() {
        return "La ClasePadre está programando";
    }

    public String descansar() {
        return "La ClasePadre está descansando";
    }

    public String toString() {
        return "Nombre:"+nombre+" "+apellido+". Edad: "+edad + ".";

    }
}

