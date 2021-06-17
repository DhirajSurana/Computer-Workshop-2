package chapter_6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class InversePermutation {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER LENGTH");
		int length = sc.nextInt();
		System.out.println("ENTER ELEMENTS IN A ARRAY ");
		ArrayList<Integer> a = new ArrayList<Integer>();
		for (int i = 0; i < length; i++) {
			a.add(sc.nextInt());
		}
		ArrayList<Integer> out = permuteInverse(a);
		System.out.println(out);
		sc.close();
	}

	private static ArrayList<Integer> permuteInverse(ArrayList<Integer> a) {
		ArrayList<Integer> result = new ArrayList<>(Collections.nCopies(a.size(), -1));
		for (int i : a) {
			result.set(i - 1, a.indexOf(i) + 1);
		}
		return result;
	}

}
