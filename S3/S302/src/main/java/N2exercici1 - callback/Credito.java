package N2exercici1;

public class Credito implements IFormaPago{

    @Override
    public void pago() {
        System.out.println("Pago realizado con tarjeta de crédito. ");
    }
}
