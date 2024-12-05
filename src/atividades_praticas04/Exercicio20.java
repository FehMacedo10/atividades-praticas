package atividades_praticas04;

import java.util.Scanner;

public class Exercicio20 {

	public static void main(String[] args) {

		int numeros[] = new int[10], indice = 0, somaTotal = 0, contagemNum = 0;
		float mediaTotal = 0;
		String pares = "Elementos Pares: ";
		String impares = "Elementos nos Índices Ímpares: ";

		Scanner leia = new Scanner(System.in);

		for (indice = 0; indice < 10; indice++) {
			System.out.print("Digite o " + (indice + 1) + "º Número: ");
			numeros[indice] = leia.nextInt();
			contagemNum++;
		}

		for (indice = 0; indice < 10; indice++) {
			if (numeros[indice] % 2 == 0) {

				pares += numeros[indice] + " ";

			}  
			
			if (indice % 2 == 1) {
				
				
				impares += numeros[indice] + " ";

			}

			somaTotal += numeros[indice];
			mediaTotal = (float) somaTotal / contagemNum;
		}

		System.out.println(impares);
		System.out.println(pares);
		System.out.println("Soma: " + somaTotal);
		System.out.printf("Média: %.2f", mediaTotal);

	}
}
