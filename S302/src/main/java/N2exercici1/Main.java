package N2exercici1;

public class Main {
 public static void main (String []args){
 /*CallBack: Simula una passarel·la de pagament que rebi un objecte encapsulador del mètode de pagament a efectuar:
 targeta de crèdit, Paypal o deute en compte bancari.

La passarel·la invocarà el pagament sense conèixer la forma i retornant el control a la classe d'origen.
La classe que invoca la passarel·la de pagament serà una botiga de sabates.

  */

//Generamos las distintas tiendas
  TiendaZapatos merkal = new TiendaZapatos();
  TiendaZapatos spartoo = new TiendaZapatos();

  IFormaPago a = new Credito();
  IFormaPago b = new PayPal();
  IFormaPago c = new CuentaBanco();

//Llamamos a los callback
merkal.pago(a);
merkal.pago(b);
spartoo.pago(c);
 }

}
