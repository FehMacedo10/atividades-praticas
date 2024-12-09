package atividades_praticas06;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Stack;

public class Exercicio27 {

	public static void main(String[] args) {
		int opcao;
		String nomeLivro;
		
		Stack<String> pilha = new Stack<String>();
		Scanner leia = new Scanner(System.in);
		
		do {
			
			System.out.println("\n**************************************");
			System.out.println(" 1 - Adicionar Livro na pilha");
			System.out.println(" 2 - Listar todos os Livros");
			System.out.println(" 3 - Retirar Livro da pilha");
			System.out.println(" 0 - Sair");
			System.out.println("**************************************");
			System.out.print("Entre com a opção desejada: ");
			opcao = leia.nextInt();
			leia.nextLine();
			
			switch (opcao) {
			
			case 1:
				System.out.print("\nDigite o nome do Livro: ");
				nomeLivro = leia.nextLine();
				
				pilha.push(nomeLivro);
				
				System.out.println("\nLivro Adicionado!");
				
				break;
			
			case 2:
				System.out.println("\nLista de Livros na Pilha: ");
				
				Iterator<String> iterator = pilha.iterator();

				while (iterator.hasNext()) {
					System.out.println(iterator.next());
				}
				
				System.out.println("\nTotal de Livros na Pilha: " + pilha.size());
				break;
			
			case 3:
				if (pilha.isEmpty() == true) {
					System.out.println("\nA pilha está vazia!");

				} else {

					pilha.pop();
					System.out.println("\nUm Livro foi retirado da pilha!");
				}

				break;
			
			case 0:	
				System.out.println("\nO Programa foi Finalizado!");
				break;
			
			default:
				System.out.println("\nOpção Inválida");

			}
			
		
		} while(opcao != 0);
	
	
	}

}
