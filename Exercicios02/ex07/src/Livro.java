public class Livro {
    public String titulo;
    public String autor;
    public boolean disponivel;

    public void emprestar(){
        if (disponivel){
            disponivel = false;
            System.out.println("O livro foi emprestado com sucesso!");
        } else {
            System.out.println("O livro que você está tendando pegar já foi emprestado!");
        }
    }

    public void devolver(){
        if (disponivel){
            System.out.println("O livro não foi emprestado.");
        } else {
            disponivel = true;
            System.out.println("O livro foi devolvido com sucesso!");
        }
    }
}
