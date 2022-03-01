package exercicioWhile;

import java.util.Scanner;

public class Nota {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.print("Insira uma nota: ");
		double nota = sc.nextDouble();
		while(nota > 10 || nota < 0) {
			System.out.print("Nota inválida, insira uma nota entre 0 e 10: ");
			nota = sc.nextDouble();
		}
	}
}
