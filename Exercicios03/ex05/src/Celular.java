public class Celular {

    private String marca;
    private String modelo;
    private Bateria bateria;

    public Celular(String marca, String modelo, Bateria bateria){
        this.marca = marca;
        this.modelo = modelo;
        this.bateria = bateria;
    }

    public String getMarca() {
        return marca;
    }

    public Bateria getBateria() {
        return bateria;
    }

    public String getModelo() {
        return modelo;
    }

    public void usar(int consumo){
        bateria.consumir(consumo);
    }
    public void carregar(){
        bateria.cargaCompleta();
    }
}
