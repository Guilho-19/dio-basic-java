package aulaIDE;

public class TipoVariaveis {
	public static void main(String[] args) throws Exception {
		double salarioMinimo = 2500;
		
		short numeroCurto = 1;
		int numeroNormal = numeroCurto;
		short numeroCurto2 = (short) numeroNormal;
		
		int numero = 1;
		
		numero = 10;
		
		System.out.println(numero);
		
		final double valorPI = 3.14; // utilizar final garante que a variável não será alterada
	}
}