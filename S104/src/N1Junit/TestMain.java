package N1Junit;
import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.*;
public class TestMain {

/*N1exercici1   E1meses
Exercici 1. Crea una classe Java que insereixi en una llista ordenada els noms dels mesos de l'any. Verifica amb jUnit
 que la llista té 12 posicions, que no és nul·la i que en la seva posició 8 conté el nom 'Agost'

    E1meses meses;
    La anotación @Before sirve para indicar al IDE que antes de cualquier test ejecute ese código
    La anotación @BeforeClass se ejecuta una única vez antes de la clase, debe ser static
@Before
        public void before() {

 meses = new E1meses();
}

     */

    E1meses meses = new E1meses();
    @Test
    public void testSize() {

        int mesesSize = meses.getSize();
        int expected = 12;
        assertEquals(expected, mesesSize);
        System.out.println("La lista contiene 12 elementos.");
    }

    @Test
    public void testNull() {

        assertNotNull(meses.getLista());
        System.out.println("La lista no es null.");
    }

    //Inserto mensaje de error personalizado asserEquals(expected, actual, "MESSAGE");
    @Test
    public void testPos() {

        String posicion = meses.getElement(7);
        String expected = "Agosto";
        assertEquals(expected,posicion,"Puedes personalizar el mensaje de error como en este ejemplo");
        //assertEquals("Puedes personalizar el mensaje de error como en este ejemplo",expected,posicion);
        System.out.println("La posición 7 contiene el nombre Agosto.");
    }
    
/*N1exercici2 E2E2letraDni
Exercici 2. Crea una classe anomenada CalculoDni que calculi la lletra del DNI en rebre el número com a paràmetre.
Crea una classe jUnit que verifiqui el seu correcte funcionament, parametritzant-la perquè el test rebi un espectre de
dades ampli i validi si el càlcul és correcte per a 10 números de DNI predefinits.


 ---TEST A LA SEVA CLASE

 */


/*N1exercici3 E3ArrayException
Exercici 3. Crea una classe amb un mètode que llanci una ArrayIndexOutOfBoundsException. Verifica el seu correcte funcionament amb un test jUnit
 */


    @Test
    void testThrow() {

        try {

            E3ArryException.getThrow();

        } catch (ArrayIndexOutOfBoundsException e) {

            System.out.println(e);

        }

    }





    //La anotiación @After sirve para indicar al código que se ejecute despúes del test
    //@Afterclass se ejectura una única vez después del test, debe ser static
    @After

    public void after(){
        System.out.println("After()");
    }
}
