package aula02;

public class calculaAreaQuadrilatero {
	public static void calculaArea(double ladoA) {
		double area = ladoA * ladoA;
		System.out.print("A área do quadrado é igual a " + area + "\n");
	}
	
	public static void calculaArea(double ladoA, double ladoB) {
		double area = ladoA * ladoB;
		System.out.print("A área do retângulo é igual a " + area + "\n");
	}
	
	public static void calculaArea(double ladoA, double ladoB, double altura) {
		double area = ((ladoA + ladoB) * altura) / 2;
		System.out.print("A área do trapézio é igual a " + area + "\n");
	}
}
