package N1exercici5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Main {

    public static void main (String []args){
    /*Exercici 5. Crea i emplena un objecte List<Integer>. Crea i emplena un segon objecte List<Integer> de la mateixa
    grandària que el primer. Utilitza sengles objectes ListIterator per a llegir els elements de la primera llista i
    inserir-los en la segona en ordre invers (provi d'explorar diverses formes diferents de resoldre aquest problema).
     */
        //Creamos y llenamos el primer listado de Integers
        List<Integer> lista1 = new ArrayList<Integer>();

        lista1.add(1);
        lista1.add(2);
        lista1.add(3);
        lista1.add(4);
        lista1.add(5);

        //Creamos lista2 de Integers y usamos reverse para darle la vuelta al contenido de la lista1
        List<Integer> lista2 = new ArrayList<Integer>();
        Collections.reverse(lista1);

        //Solución con un for
        for (Integer integer : lista1) {
            lista2.add(integer);
        }
        System.out.println(lista2);

        //Solución con un while, hasNext y con un Iterator
        Iterator<Integer> iterador = lista1.iterator();
        while (iterador.hasNext()) {
            lista2.add(iterador.next());
        }

        System.out.println(lista2);



    }
    }

