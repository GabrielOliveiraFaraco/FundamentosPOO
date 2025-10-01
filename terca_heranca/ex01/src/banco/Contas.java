package banco;

public class Contas {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria("Jorge", 12345, 1000);
        ContaPoupanca poupanca = new ContaPoupanca("Jorge", 12345, 1000, 27);
        ContaEspecial especial = new ContaEspecial("Jorge", 12345, 1000, 3000);

        conta.sacar(160);
        conta.depositar(2000);

        System.out.println(poupanca.calcularNovoSaldo(0.9, 29));

        System.out.println(conta.falarDados());
    }
}
