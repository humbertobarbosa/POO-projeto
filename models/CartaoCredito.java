package models;

public class CartaoCredito extends MetodoPagamento{
    @Override
    public void pagar() {
        System.out.println("Pagamento com Cartão de Crédito");
    }
}