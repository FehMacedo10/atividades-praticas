package atividades_praticas06;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Exercicio26 {

	public static void main(String[] args) {
		int opcao;
		String nome;

		Queue<String> fila = new LinkedList<String>();
		Scanner leia = new Scanner(System.in);

		do {

			System.out.println("\n**************************************");
			System.out.println(" 1 - Adicionar um novo Cliente na fila");
			System.out.println(" 2 - Listar todos os Clientes na fila");
			System.out.println(" 3 - Retirar Cliente da Fila");
			System.out.println(" 0 - Sair");
			System.out.println("**************************************");
			System.out.print("Entre com a opção desejada: ");
			opcao = leia.nextInt();

			switch (opcao) {

			case 1:
				System.out.print("\nDigite o nome do Cliente: ");
				nome = leia.next();
				fila.add(nome);
				
				System.out.println("\nCliente Adicionado!");
				
				break;
			
			case 2:
				System.out.println("\nLista de Clientes na Fila: ");
				
				Iterator<String> iterator = fila.iterator();

				while (iterator.hasNext()) {
					System.out.println(iterator.next());
				}
				
				System.out.println("\nTotal de Clientes na Fila: " + fila.size());
				break;
			
			case 3:
				if (fila.isEmpty() == true) {
					System.out.println("\nA fila está vazia!");

				} else {

					fila.remove();
					System.out.println("\nO Cliente foi Chamado!");
				}

				break;
			
			case 0:	
				System.out.println("\nO Programa foi Finalizado!");
				break;
				
			default:
				System.out.println("\nOpção Inválida");
			
			}
		
		} while (opcao != 0);
	}
}
