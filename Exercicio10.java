package atividades_praticas02;

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		String nome;
		int cod;
		float salario, novoSalario = 0;

		Scanner leia = new Scanner(System.in);

		System.out.println("Digite o nome do colaborador: ");
		nome = leia.nextLine();

		System.out.println("Digite o salário do colaborador: ");
		salario = leia.nextFloat();

		System.out.println("-------------------------------------");
		System.out.println("       INDUSTRIA TABAJARA LTDA       ");
		System.out.println("-------------------------------------");
		System.out.println("| CÓD |     CARGO     |  % REAJUSTE |");
		System.out.println("|  1  |    Gerente    |      10%    |");
		System.out.println("|  2  |    Vendedor   |       7%    |");
		System.out.println("|  3  |   Supervisor  |	      9%    |");
		System.out.println("|  4  |    Motorista  |	      6%    |");
		System.out.println("|  5  |   Estoquista  |       5%    |");
		System.out.println("|  6  |   Técnico TI  |       8%    |");
		System.out.println("-------------------------------------");

		System.out.println("Seleciona o código do colaborador de acordo com o cargo: ");
		cod = leia.nextInt();

		leia.close();

		switch (cod) {

		case 1:
			novoSalario = salario + (10 * salario / 100);

			System.out.println("Nome do colaborador: " + nome);
			System.out.println("Cargo: Gerente");
			System.out.printf("Salário Reajustado R$ %.2f", novoSalario);

			break;

		case 2:
			novoSalario = salario + (7 * salario / 100);

			System.out.println("Nome do colaborador: " + nome);
			System.out.println("Cargo: Vendedor");
			System.out.printf("Salário Reajustado R$ %.2f", novoSalario);

			break;

		case 3:
			novoSalario = salario + (9 * salario / 100);

			System.out.println("Nome do colaborador: " + nome);
			System.out.println("Cargo: Supervisor");
			System.out.printf("Salário Reajustado R$ %.2f", novoSalario);

			break;

		case 4:
			novoSalario = salario + (6 * salario / 100);

			System.out.println("Nome do colaborador: " + nome);
			System.out.println("Cargo: Motorista");
			System.out.printf("Salário Reajustado R$ %.2f", novoSalario);

			break;

		case 5:
			novoSalario = salario + (5 * salario / 100);

			System.out.println("Nome do colaborador: " + nome);
			System.out.println("Cargo: Estoquista");
			System.out.printf("Salário Reajustado R$ %.2f", novoSalario);

			break;

		case 6:
			novoSalario = salario + (8 * salario / 100);

			System.out.println("Nome do colaborador: " + nome);
			System.out.println("Cargo: Técnico TI");
			System.out.printf("Salário Reajustado R$ %.2f", novoSalario);

			break;

		default:
			System.out.print("Opção Inválida!");
		}
	}

}
