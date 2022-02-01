package N1exercici3;

import java.util.*;

public class Main {

    public static void main(String[] args) {
/*Exercici 3. Crea una classe anomenada Generadora que retorni noms de personatges (com String) de la seva pel·lícula
favorita cada vegada que invoqui al mètode 'seguentPersonatge()', i que torni al principi de la llista de personatges
 una vegada que hagi acabat amb tots els noms. Utilitzi aquest generador per a emplenar un ArrayList, un LinkedList,
  un HashSet, un LinkedHashSet i un TreeSet, i després imprimeixi per pantalla cada contenidor.
 */
        Generadora starWars = new Generadora();
/* En el for, le pedimos a "i" que llegue hasta 18 para comprobar que vuelve al principio de la lista de personajes
    excepto cuando no permite objetos duplicados
        */

        //Llenamos ArrayList con nombres de personaje
        ArrayList<String> listaAL = new ArrayList<String>();
            for (int i = 0; i <= 18; i++) {
            listaAL.add(starWars.seguentPersonatge());
        }
            System.out.println("Lista de nombres en ArrayList: " + listaAL);

        //Llenamos LinkedList con nombres de personaje
        LinkedList<String> listaL = new LinkedList<String>();
            for (int i=0; i<18;i++) {
            listaL.add(starWars.seguentPersonatge());
        }
            System.out.println("Lista de nombres en LinkedList: " + listaL);

        //Llenamos HashSet con nombres de personaje
        HashSet<String> listaHS = new HashSet<String>();
            for (int i = 0; i <= 18; i++) {
            listaHS.add(starWars.seguentPersonatge());
        }
            System.out.println("Lista de nombres en HashSet: " + listaHS);

        //Llenamos el LinkedHashSet con nombres de personaje
        LinkedHashSet<String> listaLHS = new LinkedHashSet<String>(); //ordena por orden entrada, facil de acceder, no sirve para agregar
            for (int i=0; i<18;i++) {
            listaLHS.add(starWars.seguentPersonatge());
        }
        System.out.println("Lista de nombres en LinkedHashSet: " + listaLHS);

        //Llenamos el TreeSet con nombres de personaje
        TreeSet<String> listaTS = new TreeSet<String>();
            for (int i=0; i<=18;i++) {
            listaTS.add(starWars.seguentPersonatge());
        }
            System.out.println("Lista de nombres en TreeSer: " + listaTS);
    }
}
