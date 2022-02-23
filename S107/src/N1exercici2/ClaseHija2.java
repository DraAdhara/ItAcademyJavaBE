package N1exercici2;
//IDE me lo marca como Redundant suppression, @SupressWarnings evita que salte el warning cuando se llama a un metodo obsoleto
@SuppressWarnings("deprecation")
public class ClaseHija2 extends ClasePadre {
    private String color;

    public ClaseHija2 (int edad, String nombre, String apellido, String color) {
        super(edad, nombre, apellido);
        this.color = color;
    }

    @Deprecated
    public String descansar() {
        return "La ClaseHija2 está descansando";
    }
}
