package checkout;

public class Principal {
    public static void main(String[] args) {
        PagamentoCartao cartao = new PagamentoCartao();
        PagamentoPix pix = new PagamentoPix();
        ServicoPagamento pagamento = new ServicoPagamento();

        pagamento.realizarPagamento(pix, 100f);
    }
}