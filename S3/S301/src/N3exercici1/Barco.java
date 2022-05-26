package N3exercici1;

public class Barco implements Order {
    private Vehiculo barco;

    public Barco (Vehiculo barco) {
        this.barco=barco;

        }
    @Override
    public void execute() {
        barco.acelerar();
        barco.arrancar();
        barco.frenar();

        }
}
