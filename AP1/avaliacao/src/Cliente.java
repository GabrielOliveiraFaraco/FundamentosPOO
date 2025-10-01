public class Cliente {

    private String nome;
    private int anoNascimento;
    private Endereco endereco;

    public Cliente(String nome, int anonascimento, Endereco endereco){
        this.nome = nome;
        this.anoNascimento = anonascimento;
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public int getAnoNascimento() {
        return anoNascimento;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public String clienteEndereco(){
        return "Nome: " + nome + " - Logradouro: " + endereco.getLogradouro() + " - Municipio: " + endereco.getMunicipio().getNome() + " - Estado: " + endereco.getMunicipio().getEstado().getNome();
    }
}