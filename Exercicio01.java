package atividades_praticas01;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		float salario, abono, novoSalario;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o Salário: ");
		salario = leia.nextFloat();
		
		System.out.println("Digite o Abono: ");
		abono = leia.nextFloat();
		
		novoSalario = salario + abono;
		
		System.out.printf("O novo salário definido é R$ %.2f ",novoSalario);
		
	}

}
