package controleDeFLuxo;

import java.util.Locale;
import java.util.Scanner;

public class ResultadoEscolar {
	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
		
		System.out.println("Seja bem-vindo professor");
		System.out.println("Insira a nota do aluno");
		double nota = scanner.nextDouble();
		
		if (nota >= 7) {
			System.out.println("O Aluno foi aprovado!");
		} else if (nota >= 5 && nota < 7) {
			System.out.println("O Aluno precisará de recuperação...");
		} else {
			System.out.println("O Aluno foi reprovado!");
		}
		
		scanner.close();
	}
}
