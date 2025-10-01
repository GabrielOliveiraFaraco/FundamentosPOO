package exercicioTeste;

public class Automovel {

    private String placa;
    private String cor;
    private String modelo;

    public Automovel(String placa, String cor, String modelo){
        this.placa = placa;
        this.cor = cor;
        this.modelo = modelo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getCor() {
        return cor;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void acelerar(){
        System.out.println("Você está acelerando o carro de placa" + getPlaca());
    }
    public void frear(){
        System.out.println("Você está freiando o carro de placa" + getPlaca());
    }
}
