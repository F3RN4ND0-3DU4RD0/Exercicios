package Exercicios;

/*
 * Escreva um algoritmo para determinar o consumo médio de um 
 * automóvel sendo fornecida a distância
   total percorrida pelo automóvel e o total de combustível gasto;
 */
public class Exercicio3 {

	public static void main(String[] args) {
		
		float combGst = 23;
		float distIraucuba = 150;
		float distSobral = 230;
		float consMedioIraucuba = combGst / distIraucuba;
		float consMedioSobral = combGst / distSobral;
		
		System.out.printf("Supondo que o automovel foi de Fortaleza a Iraucuba,"
				+ " o combustivel medio usado foi: %.2f", consMedioIraucuba);
		System.out.println();
		System.out.printf("Caso o automoovel va ate Sobral,"
				+ " o combustivel medio sera de: %.2f", consMedioSobral);
	}

}
