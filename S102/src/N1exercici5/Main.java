package N1exercici5;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
/*Exercici 5. Defineix un comportament "erroni" utilitzant un bucle 'while' que es repeteixi fins que es deixi de
 generar una excepció.
 */
        int letra;
        boolean bucle = true;
        Scanner input = new Scanner(System.in);

        while (bucle) {
            try {

                //Pido que introduzca una letra pero está esperando un int
                System.out.println("Introduce una letra");
                letra = Integer.parseInt(input.next());
                bucle = false;
            } catch (Exception e) {
                System.out.println(e.getMessage());
                System.out.println("Tipo de Exception: " + e.getClass());
            }

        } //El bucle se repite hasta que introduces un número entero

    }
}
