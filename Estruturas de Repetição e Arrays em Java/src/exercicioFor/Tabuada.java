package exercicioFor;

import java.util.Scanner;

public class Tabuada {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Tabuada do? ");
		int numero = sc.nextInt();
		System.out.print("Tabuada do " + numero + "\n");
		for(int i = 0; i <= 10; i++) {
			System.out.print(numero + " x " + i + " = " + (numero * i) + "\n");
		}
	}

}
