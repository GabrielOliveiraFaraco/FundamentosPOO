package checkout;

public interface Checkout {
    void processar(double valor);
    void estornar(String idTransacao);
}
