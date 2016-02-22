package backjoon.online.p3047;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc1 = new Scanner(System.in);
		int[] num = new int[3];
		num[0] = sc1.nextInt();
		num[1] = sc1.nextInt();
		num[2] = sc1.nextInt();

		Arrays.sort(num);

		Scanner sc2 = new Scanner(System.in);
		String str = sc2.nextLine();

		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("A", num[0]);
		map.put("B", num[1]);
		map.put("C", num[2]);

		System.out.printf("%d %d %d\n", map.get(String.valueOf(str.charAt(0))),
				map.get(String.valueOf(str.charAt(1))),
				map.get(String.valueOf(str.charAt(2))));
		
		sc2.close();
		sc1.close();

	}
}
