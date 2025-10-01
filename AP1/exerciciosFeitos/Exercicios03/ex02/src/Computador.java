public class Computador {

    private int memoriaRam;
    private Processador processador;

    public Computador(int memoriaram, Processador processador){
        this.memoriaRam = memoriaram;
        this.processador = processador;
    }

    public int getMemoriaRam() {
        return memoriaRam;
    }

    public Processador getProcessador() {
        return processador;
    }

    public String detalhes(){
        return "O PC tem " + memoriaRam + " de memória RAM, e tem " + processador.getMarca() + " de processador e " + processador.getVelocidadeGhz() + " de velocidade.";
    }
}
