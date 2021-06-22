package bitwise_Operators;

import java.util.Scanner;

public class LookUpTable216 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int number;
		System.out.println("Enter a no.");
		number = sc.nextInt();
		Lookupfunction(number);
		sc.close();
	}

	public static int callparityfunction(int x) {
		int parity = 0;
		while (x != 0) {
			parity ^= 1;
			x &= x - 1;
		}
		return parity;
	}

	public static void Lookupfunction(int number) {
		int tempnumber = number;
		int[] LookUpTable = new int[(int) Math.pow(2, 5)];
		int index = 0;
		while (tempnumber != 0) {
			LookUpTable[index] = callparityfunction(tempnumber);
			tempnumber >>= 1;
			index++;
		}
		System.out.println("lookup table: ");
		for (int i : LookUpTable) {
			System.out.print(i + " ");
		}

	}

}
