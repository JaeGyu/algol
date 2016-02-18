package main;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
	private static String[] temp; 
			
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Scanner strSc = new Scanner(System.in);
		
		int numOfInput = sc.nextInt();
		String[] n;
		String c;

		for (int i = 0; i < numOfInput; i++) {
			n = strSc.nextLine().split(" ");
			c = strSc.nextLine().replace(" ", "");
			solve(n, c);
		}
	}

	private static void solve(String[] n, String textLine) {
		int cntOfTempArr = Integer.parseInt(n[1]);
		temp = new String[cntOfTempArr];
		int j=0;
		for(int i=0;i<textLine.length();i=i+2){
			temp[j++] = textLine.substring(i,i+2);
		}
		System.out.println(Arrays.toString(temp));
	}
}
