public class ContaBancaria {

    public int numero;
    public String titular;
    public double saldo;

    public void depositar(double valor){
        saldo += valor;
    }

    public void sacar(double valor){
        while (true) {
            if (valor > saldo || valor < 0 || saldo == 0) {
                System.out.println("O valor que está tentando sacar é inválido ou você está sem saldo. Confira sua conta!");
            } else {
                saldo -= valor;
                System.out.println("O valor " + valor + " foi sacado!");
                break;
            }
        }
    }

    public void exibirSaldo(){
        System.out.println("Seu saldo é de " + saldo + ".");
    }
}