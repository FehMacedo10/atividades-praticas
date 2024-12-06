package atividades_praticas05;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;


public class Exercicio23 {

	public static void main(String[] args) {

		Set<Integer> numeros = new HashSet<Integer>();
		Scanner leia = new Scanner(System.in);

		System.out.println("\nDigite 10 números aleatórios abaixo: ");

		for (int i = 0; i < 10; i++) {

			System.out.print((i + 1) + "ª número: ");
			Integer numero = leia.nextInt();

			numeros.add(numero);
 
		}

		System.out.print("\nRESULTADO SET: ");
		System.out.print(numeros + " ");

	}

}
