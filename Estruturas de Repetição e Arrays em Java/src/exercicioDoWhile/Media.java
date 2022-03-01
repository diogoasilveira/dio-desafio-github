package exercicioDoWhile;

import java.util.Scanner;

public class Media {
	public static void main(String[] args) {
		int numeros = 0;
		int maior = 0;
		int soma = 0;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.print("Insira a nota: ");
			int num = sc.nextInt();
			soma += num;
			if(num > maior) maior = num;
			numeros++;
		} while(numeros < 5);
		double media = soma / 5;
		System.out.print("A média das notas é " + media
				+ " e a maior nota foi um " + maior);
	}
}
