package N2exercici1;

public class PayPal implements IFormaPago{

    @Override
    public void pago() {
        System.out.println("Pago realizado con PayPal.");
    }
}
