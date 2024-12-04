
package atividades_praticas02;

import java.util.Scanner;

public class Exercicio12 {

	public static void main(String[] args) {
		int cod;
		float saldo = 1000.00f, saque = 0, saldoAtual = 0, deposito = 0;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("-----------------------");
		System.out.println("   BANCO PINGUNÇO SA   ");
		System.out.println("-----------------------");
		System.out.println("| CÓD |    OPERAÇÃO   |");
		System.out.println("|  1  |     SALDO     |");
		System.out.println("|  2  |     SAQUE     |");
		System.out.println("|  3  |    DEPÓSITO   |");
		System.out.println("-----------------------");
		
		System.out.print("Digite o Código da Operação Desejada: ");
		cod = leia.nextInt();
		
		switch(cod) {
			
		case 1:
			saldoAtual = saldo;
			
			System.out.printf("SALDO ATUAL: R$ %.2f",saldo);
			
			break;
		
		case 2:
			System.out.print("Digite o Valor do Saque: R$ ");
			saque = leia.nextFloat();
			
			saldoAtual = saldo - saque;
			
			if(saldoAtual <= 0) {
				System.out.print("Saldo insuficiente para realizar o saque.");
			} else {	
				saldoAtual = saldo - saque;
				System.out.printf("SALDO ATUAL: R$ %.2f",saldoAtual);
			}
			
			break;
		
		case 3:
			System.out.print("Digite o Valor do Depósito: R$ ");
			deposito = leia.nextFloat();
			
			saldoAtual = saldo + deposito;
			
			System.out.printf("SALDO ATUAL: R$ %.2f",saldoAtual);
			
			break;
		
		default:
			System.out.print("Opção Inválida!");
		}
	}
}
