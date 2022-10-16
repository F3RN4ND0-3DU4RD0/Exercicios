package Exercicios;

import java.util.Scanner;

/*
 * Leia uma temperatura em graus Celsius e apresentá-la 
 * convertida em graus Fahrenheit. Afórmula de
   conversão é:F=(9*C+160) / 5, sendo F a temperatura em Fahrenheit
   e C a temperatura emCelsius;
 */
public class Exercicio6 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Qual a temperatura? *Em Celsius ");
		float c = sc.nextFloat();
		
		float f = (9*c+160)/5;
		
		System.out.printf("A temperatura %.2fC° convertida"
				+ " para Fahrenheit fica %.2f ", c, f);
	}

}
