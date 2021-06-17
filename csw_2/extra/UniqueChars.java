package extra;

import java.util.Scanner;

public class UniqueChars {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] character = new char[10];
		for (int i = 0; i < 10; i++) {
			character[i] = sc.next().charAt(0);
		}

		boolean result = resultisUnique(character);
		System.out.println(result);
		sc.close();
	}

	private static boolean resultisUnique(char[] character) {

		int check = 0;
		for (int i = 0; i < character.length; i++) {
			int c = character[i] - 'a';
			if ((check & (1 << c)) > 0) {
				return false;
			}
			check |= 1 << c;
		}
		return true;
	}

}
