package N1exercici1;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import org.junit.jupiter.api.Test;

public class Main {

    static Meses meses = new Meses();

        public static void main(String[] args) {
        /*Exercici 1. Crea una classe Java que insereixi en una llista ordenada els noms dels mesos de l'any. Verifica amb
        jUnit que la llista té 12 posicions, que no és nul·la i que en la seva posició 8 conté el nom 'Agost'.
        */

        testPosiciones();
        testNull();
        //Por defecto 7, pero lo monto así para probar otros meses y ver como funciona
        testMes(7);

        }

        static public void testPosiciones() {
            assertEquals("Error - No tienen el mismo tamaño", meses.getSize(), 12);
        }
        static public void testNull () {
            assertNotNull("Error - hay Null", meses.getLista());
        }

        static public void testMes(int mes) {
        assertEquals("Error ´el mes no coincide",meses.getElement(mes), "Agosto");

        }

}




