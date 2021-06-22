package array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

// O(N) time
public class DutchNationalProblem {

	static long startTime = System.currentTimeMillis();

	// O(N)time
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random r = new Random();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no. of elements you want to add");
		int length = sc.nextInt();
		int arr[] = new int[length];
		for (int i = 0; i < length; i++) {
			arr[i] = r.nextInt(3);
			System.out.print(arr[i] + " ");
		}
		sort(arr);
		timeTaken();
		sc.close();

	}

	// O(N) time
	public static void sort(int[] arr) {
		// TODO Auto-generated method stub
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		ArrayList<Integer> al = new ArrayList<>();
		for (int i : arr) {
			if (map.containsKey(i)) {
				map.put(i, map.get(i) + 1);
			} else {
				map.put(i, 1);
			}

		}
		for (int i = 0; i <= 2; i++) {
			int count = map.get(i);
			while (count > 0) {
				al.add(i);
				count--;
			}
		}
		System.out.println();
		System.out.println("Result: " + al);

	}

	public static void timeTaken() {
		long endTime = System.currentTimeMillis();
		System.out.print((endTime - startTime) * 0.001);
	}
}
