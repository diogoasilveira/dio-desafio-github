package aula03;

public class Main {

	public static void main(String[] args) {
		System.out.print("Calcula Área de Quadriláteros\n");
		System.out.print("-----------------------------\n");
		double areaQuadrado = calculaAreaQuadrilatero.calculaArea(10);
		System.out.print("A área do quadrado é igual a " + areaQuadrado + "\n");
		double areaRetangulo = calculaAreaQuadrilatero.calculaArea(10, 7.5);
		System.out.print("A área do retângulo é igual a " + areaRetangulo + "\n");
		double areaTrapezio = calculaAreaQuadrilatero.calculaArea(5, 4, 2);
		System.out.print("A área do trapézio é igual a " + areaTrapezio + "\n");
	}

}
