package array;

import java.util.Arrays;
import java.util.Scanner;

public class SecondLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int ar[] = new int[10];
		System.out.println("enter 10 no.s");
		for (int i = 0; i < 10; i++)
			ar[i] = sc.nextInt();
		Arrays.sort(ar);
		System.out.println("second largest element: " + ar[(ar.length - 1) - 1]);
		sc.close();

	}

}
