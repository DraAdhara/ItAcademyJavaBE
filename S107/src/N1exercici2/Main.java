package N1exercici2;




public class Main {

    public static void main(String[] args) {
/*Exercici 2. Afegeix a les classes fills alguns mètodes deprecados, i utilitzi la anotacion corresponent.
Invoqui des d'una classe externa els mètodes deprecados, suprimint mitjançant l'anotació corresponent els warnings per
ser deprecada la seva utilització.
 */

        ClasePadre padre = new ClasePadre(40, "Clase", "Padre");
        ClaseHija hija = new ClaseHija(16, "Dolores", "Fuertes", 60);
        ClaseHija2 hija2 = new ClaseHija2(12, "Angustias", "Fuertes", "Rubia");

        //Llamamos a los metodos desde la clase padre
        System.out.println(padre);
        System.out.println(padre.programar());
        System.out.println(padre.descansar());
        System.out.println("-----");

        //llamamos a los metodos desde la ClaseHija con el metodo programar deprecated
        System.out.println(hija);
        System.out.println(hija.programar());
        System.out.println(hija.descansar());
        System.out.println("-----");
        //llamamos a los metodos desde la ClaseHija2 con el metodo descansar deprecated
        System.out.println(hija2);
        System.out.println(hija2.programar());
        System.out.println(hija2.descansar());
        System.out.println("-----");
    }
}
