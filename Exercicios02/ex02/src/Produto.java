public class Produto {
    public String nome;
    public double preco;
    public int quantidade;

    public double calcularTotal(){
        return preco * quantidade;
    }
}
