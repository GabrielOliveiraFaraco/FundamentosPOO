public class Processador {
    private String marca;
    private float velocidadeGhz;

    public Processador(String marca, float velocidadeghz){
        this.marca = marca;
        this.velocidadeGhz = velocidadeghz;
    }

    public float getVelocidadeGhz() {
        return velocidadeGhz;
    }

    public String getMarca() {
        return marca;
    }
}
