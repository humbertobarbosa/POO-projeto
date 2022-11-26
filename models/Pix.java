package models;

public class Pix extends MetodoPagamento{
    @Override
    public void pagar() {
        System.out.println("Pagamento com Pix");
    }
}