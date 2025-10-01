package exemplo;

public class Urubu implements Passaro{
    @Override
    public void voar() {
        System.out.println("O pardal está voando.");
    }

    @Override
    public void pousar() {
        System.out.println("O pardal está pousando.");
    }
}
