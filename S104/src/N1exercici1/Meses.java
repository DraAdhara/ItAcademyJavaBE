package N1exercici1;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class Meses {

    private List<String> listaM;

    public Meses() {
        listaM = Arrays.asList("Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre",
                "Octubre", "Noviembre", "Diciembre");
    }

    //Metodos getter
    public int getSize() {
        return this.listaM.size();
    }

    public String getElement(int posicion) {
        return listaM.get(posicion);
    }

    public List<String> getLista() {
        return listaM;
    }
}

