package N1exercici8;


public class Main {
    public static void main (String [] args){
    /*Exercici 8. Modifica l'exercici anterior perquè l'objecte Frog substitueixi les definicions de mètodes de la classe
    base (proporcioni noves definicions utilitzant les mateixes signatures de mètodes). Demostri que ocorre al mètode main(),
    si manté la generalització anterior o no.
     */
        Frog rana = new Frog();
        N1exercici8.Amphibian salamandra = new N1exercici8.Amphibian();
        Amphibian sup = (Amphibian) rana;
        System.out.println("Llamamos a los metodos desde un objeto Frog");
        rana.mover();
        rana.respirar();
        rana.comer();

        System.out.println("Llamamos a los metodos desde la generalización Amphibian");
        sup.mover();
        sup.respirar();
        sup.comer();

        System.out.println("Llamamos a los metodos desde un objeto Amphibian");
        salamandra.mover();
        salamandra.respirar();
        salamandra.comer();


    }
}
