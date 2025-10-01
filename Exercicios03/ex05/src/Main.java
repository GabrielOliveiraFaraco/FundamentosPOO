public class Main {
    public static void main(String[] args) {
        Celular celular = new Celular("Samsung", "A22", new Bateria(2000));

        System.out.println(celular.getBateria().getPorcentagemAtual());

        celular.usar(30);

        System.out.println(celular.getBateria().getPorcentagemAtual());

        celular.carregar();

        System.out.println(celular.getBateria().getPorcentagemAtual());

    }
}