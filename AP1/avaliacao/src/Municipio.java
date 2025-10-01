public class Municipio {

    private String nome;
    private Estado estado;

    public Municipio(String nome, Estado estado){
        this.nome = nome;
        this.estado = estado;
    }

    public Estado getEstado() {
        return estado;
    }

    public String getNome() {
        return nome;
    }
}
