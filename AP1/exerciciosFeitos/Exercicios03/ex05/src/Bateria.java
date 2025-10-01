public class Bateria {

    private int capacidadeMah;
    private int porcentagemAtual;

    public Bateria(int capacidademah){
        this.capacidadeMah = capacidademah;
        this.porcentagemAtual = 100;
    }

    public int getCapacidadeMah() {
        return capacidadeMah;
    }

    public int getPorcentagemAtual() {
        return porcentagemAtual;
    }

    public void consumir(int consumo){
        this.porcentagemAtual = Math.max(0, this.porcentagemAtual - consumo);
    }
     public void cargaCompleta(){
        this.porcentagemAtual = 100;
     }
}
