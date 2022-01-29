package N1exercici2;

public class Main {

    public static void main(String[] args) {
	/*Exercici 2. Defineix una referència a un objecte i inicialitza-la amb null. Tracta d'invocar un mètode a través
	d'aquesta referència. Ara envolta el codi amb una clàusula try-catch per a capturar l'excepció. Mostra el missatge
	i el tipus d'excepció.
	 */


            PruebaNull testNull = null;
            try {
                testNull.getString();
            } catch (Exception e){
                System.out.println("Se produjo una expción. " + e.getMessage());
                System.out.println("Tipo de Exception:"+e.getClass());
            }
        }
}



