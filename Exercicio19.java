package atividades_praticas04;

import java.util.Scanner;

public class Exercicio19 {

	public static void main(String[] args) {
		int indice = 0, posicao = -1;
		int numeros[] = {2, 5, 1, 3, 4, 9, 7, 8, 10, 6};
		
		Scanner leia = new Scanner(System.in);
		
		System.out.print("\nEscolha um número abaixo: ");
		
		for(indice = 0; indice < 10; indice++) {
			System.out.print(numeros[indice] + " ");
		}
		
		System.out.println("\nDigite um número informado na tela para encontrar sua posição: ");
		int numeroEscolhido = leia.nextInt();
		
		for(indice = 0; indice < 10; indice++) {
			if(numeros[indice] == numeroEscolhido) {
				posicao = indice;
			}
		}
		
		if (posicao != -1) {
            System.out.println("O número " + numeroEscolhido + " está localizado na posição: " + posicao);
        } else {
            System.out.println("O número " + numeroEscolhido + " não foi encontrado.");
        }
	}
}

