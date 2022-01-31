package N1exercici3;

public class Main {

    public static void main (String [] args){
        //Exercici 3. Escriu el codi per a generar i capturar una excepció de tipus ArrayIndexOutOfBoundsException.

        ExcepcionArray exArray = new ExcepcionArray();

        try {
            //Indicamos un indice mayor a los incluidos en el Array
            exArray.getValue(5);
            //Cogemos el error
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception: indice incorrecto: " + e.getMessage());
            System.out.println("Tipo de Exception:"+e.getClass());
        }
    }

    }



