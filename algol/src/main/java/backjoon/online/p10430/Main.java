package backjoon.online.p10430;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		System.out.printf("%d\n", (a + b) % c);
		System.out.printf("%d\n", (a % c + b % c) % c);
		System.out.printf("%d\n", (a * b) % c);
		System.out.printf("%d\n", (a % c * b % c) % c);
	}
}
