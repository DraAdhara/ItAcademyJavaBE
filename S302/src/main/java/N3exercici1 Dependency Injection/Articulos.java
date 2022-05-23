package N3exercici1;

public class Articulos {

    protected double precio;
    protected String moneda;
    protected String nombre;

//Constructor
    public Articulos (double precio, String nombre){
        this.precio  = precio;
        this.moneda  = "€";
        this.nombre  = nombre;
    }

//Getters
    public double getPrecio() {
        return precio;
    }

    public String getMoneda() {
        return moneda;
    }

    public String getNombre() {
        return nombre;
    }

    /*Setters
    public void setPrecio(double precio) {
        this.precio = precio;
    }


    public void setMoneda(String moneda) {
        this.moneda = moneda;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
*/
}



