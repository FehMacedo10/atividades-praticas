package atividades_praticas02;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		int A, B, C;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o número A: ");
		A = leia.nextInt();
		
		System.out.println("Digite o número B: ");
		B = leia.nextInt();
		
		System.out.println("Digite o número C: ");
		C = leia.nextInt();
		
		if ((A + B) > C) {
			System.out.println("A soma de A + B é Maior do que C");
		} else if (A + B < C ) {
			System.out.println("A soma de A + B é Menor do que C");
		} else {
			System.out.println("A soma de A + B é Igual a C");
		}
		
		leia.close();
	}

}
