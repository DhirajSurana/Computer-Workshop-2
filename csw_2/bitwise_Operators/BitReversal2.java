package bitwise_Operators;

import java.util.Scanner;

public class BitReversal2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int number;
		System.out.println("Enter a no.");
		number = sc.nextInt();
		reversal(number);
		sc.close();
	}

	public static void reversal(int number) {

		int tempNumber = number;
		StringBuilder s = new StringBuilder();
		for (int i = 0; i < 32; i++) {
			s.append((tempNumber >>>= 1) & 1);
		}
		s.reverse();
		long i = Integer.parseInt(s.toString());
		System.out.println("reverse bits of " + number + " make " + i);

	}

}
