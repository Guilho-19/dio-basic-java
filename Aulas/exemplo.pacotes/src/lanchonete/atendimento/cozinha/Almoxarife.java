package lanchonete.atendimento.cozinha;

public class Almoxarife {
	private void controlarEntrada() {
		System.out.println("CONTROLANDO ENTRADA DOS ITENS");
	}
	
	private void controlarSaida() {
		System.out.println("CONTROLANDO SAÍDA DOS ITENS");
	}
	
	void entregarIngredientes() {
		System.out.println("ALMOXARIFE ENTREGANDO INGREDIENTES");
		controlarSaida();
	}
	
	void trocarGas() {
		System.out.println("ALMOXARIFE TROCANDO GÁS");
	}
}
