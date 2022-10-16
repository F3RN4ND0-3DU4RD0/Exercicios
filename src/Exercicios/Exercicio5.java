package Exercicios;

import java.util.Scanner;

/*
 * Escreva um algoritmo que leia o nome de um aluno e
 *  as notas das três provas que ele obteve no semestre.
No final informar o nome do aluno e a sua média (aritmética);
 */
public class Exercicio5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Qual é o nome do Aluno: ");
		String nomeAluno = sc.nextLine();
		System.out.println("Qual foi a primeira nota? ");
		float n1 = sc.nextFloat();
		System.out.println("Qual foi a segunda nota? ");
		float n2 = sc.nextFloat();
		System.out.println("Qual foi a terceira nota? ");
		float n3 = sc.nextFloat();
		
		float media = (n1 + n2 + n3)/ 3;
		
		System.out.printf("O aluno %s esta com a media %.2f", nomeAluno, media);
		
	}

}
