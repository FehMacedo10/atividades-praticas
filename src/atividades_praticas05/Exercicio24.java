package atividades_praticas05;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Exercicio24 {

	public static void main(String[] args) {

		Set<Integer> numeros = new HashSet<Integer>();

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
			
			System.out.print("O número " + numeroEscolhido + " foi encontrado");
		
		} else {
			
			System.out.print("O número " + numeroEscolhido + " não foi encontrado");
		}
		
	}
}
