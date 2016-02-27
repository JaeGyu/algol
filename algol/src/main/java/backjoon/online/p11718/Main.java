package backjoon.online.p11718;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String result = "";

		for (int i = 0; i < 100; i++) {

			String temp = sc.nextLine();
			if (temp.isEmpty()) {
				result += temp;
				break;
			} else {
				result += temp + "\n";
			}
		}

		System.out.printf(result);
	}
}
