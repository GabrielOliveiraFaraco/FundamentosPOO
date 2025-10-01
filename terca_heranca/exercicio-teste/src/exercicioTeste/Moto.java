package exercicioTeste;

public class Moto extends Automovel{
    private boolean possuiBau;

    public Moto(String placa, String cor, String modelo, boolean possuiBau) {
        super(placa, cor, modelo);
        this.possuiBau = possuiBau;
    }
}
