package N1exercici7;


public class Main {

    public static void main(String[] args) {
    /*Exercici 7. A l'exercici anterior crea un nou mètode saltar() a la classe Frog i crida’l des del main(), desprès
    de fer la generalització a Amphibian. Demostra que la crida a aquest mètode saltar dona error.
     */
       Frog rana = new Frog();
        Amphibian sup = (Amphibian) rana;
        //Llamamos a los metodos desde la generalización amphibian
        sup.mover();
        sup.respirar();
        sup.comer();
        //sup.saltar();No podemos llamar a un metodo especifico de una subclase desde una superclase

        //llamamos a los metodos desde la subclase frog
        rana.saltar();
        rana.mover();
        rana.respirar();
        rana.comer();
    }
}
