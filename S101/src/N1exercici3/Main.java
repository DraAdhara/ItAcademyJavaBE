package N1exercici3;


import java.util.Scanner;

public class Main{

    public static void main(String[] args) {
/* Exercici 3. Demostra que el procés de càrrega d'una classe només té lloc una vegada. Demostra que la càrrega pot ser
 provocada per la creació de la primera instància d'aquesta classe o per l'accés a un membre estàtic d'aquesta.
 Idea: Cerca informació sobre els blocs d'inicialització a Java.
 */
        int elige;
        Scanner input = new Scanner(System.in);
        System.out.println("""
                **Este es el main**
                Indica 1 si deseas generar la carga por la creación de la primera instancia.
                Indica 2 si deseas generar la carga por el acceso a un miembro estático.""");
                elige = input.nextInt();

             if (elige == 1) {
                 //Creamos la primera instancia de la clase
                 DemoCarga dc1 = new DemoCarga();
                 System.out.println("**Carga generada por la creación de la primera instancia.**\n" +
                         "Ahora accedemos a un estático pero la carga de la clase ya se ha realizado anteriormente");
                 //accedemos a un miembro estático, con la clase ya cargada
                 DemoCarga.estatico++;
                 System.out.println(DemoCarga.estatico);
                 System.out.println("Si deseas probar otra opción, vuelve a iniciar el programa.");
             } else if (elige == 2) {
                 //llamamos a un estático de la clase
                 DemoCarga.estatico++;
                 System.out.println(DemoCarga.estatico);
                 System.out.println("**Carga generada por el acceso a un miembro estático**\n" +
                         "Ahora creamos la primera instancia:");
                 //Creamos la primera instancia, con la clase ya cargada
                 DemoCarga dc1 = new DemoCarga();

                 System.out.println("Si deseas probar otra opción, vuelve a iniciar el programa");

             } else {
                 System.out.println("Opción no valida. Por favor, vuelve a iniciar el programa");
             }



        /*
        Vehicle coche1 = new Vehicle("Seat", "León", "Rojo", 2015, 4);

        coche1.iniciar();
        coche1.acelerar();
        Vehicle.parar();

         */
    }
}
