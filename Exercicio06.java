package atividades_praticas02;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		int numero;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		numero = leia.nextInt();
		
		if (numero >= 0 && numero % 2 == 0) {
			System.out.println("O número é PAR e POSITIVO");
		} else if (numero >= 0 && numero % 2 == 1)  {
			System.out.println("O número é ÍMPAR e POSITIVO");
		} else if (numero < 0 && numero % 2 == 0) {
			System.out.println("O número é PAR e NEGATIVO");
		} else {
			System.out.println("O número é ÍMPAR e NEGATIVO");
		}
		
		leia.close();
	}
}
