public class Main {
    public static void main(String[] args) {
        Autor autor = new Autor("Jorge", "Brasileiro");
        Livro livro = new Livro("Lugares Wa", 1914, autor);

        System.out.println(livro.descricao());
    }
}