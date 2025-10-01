package mensagem;

public class AvisoBase implements Aviso{
    public int id;
    public int data;
    public int ultimaFalha;

    @Override
    public void enviarMensagem(String mensagem, String destino) {
        System.out.println("Mensagem: " + mensagem);
        System.out.println("Contato: " + destino);
    }

    @Override
    public String status() {
        return "OK";
    }
}
