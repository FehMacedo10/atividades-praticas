package atividades_praticas05;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio22 {

	public static void main(String[] args) {

		ArrayList<Integer> numeros = new ArrayList<Integer>();
		int posicao;
		Scanner leia = new Scanner(System.in);

		numeros.add(2);
		numeros.add(5);
		numeros.add(1);
		numeros.add(3);
		numeros.add(4);
		numeros.add(9);
		numeros.add(7);
		numeros.add(8);
		numeros.add(10);
		numeros.add(6);

		System.out.println("\nEscolha um número mostrado abaixo: ");
		for (Integer numero : numeros) {

			System.out.print(numero + " ");

		}

		System.out.print("\nNúmero Escolhido: ");
		Integer numeroEscolhido = leia.nextInt();

		if (numeros.contains(numeroEscolhido)) {
			
			posicao = numeros.indexOf(numeroEscolhido);
			System.out.print("\nA posição do índice do número escolhido foi: " + posicao);
		
		} else {
			
			System.out.print("O número " + numeroEscolhido + " não foi encontrado");
		
		}

	}

}
