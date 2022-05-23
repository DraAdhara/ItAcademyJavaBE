package N3exercici1;

public class ALibras implements IConversorMoneda{
    double valorLibra = 1.20; //Podriamos montar un sistema para que coja el valor de la moneda

//Metodo para corregir el precio del articulo
    @Override
    public double cambioMoneda(Articulos a) {
        double precio = a.getPrecio();
        return precio * valorLibra;
    }
}
