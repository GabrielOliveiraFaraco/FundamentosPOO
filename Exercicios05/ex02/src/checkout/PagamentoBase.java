package checkout;

public class PagamentoBase implements Checkout{

    public String id;
    public String moeda;
    public String descricao;

    @Override
    public void processar(double valor) {

    }

    @Override
    public void estornar(String idTransacao) {

    }
}