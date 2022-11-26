package models;

public class Pagamento {
    private MetodoPagamento metodoPagamento;
    public Pagamento(MetodoPagamento metodoPagamento){
        this.metodoPagamento = metodoPagamento;
    }

    public void setMetodoPagamento(MetodoPagamento metodoPagamento) {
        this.metodoPagamento = metodoPagamento;
    }
    public void pagar(){
        metodoPagamento.pagar();
    }
}