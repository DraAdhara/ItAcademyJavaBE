package N2exercici1;

public class App {

    public static void main(String [] args){

        EspanaFactory espana1 = new EspanaFactory("Victor Valdés","765432189","Arístides Mallol, Barcelona");
        PortugalFactory portugal1 = new PortugalFactory("Vitor Baía","12345678","Estadio do Dragao, Porto");

        System.out.println(espana1.getNombre()+ " || " + espana1.getTelefono() +" || "+espana1.getDireccion());
        System.out.println(portugal1.getNombre()+ " || " + portugal1.getTelefono() +" || "+portugal1.getDireccion());

    }
}
