package controleDeFLuxo;

import java.util.Locale;
import java.util.Scanner;

public class SistemaDeMedida {
	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
		
		System.out.println("Insira a Sigla de sua escolha (P, M ou G)");
		String sigla = scanner.next().toUpperCase(); // Scanner + upperCase
		scanner.close();
		
		switch (sigla) {
			case "P" -> System.out.println("Pequeno");
			case "M" -> System.out.println("Médio");
			case "G" -> System.out.println("Grande");
			default -> System.out.println("Sigla inválida");
		}
	}
}
