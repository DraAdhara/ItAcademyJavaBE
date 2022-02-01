package N1exercici4;

import java.util.*;

public class Main {

    public static <T> void iterador (Collection<T> c) {
        Iterator<T> iterador = c.iterator();
        while (iterador.hasNext()) {
            System.out.println(iterador.next().toString());
        }
    }

    public static void main (String[]args){
        /*Exercici 4. Escriu un ḿetode que utilitzi un iterador per a recórrer una col·lecció genèrica passada per argument
        i imprimeixi tots els seus objectes (fent servir el mètode toString()). Empleni tots els diferents tipus de
        Java Collections (ArrayList, LinkedList, HashSet, LinkedHashSet i TreeSet), amb una sèrie d'objectes i apliqui
        el mètode dissenyat a cada Contenidor.
         */
        Objeto obj = new Objeto("nuevo");

        //Añadimos objetos a ArrayList
        ArrayList<Objeto> listaAL = new ArrayList<Objeto>();
        listaAL.add(new Objeto("ArrayList1"));
        listaAL.add(new Objeto("ArrayList2"));

        //Añadimos objetos a LinkedList
        LinkedList<Objeto> listaLL = new LinkedList<Objeto>();
        listaLL.add(new Objeto("LinkedList1"));
        listaLL.add(new Objeto("LinkedList2"));

        //Añadimos objetos a HashSet
        HashSet<Objeto> listaHS = new HashSet<Objeto>();
        listaHS.add(new Objeto("HashSet1"));
        listaHS.add(new Objeto("HashSet2"));

        //Añadimos objetos a LinkedHashSet
        LinkedHashSet<Objeto> listaLHS = new LinkedHashSet<Objeto>();
        listaLHS.add(new Objeto("LinkedHashSet1"));
        listaLHS.add(new Objeto("LinkedHashSet2"));

        //Añadimos objetos a TreeSet
        TreeSet<Objeto> listaTS = new TreeSet<Objeto>();
        listaTS.add(new Objeto("TreeSet1"));
        listaTS.add(new Objeto("TreeSet2"));


        //Recorremos las colecciones
        iterador(listaAL);
        iterador(listaLL);
        iterador(listaHS);
        iterador(listaLHS);
        iterador(listaTS);


    }



}

