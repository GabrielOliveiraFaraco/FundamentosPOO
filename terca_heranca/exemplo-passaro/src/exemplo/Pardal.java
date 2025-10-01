package exemplo;

public class Pardal implements Passaro{
    // implements é uma palavra reservada para implementar tudo da interface;


    @Override
    public void voar() {
        System.out.println("O pardal está voando.");
    }

    @Override
    public void pousar() {
        System.out.println("O pardal está pousando.");
    }
}
