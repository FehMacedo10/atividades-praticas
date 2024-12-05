package atividades_praticas03;

import java.util.Scanner;

public class Exercicio18 {

	public static void main(String[] args) {
		int num, somaNum  = 0, contagemNum = 0;
		float mediaNum = 0;

		Scanner leia = new Scanner(System.in);

		do {

			System.out.print("Digite um número: ");
			num = leia.nextInt();

			if (num % 3 == 0 && num != 0) {
				
				somaNum += num;
				contagemNum++;		
			}
	
		} while (num != 0);
			
		mediaNum = (float) somaNum / contagemNum;
			
		System.out.printf("A média de todos os números múltiplos de 3 é %.1f", mediaNum);
		
		leia.close();
	}
}
