package aulaIDE;

public class Operadores {
	public static void main (String[] args) {
		String nomeCompleto = "Linguagem " + "Java";
		System.out.println(nomeCompleto);
		
		int numero = 5;
		System.out.println(- numero);
		System.out.println(numero);
		
		numero = - numero;
		System.out.println(numero);
		numero = numero * -1; // operação para converter um número negativo para positivo
		System.out.println(numero);
	}
}