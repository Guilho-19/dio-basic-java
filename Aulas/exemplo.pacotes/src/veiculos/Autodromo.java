package veiculos;

public class Autodromo {
	public static void main(String[] args) {
		Carro jeep = new Carro();
		jeep.setChassi("4435345");
		//jeep.ligar();
		
		Moto z400 = new Moto();
		z400.setChassi("45345345");
		//z400.ligar();
		
		Veiculo coringa = jeep;
		coringa.ligar();
	}
}
