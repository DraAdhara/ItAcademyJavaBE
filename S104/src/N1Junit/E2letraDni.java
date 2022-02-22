package N1Junit;

//import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.Test;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;
@RunWith(value = Parameterized.class)
public class E2letraDni {

    private String letra, expected;
    private int numDni;


    @Parameterized.Parameters
    public static Iterable<Object[]> getData(){
        return Arrays.asList(new Object[][]{
                {12345678, "Z"},{46067465, "Y"},{14269269, "T"},{30673097, "K"},{46061336, "H"},
                {46769864, "P"},{36579788, "J"},{38857764, "T"},{33927330, "F"},{46066732, "D"}
                });

        /*Otra manera de pasar los mismos datos
        List<Object[]> obj = new ArrayList<>();

        obj.add(new Object[]{12345678, "Z"});
        obj.add(new Object[]{46067465, "Y"});
        obj.add(new Object[]{14269269, "T"});
        etc...
        return obj;
*/
    }
    public E2letraDni(int numDni, String letra) {
        String juegoCaracteres="TRWAGMYFPDXBNJZSQVHLCKE";

        this.numDni = numDni;
        this.letra = letra;
        int calcExpected = numDni % 23;
        this.expected = juegoCaracteres.charAt(calcExpected)+"";
    }
    @Test
    public void testLetra() {

        assertEquals(letra,expected);

        System.out.println("La letra del DNI es correcta");
    }
    public String getLetra() {
        return letra;
    }

}
