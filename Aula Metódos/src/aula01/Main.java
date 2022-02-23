package aula01;

public class Main {
	public static void main(String[] args) {
		System.out.print("Calculadora\n");
		System.out.print("-----------\n");
		Calculadora.soma(15, 15);
		Calculadora.subtracao(10, 25);
		Calculadora.multiplicacao(2, 2.5);
		Calculadora.divisao(5, 2);
		System.out.print("Mensagem com base na hora\n");
		System.out.print("-----------\n");
		Mensagem.mensagem();
	}
}
