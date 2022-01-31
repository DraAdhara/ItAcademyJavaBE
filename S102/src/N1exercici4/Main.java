package N1exercici4;

public class Main {
    public static void main (String []args){
     /*Exercici 4. Crea la teva pròpia classe d'excepcions, heretant de la classe Exception. Utilitza el constructor
     d'aquesta classe per emmagatzemar dins Exception, el missatge personalitzat que farà servir aquesta excepció.
     Crea una clàusula try-catch per a provar la nova excepció. Captura i mostra el missatge emmagatzemat.
     Mostra també la classe de l'excepció.
        */

        try {
            throw new MiException("Mi mensaje personalizado de excepción");
        } catch(MiException e) {
            System.out.println("Exception: " + e.getMessage());
            System.out.println("Exception type:"+e.getClass());
        }
    }
    }

