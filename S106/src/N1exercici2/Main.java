package N1exercici2;

public class Main {
    public static void main(String[]args){
 /*Exercici 2. Crea una classe anomenada GenericMethods amb un mètode genèric anomenat f() que accepti tres arguments
 de tipus genèric. Realitza al main() diferents crides d'aquest mètode amb diferents tipus de parametres.
 Comprova que es poden posar qualsevol tipus de variable.
  */
        GenericMethod gm = new GenericMethod();

        gm.f("Estrella", "hola", 5);

        gm.f(10, "que tal", true);

        gm.f(false,"adios", 3);

    }
}


