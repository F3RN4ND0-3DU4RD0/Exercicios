package Exercicios;

import java.util.Scanner;

/*Faça um algoritmo que receba dois números e exiba o resultado da sua soma*/



public class Exercicio1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite N1: ");
		float n1 = sc.nextFloat();
		System.out.println("Digite N2: ");		
		float n2 = sc.nextFloat();
		
		float soma = n1 + n2;
		System.out.println("A soma e: " + soma);
	}

}
