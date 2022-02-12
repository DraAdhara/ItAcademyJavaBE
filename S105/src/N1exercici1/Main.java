package N1exercici1;

import java.io.File;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
      /*  Exercici 1. Creu una classe Java que llisti el contingut d'un directori rebut per parametre ordenat alfabeticament.
    */
        //Instanciamos el obj de la clase File y como parametro se pone la ruta del directorio.
        String ruta = "/Users/adhara/Archivos de Programación";
        File file = new File(ruta);

        //Creamos una lista de array de Strings de la clase File y la ordenamos alfabeticamente
        String[] listado = file.list();
        Arrays.sort(listado);

        //Recorremos la lista para extraer e imprimir cada elemento de ella
        for(String elemento : listado) {
            System.out.println(elemento);
        }
    }

}
