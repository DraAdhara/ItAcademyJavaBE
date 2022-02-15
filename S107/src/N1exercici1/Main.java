package N1exercici1;

public class Main {

    public static void main(String[]args){
 /*Exercici 1. Crea una jerarquia d'objectes Java on els objectes fill sobreescriguin alguna funcionalitat de l'objecte
 pare emprant @Override. Afegeix una classe que efectuï les invocacions necessàries demostrant el punt anterior.
  */
        //Instanciamos objetos de la ClasePadre y de la ClaseHija con sus respectivos atributos pasando los parametros adecuados
    ClasePadre padre = new ClasePadre(40, "Clase", "Padre");
    ClaseHija hija = new ClaseHija(16, "Dolores", "Fuertes", 60);

        //Llamamos al metodo de la clase padre
        System.out.println(padre.programar());
        //Llamamos la metodo @override de la clase hija
        System.out.println(hija.programar());
    }
}
