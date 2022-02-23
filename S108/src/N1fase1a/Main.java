package N1fase1a;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
   /* Tenint una llista de cadenes de noms propis,  escriu un mètode que retorni una llista de totes les cadenes que
    comencen amb la lletra 'a' (majuscula ) i  tenen exactament 3  lletres. Imprimeix el resultat.
    */

    public static void main(String[]args) {
        //Declaramos la lista con nombres que incluyan lo solicitado y otros que no.
        List<String> listaNumeros = Arrays.asList("Adhara","Ada","Adebayo","Ana","Skywalker","Ali","Freddy","Ari");
        //Imprimimos la lista
        System.out.println("Lista original: "+ listaNumeros);

        //Declaramos la lista que va a contener lo solicitado en el enunciado
        List<String> a3nombres = listaNumeros.stream()
                //Filtramos por nombres que empiecen por A y tengan un tamaño de tres letras
                .filter(n -> n.startsWith("A") && n.length() == 3)
                .collect(Collectors.toList());

        System.out.println("\nNombres que empiezan por\"A\" y tienen 3 letras: "+a3nombres);


    }


}
