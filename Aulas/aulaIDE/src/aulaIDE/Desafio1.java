package aulaIDE;

import java.util.Scanner;

public class Desafio1 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double saldo = scanner.nextDouble();

        // TODO: Implemente a classificação do cliente com base no saldo:
        if (saldo < 0) {
            System.out.println("Negativado");
        } else if (saldo > 500) {
            System.out.println("Confortavel");
        } else {
            System.out.println("Baixo");
        }


        scanner.close();
    }
}
