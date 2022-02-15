package N1exercici4;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[]args) throws IOException {
//Exercici 4. Afegeixi la funcionalitat de llegir qualsevol fitxer txt i mostrar per consola el seu contingut.
        /*Creamos obj clase File ,se pasa por parametro el nombre del txt que queremos abrir, y el obj clase FileReader
        que busca el archivo donde se le indica
        */
        File fl = new File("Test_1.txt");
        FileReader fr = new FileReader(fl);
        /*Comentaris del mentor:
        Hauríem d'intentar que els exercicis es puguessin fer en qualsevol fitxer, no només amb el que hem posat dintre
         del codi. per exemple:
        String nameDir = args[0];
        File dir = new File(nameDir);
        */


        /*Creamos obj clase BufferedReader para leer la entrada de un archivo, se usa la funcion .readLine() que sirva

        para leer una sola linea de texto desde la consola
        */
        BufferedReader br = new BufferedReader(fr);
        String linea = br.readLine();
        System.out.println();
        //Si linea no está vacia imprime cada linea del contenido del archivo
        while(linea != null) {
            System.out.println(linea);
            //.readLine() para leer una sola linea de texto desde la consola
            linea = br.readLine();
        }
        //cerramos el buffer
        br.close();

    }
}
