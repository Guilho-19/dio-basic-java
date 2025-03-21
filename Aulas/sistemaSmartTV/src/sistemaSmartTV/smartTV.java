package sistemaSmartTV;

public class smartTV {
	boolean ligada = false;
	int canal = 1;
	int volume = 25;

	// método para ligar a tv
	public void ligar() {
		ligada = true;
	}
	
	// método para desligar a tv
	public void desligar() {
		ligada = false;
	}
	
	// método para aumentar o volume da tv
	public void aumentarVolume() {
		volume ++;
	}
	
	// método para diminuir o volume da tv
	public void diminuirVolume() {
		volume --;
	}

	// método para passar pro proxímo canal
	public void aumentarCanal() {
		canal ++;
	}
	
	// método para voltar pro canal anterior
	public void diminuirCanal() {
		canal --;
	}
	
	// método para mudar o canal de forma precisa
	public void selecionarCanal(int novoCanal) {
		canal = novoCanal;
	}
}