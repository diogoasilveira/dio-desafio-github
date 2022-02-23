package aula03;

public class Switch {
	public static void checaDia(String diaDaSemana) {
		switch(diaDaSemana) {
		case "domingo":
			System.out.print("1\n");
			break;
		case "segunda":
			System.out.print("2\n");
			break;
		case "terça":
			System.out.print("3\n");
			break;
		case "quarta":
			System.out.print("4\n");
			break;
		case "quinta":
			System.out.print("5\n");
			break;
		case "sexta":
			System.out.print("6\n");
			break;
		case "sábado":
			System.out.print("7\n");
			break;
		}
	}
	
	public static void checaNumero(int numero) {
		switch(numero) {
		case 1:
		case 2:
		case 3:
			System.out.print("Certo\n");
			break;
		case 4:
			System.out.print("Errado\n");
			break;
		case 5:
			System.out.print("Talvez\n");
			break;
		default:
			System.out.print("Valor Indefinido\n");
			break;
		}
	}
}
