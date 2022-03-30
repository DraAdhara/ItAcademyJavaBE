package N3exercici1;

public class Main {

    public static void main (String [] args) {
/*
Dissenya un pàrquing de 4 vehicles: un cotxe, una bicicleta, un avió i un vaixell. Mostri com funciona el patró Command
que implementi els mètodes arrencar, accelerar i frenar per a cada tipus de vehicle.
 */
    Vehiculo v1= new Vehiculo("coche");
    Vehiculo v2 = new Vehiculo ("bicicleta");
    Vehiculo v3 = new Vehiculo ("avion");
    Vehiculo v4 = new Vehiculo ("barco");

    Coche  c1= new Coche (v1);
    Bicicleta bi1= new Bicicleta(v2);
    Avion a1 = new Avion(v3);
    Barco ba1= new Barco (v4);

    Broker broker = new Broker();
    broker.takeOrder(c1);
    broker.takeOrder(bi1);
    broker.takeOrder(a1);
    broker.takeOrder(ba1);


    broker.placeOrders();
        }
}
