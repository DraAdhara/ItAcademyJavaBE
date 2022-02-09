package N1exercici5;

import java.io.*;

public class Main {
    public static void main(String[]args)throws IOException {
        /*Exercici 5. Mostri com serialitzar un Objecte Java a un fitxer .ser i deserialícelo després.

        Serialiar es= a convertir en Bytes para meterlo en un DD o tambien poder distribuirlo por la red a ordenadores
        remotos y que en esos ordenadores ese objeto pueda ser reestablecido al estado en el que estaba cuando se serealizò
        */
        String [] nombres = {"Estrella","David","Manu"};
        int [] edad = null;

        try {
            //el archivo que recoje datos
            String archivo = "pruebaSerializable.txt";
            //creamos fichero
            FileOutputStream file = new FileOutputStream(archivo);
            // Un objeto ObjectOutputStream se crea a partir de un objeto FileOutputStream asociado al fichero.
            ObjectOutputStream f = new ObjectOutputStream(file);
            f.writeObject(nombres);
            f.close();

        }
        catch (Exception e) {
            e.getMessage();
        }


        try {
            //Recoger el archivo en la raiz
            String archivo = "pruebaSerializable.txt";
            FileInputStream arch = new FileInputStream(archivo) ;
            ObjectInputStream a = new ObjectInputStream(arch) ;
            //Recogemos datos y se los añadimos a la var edad
            edad = (int[]) a.readObject();
            System.out.println(edad);
            a.close();
            arch.close();

        }
        catch (Exception e) {
            e.getMessage();
        }
    }
}
