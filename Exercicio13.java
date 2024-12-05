package atividades_praticas03;

import java.util.Scanner;

public class Exercicio13 {

	public static void main(String[] args) {
		int intervaloDigitado, num1, num2;

		Scanner leia = new Scanner(System.in);
		
		System.out.print("Digite o 1º número: ");
		num1 = leia.nextInt();
		
		System.out.print("Digite o 2º número: ");
		num2 = leia.nextInt();	
		
		if (num1 > num2) {
			
			System.out.print("INTERVALO INVÁLIDO!!!");
		
		} else {
			
			System.out.println("Números Divisíveis por 3 e 5 no interavalo digitado");

			for (intervaloDigitado = num1; intervaloDigitado < num2; intervaloDigitado++) {
				
				if (intervaloDigitado % 3 == 0 && intervaloDigitado % 5 == 0) {
				
					 System.out.println(intervaloDigitado + " é múltiplo de 3 e 5");	
				}
		
			}
		}
	}
}
