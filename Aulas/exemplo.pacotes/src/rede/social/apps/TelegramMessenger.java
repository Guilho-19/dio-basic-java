package rede.social.apps;

public class TelegramMessenger extends ServicoMensagemInstantanea {

	@Override
	public void enviarMensagem() {
		// TODO Auto-generated method stub
		validarConexaoInternet();
		System.out.println("Enviando mensagem pelo Telegram");
	}

	@Override
	public void receberMensagem() {
		// TODO Auto-generated method stub
		System.out.println("Recebendo mensagem pelo Telegram");
		salvarHistoricoMensagem();
	}

	@Override
	public void salvarHistoricoMensagem() {
		// TODO Auto-generated method stub
		System.out.println("Telegram está salvando as mensagens");
	}
	
}
