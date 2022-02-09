package N1exercici3;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Date;

public class Main {
    public static void main(String[]args)throws IOException {
 //Exercici 3. Executi l'exercici anterior guardant a un fitxer txt el resultat.
        //Creamos objeto de la clase Filewriter y PrintWriter
        FileWriter fw = new FileWriter("Test_1.txt");
        PrintWriter pw = new PrintWriter(fw);

        //Llamamos al metodo creando el objeto File con la ruta y pasandolo como parametro y PrintWriter como segundo parametro
        buscarEnDirectorio(new File("/Users/adhara/Archivos de Programación/MasterClass /MasterClass30PooHerencia"),pw);
    }

    public static void buscarEnDirectorio(File directorio,PrintWriter pw){
        //Imprimimos el nombre del directorio, creamos array de clase File y ordenamos el array
        System.out.println("D: " + directorio);
        File[] listado = directorio.listFiles();
        Arrays.sort(listado);
        //Si el listado está lleno, lo recorremos
        if (listado!=null) {
            for(File file:listado) {
                //Si nos encontramos con otra carpeta, usamos recursividad para buscar dentro
                if (file.isDirectory())
                    buscarEnDirectorio(file,pw);
                else {
                    //Imprimimos en el txt los nombres de los archivos de la ruta y la fecha de la ultima modificacion
                    pw.println("F: "+file+" --- "+new Date(file.lastModified()));
                    System.out.println("F: "+file+" --- "+new Date(file.lastModified()));
                }
            }
        }else {
            //Imprimimos en el txt los nombres de las carpetas de la ruta elegida
            pw.println("F "+directorio);
            System.out.println("F: "+directorio);
        }

    }
}
