package controleDeFLuxo;

import java.util.Locale;
import java.util.Scanner;

public class PlanoTelefonico {
	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
		
		System.out.println("Selecione um plano para saber mais (BASIC, MIDIA, TURBO");
		String plano = scanner.next().toUpperCase();
		scanner.close();
		
		switch (plano) {
			case "BASIC" -> System.out.println("100 minutos de ligação");
			case "MIDIA" -> System.out.println("100 minutos de ligação + Whats e Instragram grátis");
			case "TURBO" -> System.out.println("100 minutos de ligação + Whats e Instagram grátis + 5GB Youtube");
			default -> System.out.println("Plano Inválido");
		}
	}
}
