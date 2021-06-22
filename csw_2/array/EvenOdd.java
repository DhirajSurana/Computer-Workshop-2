package array;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int ar[] = new int[10];
		int even[] = new int[10];
		int odd[] = new int[10];
		int countEven = 0;
		int countOdd = 0;

		// input original array
		System.out.println("enter 10 no.s");
		for (int i = 0; i < 10; i++) {
			ar[i] = sc.nextInt();
			if (ar[i] % 2 == 0) {
				even[countEven] = ar[i];
				countEven++;
			} else {
				odd[countOdd] = ar[i];
				countOdd++;
			}
		}

		// printing original array
		System.out.println("your original array:");
		for (int i : ar)
			System.out.print(i + " ");
		System.out.println();

		// printing even array
		System.out.println("array containing only even no.s");
		for (int i = 0; i < countEven; i++)
			System.out.print(even[i] + " ");
		System.out.println();

		// printing odd array
		System.out.println("array containing only even no.s");
		for (int i = 0; i < countOdd; i++)
			System.out.print(odd[i] + " ");

		sc.close();

	}

}
