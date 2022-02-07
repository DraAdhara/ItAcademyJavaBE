package N1exercici8;

import java.util.*;

public class Main {
    public static void main(String[]args){
        /*Exercici 8. Emplena un mapa LinkedHashMap amb claus de tipus String i objectes del tipus que prefereixi.
        Extregui les parelles, ordeni-les segons les claus (en ordre alfabètic) i torni a inserir-les en el mapa.
        Idea: Fes servir un ArrayList per realitzar l'ordenació amb la classe Comparator.
         */

        //Creamos linkedHashMap y lo llenamos de elementos
        LinkedHashMap<String,Empleado> listaLHM = new LinkedHashMap <String,Empleado>();

        listaLHM.put("uno", new Empleado("Estrella","Supervisora"));
        listaLHM.put("dos", new Empleado("Mony","Encargado"));
        listaLHM.put("tres", new Empleado("Dani","Empleado"));
        //Imprimimos la lista original
        System.out.println(listaLHM);


        //con entrySet vemos todos los elementos y los volcamos a un ArrayList para ordenarlos usando sort.
        Set<Map.Entry<String,Empleado>> listaSet = listaLHM.entrySet();
        ArrayList<Map.Entry<String,Empleado>> listaAL = new  ArrayList<Map.Entry<String,Empleado>>(listaSet);



        //utilizo el compareTo para ordenar meto el comparator como parametro del sort
        Collections.sort(listaAL, new Comparator<Map.Entry<String,Empleado>>(){
@Override
            public int compare(Map.Entry<String,Empleado> entry1, Map.Entry<String,Empleado> entry2) {
                return entry1.getKey().compareTo(entry2.getKey());
            }
        });
        //La lista una vez ordenada en ArrayList
        System.out.println(listaAL);

        //Introduzco  en el linkedHashMap pero tengo que extraer del arrayList los pares clave valor en este caso no puedo rellenarlo
        //con un linkedHashMapMapa.putAll(listAL) ya que hay que extraer la clave y el valor de los entry
        LinkedHashMap<String,Empleado> linkedHM = new LinkedHashMap<String,Empleado>();
        //recorremos la listaAL para extraer clave y valor
        for (Map.Entry<String,Empleado> entry : listaAL) {
            // con el .put insertamos la clave y el valor en el linkedHashMap
            linkedHM.put(entry.getKey(), entry.getValue());
        }

        System.out.println(linkedHM);
    }
}
