package banco;

public class ContaPoupanca extends ContaBancaria{
    private int diaDeRendimento;

    public ContaPoupanca(String cliente, int numConta, float saldo, int diaDeRendimento) {
        super(cliente, numConta, saldo);
        this.diaDeRendimento = diaDeRendimento;
    }

    public int getDiaDeRendimento() {
        return diaDeRendimento;
    }

    public void setDiaDeRendimento(int diaDeRendimento) {
        this.diaDeRendimento = diaDeRendimento;
    }

    public String calcularNovoSaldo(double taxa, int diaAtual){
        if (diaAtual >= diaDeRendimento){
            saldo += getSaldo() * taxa;
            return "Seu saldo é de " + saldo + " após o rendimento!";
        } else {
            return "Ainda não é dia de rendimento!";
        }
    }
}
