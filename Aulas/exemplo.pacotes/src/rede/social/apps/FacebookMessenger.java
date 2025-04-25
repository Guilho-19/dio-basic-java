package rede.social.apps;

public class FacebookMessenger extends ServicoMensagemInstantanea {

	@Override
	public void enviarMensagem() {
		// TODO Auto-generated method stub
		System.out.println("Enviando mensagem pelo Facebook");
	}

	@Override
	public void receberMensagem() {
		// TODO Auto-generated method stub
		System.out.println("Recebendo mensagem pelo Facebook");
		salvarHistoricoMensagem();
	}

	@Override
	public void salvarHistoricoMensagem() {
		// TODO Auto-generated method stub
		System.out.println("Facebook está salvando as mensagens");
	}
	
}
