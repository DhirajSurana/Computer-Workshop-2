package array;

import java.util.Random;
import java.util.Scanner;

public class FlagProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		System.out.println("Enter the no. of elements you want to add");
		int length = sc.nextInt();
		System.out.println("Input array: ");
		int inputArray[] = new int[length];
		for (int i = 0; i < length; i++) {
			inputArray[i] = r.nextInt(3);
			System.out.print(inputArray[i] + " ");
		}
		int[] outputArray = sortByPointer(inputArray);
		System.out.println();
		System.out.println("Output array is: ");
		for (int i : outputArray) {
			System.out.print(i + " ");
		}
		sc.close();

	}

	private static int[] sortByPointer(int[] inputArray) {
		int left = 0, mid = 0, right = inputArray.length - 1;
		while (mid <= right) {
			if (inputArray[mid] == 0) {
				inputArray = swap(mid, left, inputArray);
				mid++;
				left++;
			}

			else if (inputArray[mid] == 1) {
				mid++;
			}

			else if (inputArray[mid] == 2) {
				inputArray = swap(mid, right, inputArray);
				right--;
			}
		}

		return inputArray;
	}

	private static int[] swap(int mid, int anothervalue, int[] inputArray) {
		// TODO Auto-generated method stub
		int midvalue = inputArray[mid];
		inputArray[mid] = inputArray[anothervalue];
		inputArray[anothervalue] = midvalue;
		return inputArray;
	}

}
