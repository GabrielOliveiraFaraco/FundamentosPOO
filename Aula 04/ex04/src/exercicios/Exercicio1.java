package exercicios;

public class Exercicio1 {
    public static void main(String[] args) {
        Carro carroDoLucas = new Carro();
        carroDoLucas.setCor("Preto");

        Carro carroDoGustavo = new Carro();
        carroDoGustavo.setCor("Vermelho");

        Vendedor nomeDoVendedor = new Vendedor();
        nomeDoVendedor.setNome("Gabriel");

        System.out.println(carroDoGustavo.getCor());
        System.out.println(carroDoLucas.getCor());
        System.out.println(nomeDoVendedor.getNome());
    }
}
