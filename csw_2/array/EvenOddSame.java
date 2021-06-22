package array;

import java.util.Scanner;

public class EvenOddSame {

	public static void main(String[] args) {
		// show a array in which even elements comes first followed by odd elements
		// without using new array

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no of elements you want to enter");
		int length = sc.nextInt();
		int ar[] = new int[length];
		int even = 0;
		int odd = length - 1;
		System.out.println("Enter elements");
		for (int j = 0; j < length; j++) {
			int i = sc.nextInt();
			if (i % 2 == 0) {
				ar[even] = i;
				even++;
			} else {
				ar[odd] = i;
				odd -= 1;
			}
		}
		// printing the array
		System.out.println("your array is");
		for (int i = 0; i < length; i++) {
			System.out.println(ar[i] + " ");
		}
		sc.close();

	}

}
