package aula2;

public class Exercicio10 {

	public static void main(String[] args) {
		double dividendo = 1;
		double somatorio = 0;
		
		for (int divisor = 1; divisor < 51; divisor++) {
			somatorio += dividendo/divisor;
			dividendo += 2;
		}
		
		System.out.println("Valor do somatório = %f".formatted(somatorio));

	}

}
