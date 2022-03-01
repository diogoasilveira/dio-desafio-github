package exercicioArray;

import java.util.Arrays;
import java.util.Scanner;

public class Consoantes {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] palavra = sc.next().split("");
		int consoantes = 0;
		for(String i : palavra) {
			if(i == "a" || i == "e" || i == "i" || i == "o"
					|| i == "u");
			else consoantes++;
		}
		System.out.print(Arrays.toString(palavra));
		System.out.print("consoantes: " + consoantes);
	}

}
