package N1exercici5;

public class Main {

    public static void main(String[] args) {
        /*Exercici 5. Crea una classe Animal amb el mètode correr() sobrecarregat tres vegades. Defineix una nova classe
         (per exemple Gat) que hereti de l'anterior i afegeix una nova versió sobrecarregada del mateix mètode.
         Mostra que els quatre mètodes estan disponibles a la classe derivada (per exemple enviant un missatge a la consola).
         */

        Gato mixi = new Gato("Silvestre", "blanco y negro", 8, true);

        //Llamamos a los 3 metodos sobrecargados de la superclase Animal
        mixi.correr();
        mixi.correr(4);
        mixi.correr(4, 6);

        //llamamos al metodo sobrecargado de la subclase Gato
        mixi.correr(4,8,"miau");

    }
}
