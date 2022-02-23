package N1fase2;

public class Main {

    public static void main(String[] args) {
/*Crea una Functional Interface que continga  un mètode abstracte getPiValue (), que retorn a un valor double; en una
altra classe, instancie la  interfície i assigneu-li  mitjançant una lambda el valor 3.1415. Invoca  el  mètode
getPiValue de la  instància d'interfície i  imprimeix el resultat .
 */
        //Instanciamos la interfaz mediante lambda
        InterfacePi pi = () -> 3.14516;
        //Invocamos al metodo getPiValue e imprimimos el resultado
        System.out.println(pi.getPiValue());
        

    }
}
