package atividades_praticas03;

import java.util.Scanner;

public class Exercicio17 {

	public static void main(String[] args) {
		int num, somaNum = 0;

		Scanner leia = new Scanner(System.in);

		do {

			System.out.print("Digite um número: ");
			num = leia.nextInt();

			if (num > 0) {

				somaNum += num;
			}

		} while (num != 0);

		System.out.print("A soma dos números positivos é: " + somaNum);
	}

}
