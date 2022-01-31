package N1exercici1;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	/*Exercici 1. Crea una classe anomenada Month amb un atribut "name" (que emmagatzemarà el nom del mes de l'any).
	Afegeix 11 objectes Month (cadascun amb el seu atribut diferent) en un Contenidor ArrayList Java, a excepció de
	l'objecte amb atribut "Agost". Després, efectuï la inserció en el lloc que correspon a aquest mes i demostri que
	el Contenidor manté l'ordre correcte.
*/
//Month mes = new Month("name");
		ArrayList<Month> month = new ArrayList <Month> ();

		month.add(new Month("Enero"));
		month.add(new Month("Febrero"));
		month.add(new Month("Marzo"));
		month.add(new Month("Abril"));
		month.add(new Month("Mayo"));
		month.add(new Month("Junio"));
		month.add(new Month("Julio"));

		month.add(new Month("Septiembre"));
		month.add(new Month("Octubre"));
		month.add(new Month("Noviembre"));
		month.add(new Month("Diciembre"));
		//Añadimos el mes con name Agosto indicando el indice donde debe colocarse
		month.add(7, new Month("Agosto"));

		for (Month meses:month) {
			System.out.println(meses.getName());
		}
	}


    }

