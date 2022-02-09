package N1exercici2;

import java.io.File;
import java.util.Arrays;
import java.util.Date;

public class Main {

    public static void main(String[]args){
 /*Exercici 2. Afegeixi a la classe del nivell anterior la funcionalitat de llistar un arbre de directoris amb el contingut
 de tots els seus nivells (recursivament) de manera que s'imprimeixin en pantalla en ordre alfabètic dins de cada nivell,
  indicant a més si és un directori (D) o un fitxer (F), i la seva última data de modificació.
  */
        //llamamos al metodo que recibe como parametro la instancia del obj File con la ruta
        buscarEnDirectorio(new File("/Users/adhara/Archivos de Programación/JAVA Back End mac"));

    }

    public static void buscarEnDirectorio(File directorio) {
        // Imprimimos el nombre del directorio, creamos array de clase File y ordenamos el array
        System.out.println("D: " + directorio);
        File[] listado = directorio.listFiles();
        Arrays.sort(listado);
        if (listado!=null) {
            //Si el listado está lleno, lo recorremos
            for(File file:listado) {
                //Si nos encontramos con otra carpeta, usamos recursividad para buscar dentro
                if (file.isDirectory())
                    buscarEnDirectorio(file);
                else {
                    //Imprimimos los archivos con su última fecha de modificación
                    System.out.println("F: "+file+" --- "+new Date(file.lastModified()));

                }
            }
        }else {
            System.out.println("F: "+directorio);
        }
    }
}
