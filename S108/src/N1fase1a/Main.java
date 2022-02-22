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
        ArrayList<String> nombres = new ArrayList<String>();
        nombres.add("Adhara");
        nombres.add("Ana");
        nombres.add("David");
        nombres.add("Aby");
        nombres.add("Ada");
        nombres.add("Estrella");

        System.out.println("ArrayList: "+aAnd3(nombres));

        List<String> namesList = Arrays.asList("Pedro","Ada","Alfonso","Ana","Eva","Ali","Juan","Ari");

        System.out.println("Original name list: "+namesList);

        List<String> a3names = namesList.stream()
                .filter(n -> n.startsWith("A") && n.length() == 3)
                .collect(Collectors.toList());

        System.out.println("\nNames starting whit \"A\" and 3 letters: "+a3names);

    }

    private static List<String> aAnd3(List<String> names) {
        //.stream().filter  ---> lo usamos para filtrar solo los nombres que empiecen con A y tengan 3 letras
        List<String> aAnd3selected = names.stream()
                .filter(n -> n.startsWith("A") && n.length() == 3)
                .collect(Collectors.toList()); //recopila en una nueva lista los elementos extraidos
        return aAnd3selected;
    }
}
