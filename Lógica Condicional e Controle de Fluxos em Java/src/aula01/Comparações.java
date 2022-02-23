package aula01;

public class Comparações {
	public static void main(String[] args) {
		int i1 = 10, i2 = 20;
		float f1 = 4.5f, f2 = 3.5f;
		char c1 = 'x', c2 = 'y';
		String s1 = "Fulano", s2 = "Fulano";
		boolean b1 = true, b2 = false;
		Long l1 = 1234L, l2 = 8997L;
		
		//Comparação de ints
		System.out.print("i1 == i2: " + (i1 == i2) + "\n");
		System.out.print("i1 != i2: " + (i1 != i2) + "\n");
		System.out.print("i1 < i2: " + (i1 < i2) + "\n");
		System.out.print("i1 > i2: " + (i1 > i2) + "\n");
		
		//Comparação de floats
		System.out.print("f1 == f2: " + (f1 == f2) + "\n");
		System.out.print("f1 != f2: " + (f1 != f2) + "\n");
		System.out.print("f1 < f2: " + (f1 < f2) + "\n");
		System.out.print("f1 > f2: " + (f1 > f2) + "\n");
		
		//Comparação de chars
		System.out.print("c1 == c2: " + (c1 == c2) + "\n");
		System.out.print("c1 != c2: " + (c1 != c2) + "\n");
		System.out.print("c1 < c2: " + (c1 < c2) + "\n");
		System.out.print("c1 > c2: " + (c1 > c2) + "\n");
		
		//Comparação de Strings
		System.out.print("s1 == s2: " + (s1 == s2) + "\n");
		System.out.print("s1 != s2: " + (s1 != s2) + "\n");
		System.out.print("s1 < s2: " + (s1.length() < s2.length()) + "\n");
		System.out.print("s1 > s2: " + (s1.length() > s2.length()) + "\n");
	}

}
