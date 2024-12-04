package atividades_praticas02;

import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {
		String nome;
		int idade;
		boolean doacao;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o Nome do doador: ");
		nome = leia.nextLine();
		
		System.out.println("Digite a Idade do doador: ");
		idade = leia.nextInt();
		
		System.out.println("Primeira doação de sangue?");
		doacao = leia.nextBoolean();
		
		if (idade >= 18 && idade <= 69) {
			if (idade>= 60 && idade <= 69 && doacao == true) {
				System.out.println(nome + " NÃO está APTO a doar sangue.");
			} else {
				System.out.println(nome + " está APTO a doar sangue");
			}
		} else if (idade < 18) {
			System.out.println(nome + " NÃO está APTO a doar sangue");
		} else {
			System.out.println(nome + " está APTO a doar sangue");
		}
	}

}
