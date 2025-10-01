package checkout;

public class PagamentoPix extends PagamentoBase implements Checkout{
    @Override
    public void processar(double valor) {
        System.out.println("Pagamento sendo processado pelo PIX.");
    }

    @Override
    public void estornar(String idTransacao) {
        System.out.println("Estornando transação do PIX.");
    }
}