package N1fase3;

public class Main {
/*Crea  una Functional Interface que conting a un mètode abstracte reverse (), que retorn e un valor String; en una
altra classe,  injecta a la interfície  creada mitjançant una lambda el cos del  mètode, de manera que torne la
mateixa cadena que rep  com a paràmetre  però a l'inrevés. Invoca la instància de la  interfície passant-li una
cadena i  comprovant el resultat.
 */
    public static void main(String[] args) {
        //Instanciamos
        ReverseFunctionalInterface reverseString = (str) -> {
            //Instanciamos la variable String vacía y después le daremos valor
            String resultado = "";
            //Recorremos la cadena desde la última hacia la primera letra
            for(int i=str.length() -1; i >= 0; i--)
                resultado += str.charAt(i);
            return resultado;
        };
        System.out.println(reverseString.reverse(".séver la yotse on aY"));
    }
}
