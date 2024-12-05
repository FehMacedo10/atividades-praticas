package atividades_praticas03;

import java.util.Scanner;

public class Exercicio14 {

	public static void main(String[] args) {
		int i, num, par = 0, impar = 0;
 
		Scanner leia = new Scanner(System.in);

		for (i = 1; i < 11; i++) {
			System.out.print("Digite o " + i + "º número: ");
			num = leia.nextInt();

			if (num % 2 == 0) {
				
				par++;
			
			} else {
				
				impar++;	
			}	
		}
		
		System.out.println("Total de números PARES: " + par);
		System.out.print("Total de números ÍMPARES:  " + impar);
		
		leia.close();
	}
}
