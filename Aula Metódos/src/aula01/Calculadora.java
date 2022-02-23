package aula01;

public class Calculadora {
	public static void soma(double valorA, double valorB) {
		double resultado = valorA + valorB;
		System.out.print("O resultado da soma de " + valorA + " mais "
				+ valorB + " é igual a: " + resultado + "\n");
	}
	
	public static void subtracao(double valorA, double valorB) {
		double resultado = valorA - valorB;
		System.out.print("O resultado da subtração de " + valorA + " mais "
				+ valorB + " é igual a: " + resultado + "\n");
	}
	
	public static void multiplicacao(double valorA, double valorB) {
		double resultado = valorA * valorB;
		System.out.print("O resultado da multiplicação de " + valorA + " mais "
				+ valorB + " é igual a: " + resultado + "\n");
	}
	
	public static void divisao(double valorA, double valorB) {
		double resultado = valorA / valorB;
		System.out.print("O resultado da divisão de " + valorA + " mais "
				+ valorB + " é igual a: " + resultado + "\n");
	}
}
