package test;

import static org.junit.Assert.*;

import java.util.HashSet;
import java.util.Set;

import org.junit.Test;

public class MainTest {

	String[] temp = { "a", "b", "c", "d", "e", "f" };

	public static int loopCnt = 2;

	@Test
	public void testCase1() throws Exception {
		Set<Set> set = new HashSet<Set>();

		Set<String> setInSet = new HashSet<String>();

		setInSet.add("0");
		setInSet.add("1");

		set.add(setInSet);

		System.out.println(set);

		Set<String> setInSet2 = new HashSet<String>();

		setInSet2.add("0");
		setInSet2.add("1");

		set.add(setInSet2);
		System.out.println(set);
	}

	@Test
	public void testName() throws Exception {
		MainTest test = new MainTest();

		test.loopFun(0, 6, 0);

	}

	public void loopFun(int start, int n, int up) {
		loopCnt--;
		for (int i = start; i < n - loopCnt; i++) {
			if (loopCnt == 0) {
				System.out.println(temp[up] + temp[i]);
			} else {
				loopFun(i + 1, n, i);
			}
		}
	}

	public void loopFun2() {

		for (int i = 0; i < temp.length - 1; i++) {
			for (int j = i + 1; j < temp.length; j++) {
				// String[][] st = new String[15][2];
				System.out.println(temp[i] + temp[j]);
			}
		}
	}
}
