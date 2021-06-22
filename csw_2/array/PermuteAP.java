package array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class PermuteAP {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER LENGTH");
		int length = sc.nextInt();
		System.out.println("ENTER ELEMENTS IN PREMUTATION ARRAY < " + length);
		ArrayList<Integer> p = new ArrayList<Integer>();
		for (int i = 0; i < length; i++) {
			p.add(sc.nextInt());
		}

		System.out.println("ENTER ELEMENTS IN A ARRAY ");
		ArrayList<Integer> a = new ArrayList<Integer>();
		for (int i = 0; i < length; i++) {
			a.add(sc.nextInt());
		}
		permute(p, a);
		sc.close();
	}

	public static void permute(ArrayList<Integer> p, ArrayList<Integer> a) {

		for (int i = 0; i < a.size(); i++) {
			int next = i;
			while (p.get(next) >= 0) {
				Collections.swap(a, i, p.get(next));
				int temp = p.get(next);
				p.set(next, p.get(next) - p.size());
				next = temp;
			}
		}
		System.out.println(a);
	}
}