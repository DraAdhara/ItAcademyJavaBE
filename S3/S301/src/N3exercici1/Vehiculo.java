package N3exercici1;

public class Vehiculo {
    protected String tipo;

    public Vehiculo (String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void arrancar () {
        System.out.println("El " +tipo+ " ha arrancado.");
    }
    public void acelerar() {
        System.out.println("El " +tipo+ " ha acelerado.");
    }
    public void frenar () {
        System.out.println("El " +tipo+ " ha frenado.");
    }

}
