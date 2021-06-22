package array;

import java.util.Scanner;

public class NoOfOccurences {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no of elements you want to enter");
		int length = sc.nextInt();
		int ar[] = new int[length];
		System.out.println("Enter elements");
		for (int i = 0; i < length; i++) {
			ar[i] = sc.nextInt();
		}
		System.out.println("Enter the no you want to search");
		int n = sc.nextInt();
		int result = OccurrenceNumber(ar, n);
		System.out.println("frequency of " + n + " is " + result);
		sc.close();
	}

	public static int OccurrenceNumber(int[] ar, int n) {
		int count = 0;
		for (int i = 0; i < ar.length; i++) {
			if (ar[i] == n)
				count++;
		}
		return count;
	}

}
