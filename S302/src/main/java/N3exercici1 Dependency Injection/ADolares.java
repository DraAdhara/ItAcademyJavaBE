package N3exercici1;

public class ADolares implements IConversorMoneda{
    double valorDolar = 1.09; //Podriamos montar un sistema para que coja el valor de la moneda

//Metodo para corregir el precio del articulo
    @Override
    public double cambioMoneda(Articulos a) {
        double precio = a.getPrecio();
        return precio * valorDolar;
    }
}
