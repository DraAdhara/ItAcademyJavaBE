package N1exercici2;

//IDE me lo marca como Redundant suppression, @SupressWarnings evita que salte el warning cuando se llama a un metodo obsoleto
@SuppressWarnings("deprecation")
public class ClaseHija extends ClasePadre {

    private int peso;

    public ClaseHija(int edad, String nombre, String apellido, int peso) {
        super(edad, nombre, apellido);
        this.peso = peso;

    }

    @Deprecated
    public String programar() {
        return "La ClaseHija está programando";


    }

}
