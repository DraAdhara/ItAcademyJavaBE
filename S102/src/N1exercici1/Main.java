package N1exercici1;

public class Main {

    public static void main(String[] args) {
	/*Exercici 1. Crea una classe amb un main() que generi un objecte de la classe Exception dins d'un bloc try-catch.
	 Proporciona al constructor de l'excepció un missatge especific. Captura l'excepció dins d'una clàusula catch i
	 imprimeix el seu missatge. Afegeix una clàusula finally i imprimeix un missatge per a demostrar que va passar per allí.
	 */
        try {
            throw new Exception("Que excepción más bonita.");
        }catch(Exception e) {
            System.out.println("Se ha producido la excepción:"+e.getMessage());
            System.out.println("Tipo de Exception:"+e.getClass());
        }
        finally {
            System.out.println("Pase lo que pase, yo me voy a imprimir.");
        }
    }
}


