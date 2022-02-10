package N1exercici4;

public class Main {

    public static void main (String[] args) {
    //Exercici 4. Modifica l'anterior apartat de manera que els arguments que rep f() sigui una llista d'arguments
        // de variable indefinida.
        GenericMethod gm = new GenericMethod();

        gm.f("Estrella", "Estrella", "Estrella", true);
        gm.f("Estrella",20);
        gm.f(20,3,"Estrella");

    }

}

