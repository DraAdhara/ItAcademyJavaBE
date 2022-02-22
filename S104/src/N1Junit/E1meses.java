package N1Junit;

import java.util.Arrays;
import java.util.List;

public class E1meses {

    private List<String> listaMeses;

    public E1meses() {
        listaMeses = Arrays.asList("Enero","Febrero","Marzo","Abril","Mayo",
                "Junio","Julio","Agosto","Septiembre",
                "Octubre","Noviembre","Diciembre");
    }

    public int getSize() {
        return this.listaMeses.size();
    }

    public String getElement(int pos) {
        return listaMeses.get(pos);
    }

    public List<String> getLista() {
        return listaMeses;
    }

}
