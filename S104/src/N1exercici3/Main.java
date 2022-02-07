package N1exercici3;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class Main {

    public static void main(String[] args) {
 /*Exercici 3. Crea una classe amb un mètode que llanci una ArrayIndexOutOfBoundsException. Verifica el seu correcte
 funcionament amb un test jUnit.
  */
    }
    void testExpectedException() {
        int []numeros= {0,1,2,3,4,5};


        //assertThrows espera que se lance esa excepcion dentro de ese trozo de codigo
        assertThrows(ArrayIndexOutOfBoundsException.class, () -> {
            int numero=numeros[10];
        });

    }

}
