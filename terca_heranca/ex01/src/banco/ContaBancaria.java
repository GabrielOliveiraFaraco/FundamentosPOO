package banco;

public class ContaBancaria {

    protected String cliente;
    protected int numConta;
    protected float saldo;

    public ContaBancaria(){}

    public ContaBancaria(String cliente, int numConta, float saldo) {
        this.cliente = cliente;
        this.numConta = numConta;
        this.saldo = saldo;
    }

    public String getCliente() {
        return cliente;
    }

    public int getNumConta() {
        return numConta;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public void sacar(float valor){
        if (valor > saldo){
            System.out.println("Valor inválido!");
        } else {
            saldo -= valor;
            System.out.println("O valor de " + valor + " foi sacado da sua conta!");
        }
    }

    public void depositar(float valor){
        if (valor > 0){
            saldo += valor;
            System.out.println("Valor de " + valor + " foi depositado com sucesso!");
        } else {
            System.out.println("Não foi possível depositar o valor!");
        }
    }

    public String falarDados(){
        return "Cliente: " + getCliente() + ". Número da Conta: " + getNumConta() + ". Saldo: " + getSaldo() + ".";
    }

}
