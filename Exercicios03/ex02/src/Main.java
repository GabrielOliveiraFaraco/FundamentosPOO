public class Main {
    public static void main(String[] args) {
        Computador computador = new Computador(24, new Processador("Intel", 5));

        System.out.println(computador.detalhes());
    }
}