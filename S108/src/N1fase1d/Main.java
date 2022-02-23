package N1fase1d;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[]args) {
    /*Has de fer el mateix que en el punt anterior,  però retornant una llista que  incloga els elements amb  més de
    5 lletres. Imprimeix  el  resultat.
     */
        ArrayList<String> nombres = new ArrayList<String>();
        nombres.add("Morfeo");
        nombres.add("Neo");
        nombres.add("Trinity");
        nombres.add("Agente Smith");
        nombres.add("Oraculo");
        System.out.println("Lista original "+nombres);
        System.out.println("Lista con los nombres que contienen la letra \"O\" y 5 o mas letras: "+buscaNombresConOy5(nombres));
    }

    public static List<String> buscaNombresConOy5(ArrayList <String> names) {
        return  names.stream()
                .filter(n -> n.contains("o") && n.length() >= 5 || n.contains("O") && n.length() >= 5)
                .collect(Collectors.toList());
    }
}

