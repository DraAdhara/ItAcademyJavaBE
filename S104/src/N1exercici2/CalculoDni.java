package N1exercici2;

public class CalculoDni {

    private String letra;

    public CalculoDni (int numDni) {
        String juegoCaracteres="TRWAGMYFPDXBNJZSQVHLCKE";
        int modulo = numDni % 23;
        this.letra = juegoCaracteres.charAt(modulo)+"";
    }

    public String getLetra() {
        return letra;
    }
}
