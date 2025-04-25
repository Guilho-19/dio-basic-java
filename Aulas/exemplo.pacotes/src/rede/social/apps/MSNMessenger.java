package rede.social.apps;

public class MSNMessenger extends ServicoMensagemInstantanea {

	@Override
	public void enviarMensagem() {
		// TODO Auto-generated method stub
		System.out.println("Enviando mensagem pelo MSN Messenger");
	}

	@Override
	public void receberMensagem() {
		// TODO Auto-generated method stub
		System.out.println("Recebendo mensagem pelo MSN Messenger");
		salvarHistoricoMensagem();
	}

	@Override
	public void salvarHistoricoMensagem() {
		// TODO Auto-generated method stub
		System.out.println("MSN Messenger está salvando as mensagens");
	}
	
}
