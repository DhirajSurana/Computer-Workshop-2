package string;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Memonics {
	// 2276696
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a lengthy digit");
		String s = sc.next();
		createMemo(s);
		sc.close();
	}

	private static void createMemo(String s) {
		ArrayList<String> ans = new ArrayList<>();
		HashMap<Character, String> map = new HashMap<>();
		map.put('2', "abc");
		map.put('3', "def");
		map.put('4', "ghi");
		map.put('5', "jkl");
		map.put('6', "mno");
		map.put('7', "pqrs");
		map.put('8', "tuv");
		map.put('9', "wxyz");
		findMemo(s, 0, map, new StringBuilder(), ans);
		System.out.println(ans);
	}

	private static void findMemo(String s, int i, HashMap<Character, String> map, StringBuilder sb,
			ArrayList<String> ans) {
		if (i == s.length()) {
			ans.add(sb.toString());
			return;
		}
		String cur = map.get(s.charAt(i));
		for (int j = 0; j < cur.length(); j++) {
			sb.append(cur.charAt(j));
			findMemo(s, i + 1, map, sb, ans);
			sb.deleteCharAt(sb.length() - 1);
		}

	}

}
