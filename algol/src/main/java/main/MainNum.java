package main;

import java.util.Scanner;

public class MainNum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		long n = sc.nextLong();
		long incNum = 1l;

		while (n > 0) {
			n -= incNum;
			incNum++;
		}
		System.out.println(--incNum);
	}
}
