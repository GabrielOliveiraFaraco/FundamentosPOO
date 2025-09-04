public class Main {
    public static void main(String[] args) {
        Retangulo newRetangulo = new Retangulo();

        newRetangulo.largura = 5;
        newRetangulo.altura = 7;

        System.out.printf("A área desse retangulo é de %.2f m^2. E seu perímetro é de %.2f m.", newRetangulo.calcularArea(), newRetangulo.calucularPerimetro());
    }
}