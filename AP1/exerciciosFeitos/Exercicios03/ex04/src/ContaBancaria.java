public class ContaBancaria {

    private int numeroConta;
    private double saldo;
    private Cliente cliente;

    public ContaBancaria(int numeroconta, double saldo, Cliente cliente){
        this.numeroConta = numeroconta;
        this.saldo = saldo;
        this.cliente = cliente;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public double getSaldo() {
        return saldo;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public double depositar(double valor){
        return saldo += valor;
    }

    public double sacar(double valor){

        if(valor > saldo && valor <= 0){
            System.out.println("Este valor não pode ser sacado!");
            return 0;
        } else {
            return saldo -= valor;
        }
    }
}
