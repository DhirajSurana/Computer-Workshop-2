package array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MTimesInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> al = new ArrayList<>();
		System.out.println("Enter the no. of elements");
		int length = sc.nextInt();
		System.out.println("Enter elements");
		for (int i = 0; i < length; i++) {
			al.add(sc.nextInt());
		}
		System.out.println("Enter how many times");
		int m = sc.nextInt();
		mTimes(al, m);
		sc.close();

	}

	public static void mTimes(ArrayList<Integer> al, int m) {
		HashMap<Integer, Integer> map = new HashMap<>();
		for (Integer i : al) {
			if (!map.containsKey(i)) {
				map.put(i, 1);
			} else {
				map.replace(i, map.getOrDefault(i, 0) + 1);
			}
		}
		for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
			if (entry.getValue() == m) {
				if (m > 2) {
					int index = al.lastIndexOf(entry.getKey());
					al.remove(index);
				}
			}
		}
		System.out.println(al);
	}
}
