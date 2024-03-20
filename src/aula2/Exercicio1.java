package aula2;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite a velocidade máxima do trecho:");
		int velocidadeMaxima = scanner.nextInt();
		System.out.println("Digite a velocidade do veículo:");
		int velocidadeVeiculo = scanner.nextInt();
		scanner.close();
		
		if (velocidadeVeiculo > velocidadeMaxima) {
			if ((velocidadeVeiculo - velocidadeMaxima) <= 10) {
				System.out.println("Veículo fora do limite de velocidade. Multa a pagar: R$50,00");
			} else if ((velocidadeVeiculo - velocidadeMaxima) <= 30) {
				System.out.println("Veículo fora do limite de velocidade. Multa a pagar: R$100,00");
			} else {
				System.out.println("Veículo fora do limite de velocidade. Multa a pagar: R$200,00");
			}
		}
		
		else {
			System.out.println("Veículo dentro do limite de velocidade");
		}
	}

}
