package aulaIDE;

public class MyClass {
	public static void main (String[] args) {
		int ano = 2021;
		ano = 2022;
		
		String BR = "Brasil";
		BR = "Brazil";
		
		String primeiroNome = "Gleyson";
		String segundoNome = "Sampaio";
		
		String nomeCompleto = nomeCompleto (primeiroNome, segundoNome);
		System.out.println(nomeCompleto);
	}
	
	public static String nomeCompleto (String primeiroNome, String segundoNome) {
		return primeiroNome.concat(" ").concat(segundoNome);
	}
}
