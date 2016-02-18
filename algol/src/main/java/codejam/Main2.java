package codejam;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main2 {
	public static void main(String[] args) throws IOException {
		FileWriter writer = new FileWriter("small.out");

		BufferedReader reader = new BufferedReader(new FileReader("small.in"));

		Main2 main = new Main2();
		int inputCnt = Integer.parseInt(reader.readLine());

		for (int i = 0; i < inputCnt; i++) {
			String result = main.solve(reader.readLine());
			writer.write(String.format("Case #%d: %s\n", i + 1, result));
		}

		reader.close();
		writer.close();
	}

	private String solve(String readLine) {
		String result = "";

		String datas[] = readLine.split(" ");
		String digits = datas[0];
		String srcLang = datas[1];
		String targetLang = datas[2];

		int targetDigitCount = targetLang.length();
		int decimal = toDecimal(digits, srcLang);
		int div = decimal;
		
		while (div >= targetDigitCount) {
			int mod = div % targetDigitCount;
			div = div / targetDigitCount;

			result = targetLang.charAt(mod) + result;
		}
		
		result = targetLang.charAt(div) + result;

		return result;
	}

	private int toDecimal(String digits, String srcLang) {
		// TODO Auto-generated method stub
		return 0;
	}
}
