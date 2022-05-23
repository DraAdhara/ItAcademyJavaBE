package N3exercici1;

public class Main {

    public static void main (String [] args){
 /*Dissenya una classe que mostri en pantalla el preu de diversos articles. Ja que haurà de mostrar-los també en
 diversos tipus de moneda, assegura't d'afegir-li com a Injecció de Dependència una classe Convertidor de Moneda que
 efectuï la correcció del preu en funció del canvi de divisa.

  */
// Generamos objeto ListaCompra y  inicilizamos objetos Articulos
        ListaCompra carrito = new ListaCompra ();
        Articulos a= new Articulos (999.99,"iPhone" );
        Articulos b= new Articulos (30,"Cargador" );
        Articulos c= new Articulos (55.00,"Funda" );

//Metemos los articuos en la lista generada
        carrito.AddLlista(a);
        carrito.AddLlista(b);
        carrito.AddLlista(c);

//Mostamos los articulos introducidos con su valor original y después con su valor corregido a dolares y a libras
        carrito.mostrarArticulos();
        carrito.cambioMoneda(new ADolares());
        carrito.cambioMoneda(new ALibras());

    }

}

