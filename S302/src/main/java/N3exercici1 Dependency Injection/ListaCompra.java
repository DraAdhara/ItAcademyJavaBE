package N3exercici1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ListaCompra {
//Generamos un List para almacenar articulos
    List<Articulos> ListaArticulos=new ArrayList<Articulos>();

 //Metodo para añadir articulos a la lista
    public void AddLlista(Articulos articulo) {
        ListaArticulos.add(articulo);
    }
//Metodo para mostrar la lista de articulos introducidos
    public void mostrarArticulos() {
        ListaArticulos.forEach(x->System.out.println(x.getNombre()+":"+x.getPrecio()+" "+x.getMoneda()));
    }

/*Metodo para hacer los cambios de valores corregidos recorriendo la lista de articulos, metiendolos en una lista actualizada
 y mostarlos por pantalla

 */
    public void cambioMoneda(IConversorMoneda c) {
        HashMap<String, Double> articulosAct = new HashMap<>();

        for(int i=0; i< ListaArticulos.size();i++) {

            double valor = Math.round(c.cambioMoneda(ListaArticulos.get(i))* 100d) / 100d;
            articulosAct.put(ListaArticulos.get(i).getNombre(), valor);
        }
        System.out.println(articulosAct);
    }


}

