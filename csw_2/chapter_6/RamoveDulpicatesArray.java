package chapter_6;

import java.util.Arrays;
import java.util.Scanner;

public class RamoveDulpicatesArray {

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
		for (int i : arr) {
			System.out.print(i + " ");
		}
		int outArr[] = RemoveDuplicates(arr);
		System.out.println();
		System.out.println("output array is:");
		for (int i = 0; i < outArr.length; i++) {
			System.out.print(outArr[i] + " ");
		}
		sc.close();

	}

	public static int[] RemoveDuplicates(int[] arr) {
		// TODO Auto-generated method stub
		int output[] = new int[arr.length];
		int outindex = 1;
		int lastInputValue = arr[0];
		output[0] = arr[0];
		if (arr.length == 0) {
			return output;
		} else {
			for (int i = 1; i < arr.length; i++) {
				if (arr[i] != lastInputValue) {
					output[outindex] = arr[i];
					lastInputValue = arr[i];
					outindex++;
				}
			}
		}
		int[] temp = Arrays.copyOf(output, outindex);
		return output = temp;
	}

}
