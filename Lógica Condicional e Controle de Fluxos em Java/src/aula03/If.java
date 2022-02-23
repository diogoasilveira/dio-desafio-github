package aula03;

public class If {
	public static void checaMês(int numero) {
		if(numero == 1) {
			System.out.print("Janeiro\n");
		} else if (numero == 2) {
			System.out.print("Fevereiro\n");
		} else if (numero == 3) {
			System.out.print("Março\n");
		} else if (numero == 4) {
			System.out.print("Abril\n");
		} else if (numero == 5) {
			System.out.print("Maio\n");
		} else if (numero == 6) {
			System.out.print("Junho\n");
		} else if (numero == 7) {
			System.out.print("Julho\n");
		} else if (numero == 8) {
			System.out.print("Agosto\n");
		} else if (numero == 9) {
			System.out.print("Setembro\n");
		} else if (numero == 10) {
			System.out.print("Outubro\n");
		} else if (numero == 11) {
			System.out.print("Novembro\n");
		} else if (numero == 12) {
			System.out.print("Dezembro\n");
		}
		if(numero == 1 || numero == 7 || numero == 12) {
			System.out.print("Férias!\n");
		}
	}
}
