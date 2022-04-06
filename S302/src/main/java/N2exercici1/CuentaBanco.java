package N2exercici1;

public class CuentaBanco implements IFormaPago{

    @Override
    public void pago() {
        System.out.println("Pago realizaso a través de cuenta bancaria.");
    }
}
