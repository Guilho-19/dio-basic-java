package controleDeFLuxo;

import java.util.Locale;
import java.util.Scanner;

public class CaixaEletronico {
	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
		
		double saldo = 55.50;
		
		System.out.println("Qual quantia você deseja sacar de sua conta?");
		double valorSolicitado = scanner.nextDouble();
		
		if (valorSolicitado < saldo) {
			saldo = saldo - valorSolicitado;
			System.out.println("Saque realizado com sucesso! "
					+ "Saldo restante: " + saldo);
		} else {
			System.out.println("Não foi possível realizar o seu saque."
					+ "Saldo insuficiênte");
		}
		
		scanner.close();
	}
}
