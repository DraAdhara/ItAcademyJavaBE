package N1exercici1;

public class Main {

    public static void main(String[] args) {
    /*Exercici 1. Crea una classe Vehicle amb un constructor i un mètode anomenat iniciar(),
    que es invocat pel main() (aquest mètode pot estar en la mateixa classe o en una classe apart) .
    Demostra la seqüència d'execució dels mètodes de la classe (per exemple, enviant un missatge a la consola).
    */
    Vehicle coche1 = new Vehicle("Seat", "León", "Rojo", 2015, 4);

    coche1.iniciar();

    }
}
