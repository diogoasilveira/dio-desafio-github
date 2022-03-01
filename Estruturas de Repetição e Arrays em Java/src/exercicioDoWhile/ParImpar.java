package exercicioDoWhile;

import java.util.Scanner;

public class ParImpar {
	public static void main(String[] agrs) {
		Scanner sc = new Scanner(System.in);
		int pares = 0;
		int impares = 0;
		System.out.print("Números que serão passados: ");
		int n = sc.nextInt();
		int quantidadeNumeros = n;
		int i = 0;
		do {
			n = sc.nextInt();
			if(n % 2 == 0) pares++;
			else impares++;
			i++;
		} while(i < quantidadeNumeros);
		System.out.print("Pares: " + pares + "\n");
		System.out.print("Impares: " + impares + "\n");
		
	}
}
