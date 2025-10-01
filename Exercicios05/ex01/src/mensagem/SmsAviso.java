package mensagem;

public class SmsAviso extends AvisoBase implements Aviso{
    @Override
    public void enviarMensagem(String mensagem, String destino) {
        super.enviarMensagem(mensagem, destino);
        System.out.println("Enviado via Sms");

    }

    @Override
    public String status() {
        return super.status();
    }
}
