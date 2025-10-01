package mensagem;

public class EmailAviso extends AvisoBase implements Aviso{
    @Override
    public void enviarMensagem(String mensagem, String destino) {
        super.enviarMensagem(mensagem, destino);
        System.out.println("Enviado via E-mail");

    }

    @Override
    public String status() {
        return super.status();
    }
}
