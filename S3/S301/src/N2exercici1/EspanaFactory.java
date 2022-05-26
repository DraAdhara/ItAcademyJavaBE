package N2exercici1;

public class EspanaFactory  extends AbstractFactory{

    public EspanaFactory(String nombre, String telefono, String direccion) {
        super(nombre, telefono, direccion);
    }

    @Override
    public String getTelefono(){
        return "Teléfono: +34 " + telefono;
    }

    @Override
    public String getDireccion(){
        return "Dirección: " + direccion + ", España.";
    }
}

