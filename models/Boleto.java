package models;

public class Boleto extends MetodoPagamento{
    @Override
    public void pagar() {
        System.out.println("Pagamento com Boleto");
    }
}