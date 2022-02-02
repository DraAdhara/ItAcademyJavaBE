package N1exercici7;



import java.util.*;
import java.util.Map.Entry;

public class Main {
    /*Exercici 7. Emplena un HashMap amb parelles clau-valor. Ordeni les parelles segons el codi hash i imprimeixi el
    resultat (Idea: fer servir un TreeMap). Extregui les parelles ordenades i introdueixi-les en un mapa LinkedHashMap
    (Idea: fer servir el seu constructor). Demostri que es manté l'ordre d'inserció. Extregui només les claus ordenades
    i introdueixi-les primer en un HashSet i després en un LinkedHashSet. Es manté l'ordre?
*/
    public static void main(String[] args) {

        Map<String, Integer> listaHash = new HashMap();
        //llenamos el HashMap declarado anteriormnte con la clave "nombre", valor "edad"
        listaHash.put("Anna", 34);
        listaHash.put("Sonia", 20);
        listaHash.put("Marta", 31);
        listaHash.put("Laura", 68);
        //La listaHash queda ordenada así
        listaHash.entrySet().forEach(System.out::println);
        System.out.println("**************");

        //Declaramos TreeMap, ordenamos según codigo hash ordenado alfabeticamente
        Map<String, Integer> listaTree = new TreeMap<>(listaHash);
        listaTree.entrySet().forEach(System.out::println);
        System.out.println("**************");

        //Declaramos LinkedHashMap y las introducimos, al imprimir se mantiene el orden de inserción
        //    (Idea: fer servir el seu constructor). Demostri que es manté l'ordre d'inserció.
        LinkedHashMap<String, Integer> listaLinked = new LinkedHashMap<String, Integer>();
        for (Map.Entry<String, Integer> entry : listaTree.entrySet()) {
            listaLinked.put(entry.getKey(), entry.getValue());
        }
        System.out.println(listaLinked);
    }
    }




