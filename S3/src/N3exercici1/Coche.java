package N3exercici1;

public class Coche  implements Order{
    private Vehiculo coche;

    public Coche (Vehiculo coche) {
        this.coche=coche;

    }
    @Override
    public void execute() {
        coche.acelerar();
        coche.arrancar();
        coche.frenar();

    }

}
