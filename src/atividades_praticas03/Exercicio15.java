package atividades_praticas03;

import java.util.Scanner;

public class Exercicio15 {

	public static void main(String[] args) {
		int idade = 0, menor = 0, maior = 0;
		
		Scanner leia = new Scanner(System.in);
		
		while (idade >= 0) {
			
			System.out.print("DIGITE UMA IDADE:" );
			idade = leia.nextInt();
			
			if (idade >= 0 && idade <= 21) {
				
				menor++;
				
			} else if (idade >= 50) {
				
				maior++;
			}
			
		}
		
		System.out.println("Total de pessoas menores de 21 anos " + menor );
		System.out.print("Total de pessoas maiores de 50 anos " + maior );
		
		leia.close();
	}
}