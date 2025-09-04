public class Carro {
    private String modelo;
    private int ano;
    private String marca;
    private Dono dono;

    public Carro(String modelo, int ano, String marca, Dono dono){
        this.modelo = modelo;
        this.ano = ano;
        this.marca = marca;
        this.dono = dono;
    }

    public String getModelo(){ return modelo; }
    public int getAno(){ return ano; }
    public String getMarca(){ return marca; }
    public Dono getDono(){ return dono; }

}
