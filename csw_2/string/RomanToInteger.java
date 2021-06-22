package string;

import java.util.HashMap;
import java.util.Scanner;

public class RomanToInteger {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a roman no.");
		String s = sc.next();
		roman(s);
		sc.close();

	}

	protected static void roman(String s) {
		HashMap<Character, Integer> map = new HashMap<>();
		map.put('I', 1);
		map.put('V', 5);
		map.put('X', 10);
		map.put('L', 50);
		map.put('C', 100);
		map.put('D', 500);
		map.put('M', 1000);
		long sum = 0;
		int i = 0;
		for (i = 0; i < s.length() - 1; i++) {
			if (map.get(s.charAt(i)) >= map.get(s.charAt(i + 1))) {
				sum += map.get(s.charAt(i));
			} else {
				sum -= map.get(s.charAt(i));
			}
		}
		sum += map.get(s.charAt(i));
		System.out.println(sum);
	}

}
