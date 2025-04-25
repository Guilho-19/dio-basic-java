package rede.social;

import rede.social.apps.FacebookMessenger;
import rede.social.apps.MSNMessenger;
import rede.social.apps.ServicoMensagemInstantanea;
import rede.social.apps.TelegramMessenger;

public class ComputadorPedrinho {
	public static void main(String[] args) {
		/*
		MSNMessenger msn = new MSNMessenger();
		System.out.println("-----MSN-----");
		msn.enviarMensagem();
		msn.receberMensagem();
		
		FacebookMessenger face = new FacebookMessenger();
		System.out.println("-----Facebook-----");
		face.enviarMensagem();
		face.receberMensagem();
		
		TelegramMessenger telegram = new TelegramMessenger();
		System.out.println("-----Telegram-----");
		telegram.enviarMensagem();
		telegram.receberMensagem();
		*/
		
		ServicoMensagemInstantanea smi = null;
		String appEscolhido = "telegram";
		
		if (appEscolhido.equals("msn")) {
			smi = new MSNMessenger();
		} else if (appEscolhido.equals("face")) {
			smi = new FacebookMessenger();
		} else if (appEscolhido.equals("telegram")) {
			smi = new TelegramMessenger();
		}
		
		smi.enviarMensagem();
		smi.receberMensagem();
	}
}
