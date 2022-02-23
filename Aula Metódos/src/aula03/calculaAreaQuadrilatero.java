package aula03;

public class calculaAreaQuadrilatero {
	public static double calculaArea(double ladoA) {
		double area = ladoA * ladoA;
		return area;
	}
	
	public static double calculaArea(double ladoA, double ladoB) {
		double area = ladoA * ladoB;
		return area;
	}
	
	public static double calculaArea(double ladoA, double ladoB, double altura) {
		double area = ((ladoA + ladoB) * altura) / 2;
		return area;
	}
}
