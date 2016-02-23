package backjoon.online.p10871;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc1 = new Scanner(System.in);

		int[] scNum = new int[2];
		scNum[0] = sc1.nextInt();
		scNum[1] = sc1.nextInt();

		int[] arrNum = new int[scNum[0]];

		for (int i = 0; i < scNum[0]; i++) {
			arrNum[i] = sc1.nextInt();
		}

		String result = "";

		for (int a : arrNum) {
			if (a < scNum[1]) {
				result += a + " ";
			}
		}

		System.out.println(result.trim());
	}
}
