package banco;

public class ContaEspecial extends ContaBancaria{
    protected float limite;

    public ContaEspecial(String cliente, int numConta, float saldo, float limite) {
        super(cliente, numConta, saldo);
        this.limite = limite;
    }

    public float getLimite() {
        return limite;
    }

    public void setLimite(float limite) {
        this.limite = limite;
    }

    @Override
    public void sacar(float valor){
        if (valor > getSaldo() + limite){
            System.out.println("Não foi possível concluir o saque");
        } else {
            saldo -= valor;
        }
    }
}
