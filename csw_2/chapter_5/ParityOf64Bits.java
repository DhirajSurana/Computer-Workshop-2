package chapter_5;

import java.util.Scanner;

public class ParityOf64Bits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		long number = sc.nextLong();
		Long parity = FindParity(number);
		System.out.println("parity is " + parity);
		sc.close();

	}

	public static long Parity(long x) {
		x ^= x >> 8;
		x ^= x >> 4;
		x ^= x >> 2;
		x ^= x >> 1;
		return x & 1;
	}

	public static long FindParity(long parityNumber) {
		long LookUpTable[] = new long[4];
		long bitmask = 0xFFFF;
		for (int i = 0; i < 4; i++) {
			long checkParity = parityNumber & bitmask;
			LookUpTable[i] = Parity(checkParity);
			parityNumber >>>= 16;
		}
		long result = 0;
		for (long i : LookUpTable) {
			result ^= i;
		}
		return result & 1;
	}
}
