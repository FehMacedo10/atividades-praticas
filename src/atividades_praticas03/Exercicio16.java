package atividades_praticas03;

import java.util.Scanner;

public class Exercicio16 {

	public static void main(String[] args) {
		int idade, codGenero, area, areaBackend = 0, mulherFront = 0, homemMobile40 = 0, naoBinario30 = 0,
				totalPessoas = 0;
		float mediaIdade = 0, somaIdade = 0;
		String continua = "S";

		Scanner leia = new Scanner(System.in);

		while (!continua.equalsIgnoreCase("N")) {

			System.out.print("Digite a IDADE do Colaborador: ");
			idade = leia.nextInt();

			System.out.println("-----------------------");
			System.out.println("  FMR DESENVOLVIMENTO  ");
			System.out.println("---------------------- ");
			System.out.println("| CÓD |    GENÊRO     |");
			System.out.println("|  1  |	 Mulher Cis   |");
			System.out.println("|  2  |  Homem Cis    |");
			System.out.println("|  3  |  Não Binário  |");
			System.out.println("|  4  |  Mulher Trans |");
			System.out.println("|  5  |  Homem Trans  |");
			System.out.println("|  6  |    Outros     |");
			System.out.println("-----------------------");
			System.out.print("Digite o Código da Identidade de Genêro do Colaborador: ");
			codGenero = leia.nextInt();

			System.out.println("---------------------- ");
			System.out.println("| CÓD |     ÁREA      |");
			System.out.println("|  1  |	  Backend     |");
			System.out.println("|  2  |   Frontend    |");
			System.out.println("|  3  |    Mobile     |");
			System.out.println("|  4  |   Fullstack   |");
			System.out.println("-----------------------");
			System.out.print("Digite a Área de Desenvolvimento do Colaborador: ");
			area = leia.nextInt();

			System.out.println("\nDigite S para CONTINUAR ou digite N para ENCERRAR: ");
			continua = leia.next();

			totalPessoas++;
			somaIdade += idade;

			if (area == 1) {

				areaBackend++;

			} else if ((codGenero == 1 || codGenero == 4) && area == 2) {

				mulherFront++;

			} else if (codGenero == 2 || codGenero == 5 && area == 3 && idade > 40) {

				homemMobile40++;

			} else if (codGenero == 3 && area == 4 && idade < 30) {

				naoBinario30++;

			}

			if (totalPessoas > 0) {

				mediaIdade = somaIdade / totalPessoas;
			}
		}

		System.out.println("O número de pessoas desenvolvedoras Backend: " + areaBackend);
		System.out.println("O número de Mulheres Cis e Trans desenvolvedoras Frontend: " + mulherFront);
		System.out.println("O número de Homens Cis e Trans desenvolvedores Mobile maiores de 40 anos: " + homemMobile40);
		System.out.println("O número de Não Binários desenvolvedores FullStack menores de 30 anos: " + naoBinario30);
		System.out.println("O número total de pessoas que responderam à pesquisa: " + totalPessoas);
		System.out.printf("A média de idade das pessoas que responderam à pesquisa: %.1f", mediaIdade);
	}
}