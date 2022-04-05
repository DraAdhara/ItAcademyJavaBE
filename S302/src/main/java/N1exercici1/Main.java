package N1exercici1;

public class Main {
    public static void main (String[]args){
/*Dissenya un sistema en el qual un Agent de Borsa (Observable) notifica a diverses agències de Borsa (Observers)
canvis quan la Borsa puja o baixa.

Serà necessari que l'objecte Observable mantingui referències als Observers.
Encara que ha estat deprecada a partir de Java 9, pot utilitzar la interfície java.util.Observer si ho desitges
*/
   Agencia agencia = new Agencia();

   //Añadimos varias agencias

   agencia.nuevaAgencia(new Observadores("Abante"));
   agencia.nuevaAgencia(new Observadores("JB Capital"));
   agencia.nuevaAgencia(new Observadores("Norbolsa"));
   agencia.nuevaAgencia(new Observadores("Value Tree"));

   //Notificamos

   agencia.notificar();

    }
}
