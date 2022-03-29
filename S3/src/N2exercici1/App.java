package N2exercici1;

public class App {

    public static void main(String [] args){
/*Crea un petit gestor de direccions i números de telèfon internacionals.

L'aplicació permetrà afegir a l'agenda Adreces i Números de telèfon internacionals. Tenint en compte els diferents
formats de diversos països, construeixi l'agenda i les adreces i telèfons que afegeix implementant un patró Abstract Factory.

 */
        EspanaFactory espana1 = new EspanaFactory("Victor Valdés","765432189","Arístides Mallol, Barcelona");
        PortugalFactory portugal1 = new PortugalFactory("Vitor Baía","12345678","Estadio do Dragao, Porto");

        System.out.println(espana1.getNombre()+ " || " + espana1.getTelefono() +" || "+espana1.getDireccion());
        System.out.println(portugal1.getNombre()+ " || " + portugal1.getTelefono() +" || "+portugal1.getDireccion());

    }
}
