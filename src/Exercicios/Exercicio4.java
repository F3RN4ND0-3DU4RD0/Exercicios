package Exercicios;

import java.util.Scanner;

/*
 * Escreva um algoritmo que leia o nome de um vendedor,
 *  o seu salário fixo e o total de vendas efetuadas
    por ele no mês (em dinheiro). Sabendo que este vendedor 
    ganha 15% de comissão sobre suas vendas
    efetuadas, informar o seu nome, o salário fixo e salário no final do mês;
 */
public class Exercicio4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe o nome do vendedor: ");
		String vendedor = sc.nextLine();
		//sc.next();  Verificar erro
		System.out.println("Informe o salario fixo do vendedor: ");
		float salarioFixo = sc.nextFloat();
		System.out.println("Qual o total de vendas em R$ efetuadas este mes? ");
		float vendasEfetuadas = sc.nextFloat();
		
		double comissao = vendasEfetuadas * 0.15;
		double salarioFinal = salarioFixo + comissao;
		
		System.out.println("O nome do funcionario e: " + vendedor);
		System.out.println("O salario fixo de "+vendedor+" e: "+ salarioFixo);
		System.out.printf("O salario final de %s sera de: %.2f", vendedor, salarioFinal);
	}

}
