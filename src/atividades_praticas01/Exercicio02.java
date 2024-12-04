package atividades_praticas01;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		
		float n1, n2, n3, n4, mediaFinal;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite a primeira nota: ");
		n1 = leia.nextFloat();
		
		System.out.println("Digite a segunda nota: ");
		n2 = leia.nextFloat();
		
		System.out.println("Digite a terceira nota: ");
		n3 = leia.nextFloat();
		
		System.out.println("Digite a quarta nota: ");
		n4 = leia.nextFloat();
		
		mediaFinal = (n1 + n2 + n3 + n4)/4;
		
		System.out.printf("A média final é %.1f",mediaFinal);
	}

}
