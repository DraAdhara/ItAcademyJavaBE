package N1fase1c;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[]args){
/*Tenint una llista de Strings, escriu un mètode  que retorne una llista de totes les  cadenes  que continguen la
lletra ‘o’ i  imprimeix el resultat .
  */
        //Generamos la lista de nombres
        ArrayList<String> nombres = new ArrayList<>();
        nombres.add("Morfeo");
        nombres.add("Neo");
        nombres.add("Trinity");
        nombres.add("Agente Smith");
        nombres.add("Oraculo");
        System.out.println("Lista original "+nombres);
        System.out.println("Lista con los nombres que contienen la letra \"O\": "+buscaNombresConO(nombres));
    }
    //Creamos el metodo para buscar nombres que contengan "O" en el listado nombres
    public static List<String> buscaNombresConO(ArrayList <String> nombres) {
        return  nombres.stream()
                //filtramos las cadenas con O y o y las añadimos a la lista
                .filter(n -> n.contains("o") || n.contains("O"))
                .collect(Collectors.toList());
    }
        
    }

