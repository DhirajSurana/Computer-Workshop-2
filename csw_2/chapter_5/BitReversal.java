package chapter_5;

import java.util.Scanner;

public class BitReversal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		short number;
		System.out.println("Enter a no.");
		number = sc.nextShort();
		System.out.println("in binary form " + Integer.toBinaryString(number));
		reverseBits(number);
		sc.close();
	}

	public static void reverseBits(short number) {
		short[] LookUpTable = new short[16];
		for (int i = 0; i < 16; i++) {
			LookUpTable[i] = (short) (number & 1);
			number >>= 1;
		}
		System.out.println("reversed bits using look up table: ");
		for (short i : LookUpTable) {
			System.out.print(i);
		}
	}

}
