package N1exercici6;

public class Main {

    public static void main (String[] args){
        /*Exercici 6. Crea una classe denominada Amphibian i inclou una sèrie de mètodes: moure(), respirar() i menjar().
         Defineix una nova classe denominada Frog que hereti de l'anterior. Al main() crea un objecte Frog i realitza
         una generalització a Amphibian, demostrant que tots els mètodes continuen funcionant.
         */
        Frog rana = new Frog();
        Amphibian sup = (Amphibian) rana;
        //Llamamos a los metodos desde la generalización amphibian
        sup.mover();
        sup.respirar();
        sup.comer();

        //llamamos a los metodos desde la subclase frog
        rana.saltar();//para que se vea en terminal a partir de cuando imprime la llamada a la clase Frog
        rana.mover();
        rana.respirar();
        rana.comer();
    }
}
