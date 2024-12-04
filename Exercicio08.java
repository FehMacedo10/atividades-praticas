package atividades_praticas02;

import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {
		String caracteristica1, caracteristica2, caracteristica3;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite a primeira característica: ");
		caracteristica1 = leia.next();
		
		System.out.println("Digite a segunda característica: ");
		caracteristica2 = leia.next();
		
		System.out.println("Digite a terceira característica: ");
		caracteristica3 = leia.next();
	
		if (caracteristica1.equalsIgnoreCase("Vertebrado")) {
			if (caracteristica2.equalsIgnoreCase("Ave")) {
				if (caracteristica3.equalsIgnoreCase("Carnívoro")) {
					System.out.println("Águia");
				} else {
					System.out.println("Pomba");
				}
			} else if (caracteristica2.equalsIgnoreCase("Mamífero")) {
				if(caracteristica3.equalsIgnoreCase("Onívoro")) {
					System.out.println("Homem");
				} else {
					System.out.println("Vaca");
				}
			}		
		
		} else if (caracteristica1.equalsIgnoreCase("Invertebrado")) {
			if (caracteristica2.equalsIgnoreCase("Inseto")) {
				if (caracteristica3.equalsIgnoreCase("Hematófago")) {
					System.out.println("Pulga");
				} else {
					System.out.println("Lagarta");
				}
			} else if (caracteristica2.equalsIgnoreCase("Anelídeo")) {
				if(caracteristica3.equalsIgnoreCase("Hematófago	")) {
					System.out.println("Sanguessuga");
				} else {
					System.out.println("Minhoca");	
				}
			}
		
			leia.close();
		}
	}
}
