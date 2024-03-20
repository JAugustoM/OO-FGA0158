package aula2;
import java.util.Scanner;
import java.lang.Math;

public class Exercicio3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double a = scanner.nextInt();
		double b = scanner.nextInt();
		double c = scanner.nextInt();
		scanner.close();
		
		double delta = Math.pow(b, 2) - 4 * a * c;
		
		if (delta >= 0) {
			double primeiraRaiz = (-b + Math.sqrt(delta)) / 2 * a;
			double segundaRaiz = (-b - Math.sqrt(delta)) / 2 * a;
			
			System.out.println("Primeira raiz: %f\nSegunda raiz: %f".formatted(primeiraRaiz, segundaRaiz));
		}
		
		else {
			System.out.println("Raizes não existem nos reais");
		}
	}

}