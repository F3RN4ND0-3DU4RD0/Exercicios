package Exercicios;

import java.util.Scanner;

/*
 * Faça um algoritmo que receba um número 
 * e mostre uma mensagem CASO este número seja maior que 10;
 */
public class Exercicio7 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite um numero: ");
		int n = sc.nextInt();
		
		
		if (n>10) {
			System.out.println("O numero e maior que 10!");
		}
	}

}
