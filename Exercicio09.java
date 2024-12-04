package atividades_praticas02;

import java.util.Scanner;

public class Exercicio09 {
	
	public static void main(String[] args) {
		int codProduto, quantidade;
	
		Scanner leia = new Scanner(System.in);
		
		System.out.println("-------------------------------------");
		System.out.println("     LANCHONETE LARICA'S LANCHES     ");
		System.out.println("-------------------------------------");
		System.out.println("| CÓD |    PRODUTO    |   PREÇO R$  |");
		System.out.println("|  1  |Cachorro Quente|   R$ 10,00  |");
		System.out.println("|  2  |   X - Salada  |   R$ 15,00  |");
		System.out.println("|  3  |    X- Bacon   |	  R$ 18,00  |");
		System.out.println("|  4  |     Bauru     |	  R$ 12,00  |");
		System.out.println("|  5  |  Refrigerante |   R$  8,00  |");
		System.out.println("|  6  |Suco de Laranja|   R$ 13,00  |");
		System.out.println("Digite o código do produto desejado: ");
		System.out.println("-------------------------------------");
		codProduto = leia.nextInt();
		
		System.out.println("Digite a quantidade do produto selecionado: ");
		quantidade = leia.nextInt();
		
		leia.close();
		
		switch(codProduto) {
		
		case 1:
			float precoDog = 10.00f, valorTotalDog;
			
			valorTotalDog = quantidade * precoDog;
			System.out.println("Cachorro Quente");
			System.out.printf("Valor total do pedido R$ %.2f",valorTotalDog);
				
			break;
		
		case 2:
			float precoSalada = 15.00f, valorTotalSalada;
			
			valorTotalSalada = quantidade * precoSalada;
			System.out.println("X-Salada");
			System.out.printf("Valor total do pedido R$ %.2f",valorTotalSalada);
				
			break;
		
		case 3:
			float precoBacon = 18.00f, valorTotalBacon;
			
			valorTotalBacon = quantidade * precoBacon;
			System.out.println("X-Bacon");
			System.out.printf("Valor total do pedido R$ %.2f",valorTotalBacon);
				
			break;
		
		case 4:
			float precoBauru = 12.00f, valorTotalBauru;
			
			valorTotalBauru = quantidade * precoBauru;
			System.out.println("Bauru");
			System.out.printf("Valor total do pedido R$ %.2f",valorTotalBauru);
				
			break;
			
		case 5:
			float precoRefrigerante = 8.00f, valorTotalRefrigerante;
			
			valorTotalRefrigerante = quantidade * precoRefrigerante;
			System.out.println("Refrigerante");
			System.out.printf("Valor total do pedido R$ %.2f",valorTotalRefrigerante);
				
			break;
			
		case 6:
			float precoSuco = 13.00f, valorTotalSuco;
			
			valorTotalSuco = quantidade * precoSuco;
			System.out.println("Suco de Laranja");
			System.out.printf("Valor total R$ %.2f",valorTotalSuco);
				
			break;
			
		default:
			System.out.println("Opção Inválida!");
		}
	}
}