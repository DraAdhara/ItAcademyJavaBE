package N2exercici1;

public class PortugalFactory extends AbstractFactory{

    public PortugalFactory(String nombre, String telefono, String direccion) {
        super(nombre, telefono, direccion);
    }

    @Override
    public String getTelefono(){
        return "Teléfono: +351 " + telefono;
    }

    @Override
    public String getDireccion(){
        return "Dirección: " + direccion + ", Portugal.";
    }
}
