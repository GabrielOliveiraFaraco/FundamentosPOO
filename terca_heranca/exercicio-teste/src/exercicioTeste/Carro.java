package exercicioTeste;

public class Carro extends Automovel{

    private int capacidadePortaMalas;
    private int quantidadePortas;

    public Carro(int capacidadePortaMalas, int quantidadePortas, String placa, String cor, String modelo){
        super(placa, cor, modelo); // this.placa / this.cor / this.modelo
        this.capacidadePortaMalas = capacidadePortaMalas;
        this.quantidadePortas = quantidadePortas;
    }

    public int getCapacidadePortaMalas() {
        return capacidadePortaMalas;
    }

    public void setCapacidadePortaMalas(int capacidadePortaMalas) {
        this.capacidadePortaMalas = capacidadePortaMalas;
    }

    public int getQuantidadePortas() {
        return quantidadePortas;
    }

    public void setQuantidadePortas(int quantidadePortas) {
        this.quantidadePortas = quantidadePortas;
    }


}
