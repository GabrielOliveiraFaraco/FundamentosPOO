public class Main {
    public static void main(String[] args) {
        ContaBancaria contabancaria = new ContaBancaria(12345, 1000, new Cliente("Jorge", "123.456.789-12"));

        contabancaria.depositar(2000);
        contabancaria.sacar(1500);

    }
}