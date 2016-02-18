package backjoon.online.p1003;

import java.util.Scanner;

public class Main {

	private static long count_1;
	private static long count_0;

	public static void main(String[] args) {
		Main m = new Main();
		Scanner sc = new Scanner(System.in);
		int scNum = sc.nextInt();

		for (int i = 0; i < scNum; i++) {
			count_1 = 0l;
			count_0 = 0l;
			int n = sc.nextInt();
			m.fibonacci(n);
			System.out.printf("%d %d\n", count_0, count_1);
		}

	}

	public int fibonacci(int n) {
		if (n == 0) {
			count_0++;
			return 0;
		} else if (n == 1) {
			count_1++;
			return 1;
		} else {
			return fibonacci(n - 1) + fibonacci(n - 2);
		}
	}
}
