package N1fase1e;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
    //Crea una llista amb  els nombs dels mesos de  l’any. Imprimeix tots els  elements de la llista amb  una lambda.
        //Generamos la lista con los meses
        List<String> meses = Arrays.asList("Enero","Febrero","Marzo","Abril",
                "Mayo","Junio","Julio","Agosto","Septiembre","Octubre","Noviembre","Diciembre");

        //Imprimimos los meses
        meses.forEach(m -> System.out.println(m+" "));
    }

}
