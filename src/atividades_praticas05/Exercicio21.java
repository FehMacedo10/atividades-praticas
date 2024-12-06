package atividades_praticas05;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio21 {

	public static void main(String[] args) {

		ArrayList<String> cores = new ArrayList<String>();

		Scanner leia = new Scanner(System.in);

		System.out.println("Digite 5 cores: ");

		for (int i = 0; i < 5; i++) {

			System.out.print((i + 1) + "ª cor: ");
			String cor = leia.nextLine();

			cores.add(cor)  ;

		}

		System.out.println("\nAs 5 cores são: ");
		for (String cor : cores) {

			System.out.println(cor);
		}
		
		cores.sort(null);
		
		System.out.println("\nAs 5 cores em ordem crescente são: ");
		for (String cor : cores) {

			System.out.println(cor);
	
		}
	}
}
