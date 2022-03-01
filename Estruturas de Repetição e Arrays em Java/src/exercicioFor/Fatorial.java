package exercicioFor;

import java.util.Scanner;

public class Fatorial {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Fatorial de? ");
		int numero = sc.nextInt();
		int fatorial = numero;
		for(int i = numero - 1; i != 0; i--) {
			fatorial = fatorial * i;
		}
		System.out.print(numero + "! = " + fatorial);
	}

}
