public class Escola {

    private String nome;
    private String endereco;
    private Diretor diretor;

    public Escola(String nome, String endereco, Diretor diretor){
        this.nome = nome;
        this.endereco = endereco;
        this.diretor = diretor;
    }

    public String getNome() {
        return nome;
    }

    public Diretor getDiretor() {
        return diretor;
    }

    public String getEndereco() {
        return endereco;
    }

    public String apresentarEscola(){
        return "Nome da escola: " + nome + ". Nome do diretor: " + diretor.getNome();
    }

}
