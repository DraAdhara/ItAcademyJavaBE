package N3exercici1;

public class Bicicleta implements Order {
    private Vehiculo bicicleta;
    public Bicicleta (Vehiculo bicicleta) {
        this.bicicleta=bicicleta;

    }
    @Override
    public void execute() {
        bicicleta.acelerar();
        bicicleta.arrancar();
        bicicleta.frenar();

    }

}

