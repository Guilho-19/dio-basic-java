package sistemaSmartTV;

public class usuario {
	public static void main(String[] args) throws Exception {
		smartTV smartTV = new smartTV();
		
		System.out.println("A TV está ligada? " + smartTV.ligada);
		System.out.println("Em qual canal está a TV? " + smartTV.canal);
		System.out.println("Qual o volume da TV? " + smartTV.volume);
		
		smartTV.ligar();
		System.out.println("Novo Status -> A TV está ligada? " + smartTV.ligada);
		
		smartTV.desligar();
		System.out.println("Novo Status -> A TV está ligada? " + smartTV.ligada);
		
		smartTV.aumentarVolume();
		System.out.println("Novo Status -> O volume aumentou para: " + smartTV.volume);
		
		smartTV.diminuirVolume();
		System.out.println("Novo Status -> O volume diminuiu para: " + smartTV.volume);
		
		smartTV.aumentarCanal();
		smartTV.aumentarCanal();
		smartTV.aumentarCanal();
		smartTV.aumentarCanal();
		System.out.println("Novo Status -> O canal atual é: " + smartTV.canal);
		
		smartTV.diminuirCanal();
		smartTV.diminuirCanal();
		System.out.println("Novo Status -> O Canal atual é: " + smartTV.canal);
		
		smartTV.selecionarCanal(17);
		System.out.println("Novo Status -> O Canal atual é: " + smartTV.canal);
	}
}