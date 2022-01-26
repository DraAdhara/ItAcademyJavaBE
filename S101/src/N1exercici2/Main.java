package N1exercici2;

public class Main {

    public static void main(String[] args) {
 /* A la classe Vehicle afegeix dos mètodes: un static anomenat parar() i un altre no-static anomenat accelerar().
 Demostra com invocar el mètode static i el no-static des del main() (per exempl, enviant un missatge a la consola).
  */
        Vehicle coche1 = new Vehicle("Seat", "León", "Rojo", 2015, 4);

        coche1.iniciar();
        coche1.acelerar();
        Vehicle.parar();

    }
}

