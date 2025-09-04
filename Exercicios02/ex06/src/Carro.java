public class Carro {
    public String modelo;
    public int ano;
    public int velocidade;

    public void acelerar(){
        velocidade += 10;
    }

    public void frear(){
        if (velocidade >=10){
            velocidade -= 10;
        } else {
            System.out.println("\nVocê já tá parado, ta freiando porque? Ta sem freio de mão?");
        }
    }
}
