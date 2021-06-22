package bitwise_Operators;

import java.util.Scanner;

public class ParityUsingXorAndRightShift {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a no");
		int x = sc.nextInt();
		int parity = Parity(x);
		System.out.println("parity of " + x + "is " + parity);
		sc.close();
	}

	public static int Parity(int parityNumber) {
		parityNumber ^= parityNumber >>> 16;
		parityNumber ^= parityNumber >>> 8;
		parityNumber ^= parityNumber >>> 4;
		parityNumber ^= parityNumber >>> 2;
		parityNumber ^= parityNumber >>> 1;
		return parityNumber & 1;

	}

}
