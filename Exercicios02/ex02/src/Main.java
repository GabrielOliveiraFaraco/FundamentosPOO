public class Main {
    public static void main(String[] args) {
        Produto newProduto = new Produto();

        newProduto.nome = "Teclado";
        newProduto.quantidade = 36;
        newProduto.preco = 86;

        System.out.println("O preço do estoque do produto " + newProduto.nome + " é de " + newProduto.calcularTotal() + ".");

    }
}