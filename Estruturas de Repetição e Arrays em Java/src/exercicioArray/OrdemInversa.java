package exercicioArray;

import java.util.Scanner;

public class OrdemInversa {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int lidos = 0;
		int[] nums = new int[5];
		while(lidos < 5) {
			nums[lidos] = sc.nextInt();
			lidos++;
		}
		for(int i = nums.length - 1; i >= 0; i--) {
			System.out.print(nums[i] + "\n");
		}
	}
}
