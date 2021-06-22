package string;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class VaildRoman {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter roman numeral");
		String s = sc.next();
		System.out.println(validRoman(s, setMap()));
		sc.close();

	}

	private static Map<Character, Integer> setMap() {
		HashMap<Character, Integer> map = new HashMap<>();
		map.put('I', 1);
		map.put('V', 5);
		map.put('X', 10);
		map.put('L', 50);
		map.put('C', 100);
		map.put('D', 500);
		map.put('M', 1000);
		return map;
	}

	private static boolean validRoman(String s, Map<Character, Integer> map) {
		boolean valid = true;
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (ch != 'I' && ch != 'V' && ch != 'X' && ch != 'L' && ch != 'C' && ch != 'D' && ch != 'M') {
				valid = false;
				break;
			}
		}
		int sum = 0;
		for (int i = 0; i < s.length() - 1; i++) {
			sum += map.get(s.charAt(i));
			if ((map.get(s.charAt(i)) < map.get(s.charAt(i + 1)))) {
				if (sum >= map.get(s.charAt(i + 1))) {
					valid = false;
				}
			}
		}
		return valid;
	}

}
