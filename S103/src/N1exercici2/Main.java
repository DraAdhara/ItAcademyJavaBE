package N1exercici2;


import java.util.HashSet;

public class Main {
    public static void main (String []args){
/*Exercici 2. Asseguri's que si convertim el Contenidor utilitzat en el punt anterior a un Contenidor HashSet, aquest
no permet duplicats. Verifica-ho.
 */
        //ArrayList<Month> month = new ArrayList <Month> ();
        HashSet<Month> month = new HashSet<Month>();

        //Añado duplicados los meses Enero, Febrero y Marzo
        month.add(new Month("Enero"));
        month.add(new Month("Enero"));
        month.add(new Month("Febrero"));
        month.add(new Month("Febrero"));
        month.add(new Month("Marzo"));
        month.add(new Month("Marzo"));
        month.add(new Month("Abril"));
        month.add(new Month("Mayo"));
        month.add(new Month("Junio"));
        month.add(new Month("Julio"));
        month.add(new Month("Agosto"));
        month.add(new Month("Septiembre"));
        month.add(new Month("Octubre"));
        month.add(new Month("Noviembre"));
        month.add(new Month("Diciembre"));

        //Imprimimos en pantalla para comprobar que no pueden haber objetos repetidos en Hashset
        //Los objetos se insertan en función de su código hash.
        for (Month meses:month) {
            System.out.println(meses.getName());
        }
    }
}
