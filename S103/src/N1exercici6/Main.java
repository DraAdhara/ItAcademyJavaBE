package N1exercici6;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main (String[]args){
    /*Exercici 6. Crea un objecte buit LinkedList<Integer>. Utilitzant un iterador ListIterator, afegeixi valors sencers
     a la llista inserint-los sempre a la meitat d'aquesta.
     */
        LinkedList<Integer> listL = new LinkedList<Integer>();
        Iterator<Integer> listIterator = listL.iterator();
        Scanner input = new Scanner(System.in);

        do {
            listL.add(listL.size()/2, ingresaNumero());
            System.out.println(listL);

        } while (listL.listIterator() != null );

    }

    public static int ingresaNumero() {
        Scanner input = new Scanner(System.in);
        int numIngresado;
        do {
            System.out.println("Ingresa un numero entero para añadirlo a la lista, detén el programa para salir: ") ;
            numIngresado = input.nextInt();
            return numIngresado;
        }
        while (numIngresado != 0);

    }
}
