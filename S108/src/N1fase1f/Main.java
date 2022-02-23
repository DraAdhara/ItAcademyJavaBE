package N1fase1f;

import java.util.Arrays;
import java.util.List;

public class Main {
//Has de  fer la mateixa impressió del punt  anterior  però fent-ho mitjançant method   reference.
    public static void main(String[] args) {
        //Generamos la lista de meses
        List<String> meses = Arrays.asList("Enero","Febrero","Marzo","Abril",
                "Mayo","Junio","Julio","Agosto","Septiembre","Octubre","Noviembre","Diciembre");
        //Imprimimos mediante method reference
        meses.forEach(System.out::println);
    }

}
