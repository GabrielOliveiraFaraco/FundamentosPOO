package checkout;

public class ServicoPagamento {
    public void realizarPagamento(Checkout formaDePagamento, float valor){
        formaDePagamento.processar(valor);
    }
}