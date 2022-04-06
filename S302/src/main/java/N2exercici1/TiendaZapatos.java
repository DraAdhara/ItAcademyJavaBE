package N2exercici1;

public class TiendaZapatos {

    //Aquí usaremos callback, función que recibe como parametro otra función
    public void pago(IFormaPago formapago) {
        formapago.pago();
    }
}