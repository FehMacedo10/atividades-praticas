package atividades_praticas01;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		
		float n1, n2, n3, n4, resultado;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o primeira número: ");
		n1 = leia.nextFloat();
		
		System.out.println("Digite o segundo número: ");
		n2 = leia.nextFloat();
		
		System.out.println("Digite o terceiro número: ");
		n3 = leia.nextFloat();
		
		System.out.println("Digite o quarto número: ");
		n4 = leia.nextFloat();
		
		
		resultado = (n1 * n2) - (n3 * n4);
		
		System.out.printf("Diferença",resultado);

	}

}
