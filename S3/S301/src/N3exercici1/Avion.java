package N3exercici1;

public class Avion  implements Order {
    private Vehiculo avion;

    public Avion(Vehiculo avion) {
        this.avion = avion;

    }

    @Override
    public void execute() {
        avion.acelerar();
        avion.arrancar();
        avion.frenar();

    }
}