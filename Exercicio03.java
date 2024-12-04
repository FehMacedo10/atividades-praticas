package atividades_praticas01;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		
		float salarioBruto, adicionalNoturno, horasExtras, descontos, salarioLiquido;
		
		Scanner leia =  new Scanner(System.in);
		
		System.out.println("Digite o Salário Bruto: ");
		salarioBruto = leia.nextFloat();

		System.out.println("Digite o Adicional Noturno: ");
		adicionalNoturno = leia.nextFloat();

		System.out.println("Digite as Horas Extras: ");
		horasExtras = leia.nextFloat();

		System.out.println("Digite os Descontos: ");
		descontos = leia.nextFloat();
		
		salarioLiquido = salarioBruto + adicionalNoturno + (horasExtras * 5) - descontos;
		
		System.out.printf("O valor do Salário Líquido é R$ %.2f",salarioLiquido);

	}

}
