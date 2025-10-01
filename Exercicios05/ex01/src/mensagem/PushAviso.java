package mensagem;

public class PushAviso extends AvisoBase implements Aviso{
    @Override
    public void enviarMensagem(String mensagem, String destino) {
        super.enviarMensagem(mensagem, destino);
        System.out.println("Enviado via Push");

    }

    @Override
    public String status() {
        return super.status();
    }
}
