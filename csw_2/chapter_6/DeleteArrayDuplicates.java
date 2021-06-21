package chapter_6;

import java.util.Arrays;
import java.util.Scanner;

public class DeleteArrayDuplicates {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no of elements ");
		int length = sc.nextInt();
		int arr[] = new int[length];
		System.out.println("Enter " + length + " elements");
		for (int i = 0; i < length; i++) {
			arr[i] = sc.nextInt();
		}
		Arrays.sort(arr);
		int outArr[] = RemoveDuplicates(arr);
		System.out.println("output array is:");
		for (int i = 0; i < outArr.length; i++) {
			System.out.print(outArr[i] + " ");
		}
		System.out.println();
		sc.close();

	}

	public static int[] RemoveDuplicates(int[] arr) {

		int left = 0, right = 1, lastRight = 1;
		while (left < arr.length && right < arr.length && lastRight < arr.length) {
			if (arr[left] != arr[right]) {
				arr[lastRight] = arr[right];
				left = right;
				right++;
				lastRight++;
			} else {
				right++;
			}
		}
		int[] output = Arrays.copyOf(arr, lastRight);
		return output;
	}

}
