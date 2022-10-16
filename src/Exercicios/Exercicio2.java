package Exercicios;

import java.util.Scanner;

/*
 * Faça um algoritmo que receba dois números e ao final mostre a soma,
 * subtração, multiplicação e a divisão
   dos dois números lidos
 */
public class Exercicio2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o primeiro numero: ");
		float n1 = sc.nextFloat();
		System.out.println("Digite qualquer outro numero: ");
		float n2 = sc.nextFloat();
		
		float soma = n1 + n2;
		float subt = n1 - n2;
		float mult = n1 * n2;
		float divi = n1 / n2;
		
	System.out.printf("A soma entre %.2f e %.2f = %.2f", n1, n2, soma);
	System.out.println("");
	System.out.printf("A soma entre %.2f e %.2f = %.2f", n1, n2, subt);
	System.out.println("");
	System.out.printf("A soma entre %.2f e %.2f = %.2f", n1, n2, mult);
	System.out.println("");
	System.out.printf("A soma entre %.2f e %.2f = %.2f", n1, n2, divi);
	}

}
