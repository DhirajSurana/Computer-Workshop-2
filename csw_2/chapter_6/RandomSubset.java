package chapter_6;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class RandomSubset {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the value n and k:");
		int n = sc.nextInt();
		int k = sc.nextInt();
		List<Integer> a = randomSubset(n, k);
		System.out.println("random subset is" + a);
		sc.close();
	}

	private static List<Integer> randomSubset(int n, int k) {
		Map<Integer, Integer> changedElements = new HashMap<>();
		Random r = new Random();
		for (int i = 0; i < k; i++) {

			int randIndex = i + r.nextInt(n - 1);
			System.out.println("Random number:" + randIndex);
			Integer ptr1 = changedElements.get(randIndex);
			Integer ptr2 = changedElements.get(i);
			if (ptr1 == null && ptr2 != null) {
				changedElements.put(randIndex, i);
				changedElements.put(i, randIndex);
				// System.out.println(changedElements+"\n");
			} else if (ptr1 == null && ptr2 == null) {
				changedElements.put(i, ptr1);
				changedElements.put(randIndex, i);
				// System.out.println(changedElements+"\n");
			} else {
				changedElements.put(i, ptr1);
				changedElements.put(randIndex, ptr2);
				// System.out.println(changedElements+"\n");
			}
		}
		List<Integer> result = new ArrayList<>();
		for (int i = 0; i < k; i++) {
			result.add(changedElements.get(i));
		}
		return result;
	}
}
