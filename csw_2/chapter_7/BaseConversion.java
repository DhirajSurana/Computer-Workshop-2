package chapter_7;

import java.util.Scanner;

public class BaseConversion {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the root base");
		int rootBase = sc.nextInt();
		System.out.println("enter no.");
		String rootNo = sc.next();
		System.out.println("enter the destination base");
		int desBase = sc.nextInt();
		int cal = anyBaseToAnyBase(rootNo, rootBase, desBase);
		System.out.println("Ans: " + cal);
		sc.close();
	}

	private static int anyBaseToAnyBase(String rootNo, int rootBase, int desBase) {
		int out = anyBaseToDecimal(rootNo, rootBase);
		return decimalToAnyBase(out, desBase);
	}

	private static int anyBaseToDecimal(String s, int base) {
		int rv = 0;
		for (int i = 0; i < s.length(); i++) {
			rv += Math.pow(base, s.length() - i - 1) * (s.charAt(i) - 48);
		}
		return rv;
	}

	private static int decimalToAnyBase(int n, int base) {
		int rv = 0;
		int pow = 1;
		while (n > 0) {
			int temp = n % base;
			n = n / base;
			rv += temp * pow;
			pow *= 10;
		}
		return rv;
	}
}
