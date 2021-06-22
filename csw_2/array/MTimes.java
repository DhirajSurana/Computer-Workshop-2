package array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class MTimes {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no of elements");
		int length = sc.nextInt();
		System.out.println("enter elements");
		for (int i = 0; i < length; i++) {
			al.add(sc.nextInt());
		}
		Collections.sort(al);
		System.out.println(al);
		System.out.println("Enter no of times");
		int m = sc.nextInt();
		mTimes(al, m);
		sc.close();

	}

	// O(n+m)time === O(n)time
	public static void mTimes(ArrayList<Integer> al, int m) {

		int count = 0;
		int noOfTimes = Math.min(m, 2);
		for (int i = 0; i < al.size(); i += noOfTimes) {

			// O(n) time
			count = Collections.frequency(al, al.get(i));
			if (count == m) {
				if (count > noOfTimes) {
					count = count - noOfTimes;
					while (count != 0) {

						// O(q)time where q is no.of elements having frequency more than count
						al.remove(al.get(i));
						count--;
					}
				}
			}
		}
		System.out.println(al);
	}
}
