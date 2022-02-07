package N1exercici6;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    static int numIngresado;
    public static void main (String[]args){
    /*Exercici 6. Crea un objecte buit LinkedList<Integer>. Utilitzant un iterador ListIterator, afegeixi valors sencers
     a la llista inserint-los sempre a la meitat d'aquesta.
     */
        LinkedList<Integer> listL = new LinkedList<Integer>();
        Iterator<Integer> listIterator = listL.iterator();
        Scanner input = new Scanner(System.in);
        int control;

        do {
            listL.add(listL.size()/2, ingresaNumero());
            System.out.println(listL);


        } while (numIngresado != 0);
     ///---> versión anterior con bucle infinito:while (listL.listIterator() != null );

    }

    public static int ingresaNumero() {
        Scanner input = new Scanner(System.in);
        ///---> versión anterior con bucle infinito:int numIngresado;
        ///---> versión anterior con bucle infinito:do {
            System.out.println("Ingresa un numero entero para añadirlo a la lista, marca 0 par salir: ") ;
            numIngresado = input.nextInt();
            return numIngresado;
        }
        //---> versión anterior con bucle infinito: while (numIngresado != 0);

    }

