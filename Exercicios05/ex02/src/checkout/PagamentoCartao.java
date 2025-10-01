package checkout;

public class PagamentoCartao extends PagamentoBase implements Checkout{
    @Override
    public void processar(double valor) {
        System.out.println("Pagamento sendo processado pelo cartão.");
    }

    @Override
    public void estornar(String idTransacao) {
        System.out.println("Estornando transação do catão.");
    }
}