package exercicioWhile;

import java.util.Scanner;

public class NomeIdade {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.print("nome: ");
			String nome = sc.next();
			if(nome.equals("0")) break;
			System.out.print("idade: ");
			String idade = sc.next();
		}
	}
}
