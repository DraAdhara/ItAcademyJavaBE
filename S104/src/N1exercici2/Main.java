package N1exercici2;

import org.junit.Test;

import java.util.Locale;
import java.util.Scanner;

import static org.junit.Assert.assertEquals;

public class Main { static Scanner input = new Scanner (System.in);
    public static void main (String[]args){
/*Exercici 2. Crea una classe anomenada CalculoDni que calculi la lletra del DNI en rebre el número com a paràmetre.
Crea una classe jUnit que verifiqui el seu correcte funcionament, parametritzant-la perquè el test rebi un espectre de
dades ampli i validi si el càlcul és correcte per a 10 números de DNI predefinits.
 */
int num;
String let;
        System.out.println("Indique solo el número del DNI que desea comprobar:");
                num =input.nextInt();
        System.out.println("Indique ahora la letra que desea comprobar:");
                let =input.next();
                let = let.toUpperCase(Locale.ROOT);
compruebaLetra(num, let);

    }
public static void compruebaLetra(int num, String let) {
        CalculoDni cd = new CalculoDni(num);
        assertEquals("Error - la letra no coincide ", cd.getLetra(), let);
    }
    }
