package N1fase1b;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[]args){
  /*Escriu un mètode que retorni una cadena separada per comes basada en una llista d’Integers. Cada element  hauria
  d'anar precedit per la  lletra  "e" si el nombre és parell , i precedit de la lletra  "o" si el nombre és imparell.
  Per exemple, si la llista  d'entrada és (3,44), la  sortida hauria de ser "o3, e44".  Imprimeix el  resultat.
   */

        //Generamos lista con números aleatorios tanto pares como impares e imprimimos
        List<Integer> numeros = Arrays.asList(2,23,84,5,36);
        System.out.println("Lista original: "+numeros);
        //Generamos la lista que contendrá los numeros modificados
        List<String> modNumeros = numeros.stream()
                //Map devuelve un flujo que consiste en los resultados de aplicar la función dada a los elementos del flujo.
                .map(n -> n % 2 == 0 ? ("e"+n) : ("o"+n))
                .collect(Collectors.toList());
        String modAString = modNumeros.stream().map(mN -> mN.toString())
                .collect(Collectors.joining(", "));
        //permite recoger una lista de valores y convertirlos en una cadena asignando delimitadores

        System.out.println("Lista de numeros modificados: "+modAString);


    }

    }

