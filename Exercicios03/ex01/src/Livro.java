public class Livro {
    private String titulo;
    private int anoPublicado;
    private Autor autor;

    public Livro(String titulo, int anopublicado, Autor autor){
        this.titulo = titulo;
        this.anoPublicado = anopublicado;
        this.autor = autor;
    }

    public Autor getAutor() {
        return autor;
    }

    public int getAnoPublicado() {
        return anoPublicado;
    }

    public String getTitulo() {
        return titulo;
    }

    public String descricao() {
        return titulo + " - " + autor.getNome() + " (" + autor.getNacionalidade() + ")";
    }

}
