package extra;

import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

public class Hashmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, Integer> hmap = new HashMap<Integer, Integer>();
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		System.out.println("Enter the no of elements you want to enter");
		int counter = sc.nextInt();
		while (counter > 0) {
			hmap.put(counter, r.nextInt(5));
			counter--;
		}

		// using lambda expressions

		hmap.forEach((key, value) -> System.out.println(key + " = " + value));

		// using for each loop
		/*
		 * for (Entry<Integer, Integer> entry : hmap.entrySet()) {
		 * System.out.println(entry.getKey() + " = " + entry.getValue()); }
		 */

		sc.close();
	}

}
