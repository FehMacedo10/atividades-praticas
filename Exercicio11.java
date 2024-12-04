package atividades_praticas02;

import java.util.Scanner;

public class Exercicio11 {

	public static void main(String[] args) {
		int cod;
		float numero1 = 0, numero2 = 0, resultado = 0;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Digite um número: ");
		numero1 = leia.nextFloat();
		
		System.out.print("Digite outro número: ");
		numero2 = leia.nextFloat();
		
		System.out.println("-----------------------");
		System.out.println("   CALCULADORA MALUCA  ");
		System.out.println("-----------------------");
		System.out.println("| CÓD |    OPERAÇÃO   |");
		System.out.println("|  1  |      SOMA     |");
		System.out.println("|  2  |   SUBTRAÇÃO   |");
		System.out.println("|  3  | MULTIPLICAÇÃO |");
		System.out.println("|  4  |    DIVISÃO    |");
		System.out.println("-----------------------");
		
		System.out.print("Escolha o código da Operação Desejada: ");
		cod = leia.nextInt();
		
		leia.close();
		
		switch(cod) {
		
		case 1: 
			resultado = numero1 + numero2;
			System.out.printf("Resultado: %.2f",resultado);
			
			break;
		
		case 2: 
			resultado = numero1 - numero2;
			System.out.printf("Resultado: %.2f",resultado);
			
			break;

		case 3: 
			resultado = numero1 * numero2;
			System.out.printf("Resultado: %.2f",resultado);
			
			break;
		
		case 4: 
			resultado = numero1 / numero2;
			System.out.printf("Resultado: %.1f",resultado);
			
			break;
		
		default:
			System.out.print("Opção Inválida!");
		
		}
		
	}

}
