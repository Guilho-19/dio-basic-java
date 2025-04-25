package aulaIDE;

import java.util.Scanner;

public class Desafio {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada do saldo inicial
        System.out.println("Qual a quantia que se encontra na conta?");
        double saldoInicial = scanner.nextDouble();

        // TODO: Na linha abaixo, implemente a entrada das três transações:
        System.out.println("Insira a primeira transação");
        double primeiraTransacao = scanner.nextDouble();
        
        System.out.println("Insira a segunda transação");
        double segundaTransacao = scanner.nextDouble();
        
        System.out.println("Insira a terceira transação");
        double terceiraTransacao = scanner.nextDouble();

        // TODO: Na linha abaixo, realize o cálculo do saldo final:
        double saldoFinal = saldoInicial + primeiraTransacao + segundaTransacao + terceiraTransacao;
        
        // Saldo final
        System.out.printf("%.2f\n", + saldoFinal);

        scanner.close();
    }
}
