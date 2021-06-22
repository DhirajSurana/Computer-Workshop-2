package array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class NextPermutation {
	// 5 3 2
	// 4 3 1 2 8 0
	// 6 2 1 5 4 3 0

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER LENGTH");
		int length = sc.nextInt();
		System.out.println("ENTER ELEMENTS IN A ARRAY ");
		ArrayList<Integer> a = new ArrayList<Integer>();
		for (int i = 0; i < length; i++) {
			a.add(sc.nextInt());
		}
		List<Integer> out = nextPermutation(a);
		System.out.println(out);
		sc.close();

	}

	private static List<Integer> nextPermutation(ArrayList<Integer> a) {
		int inverse = -1;
		boolean isDecreasing = true;
		for (int i = 0; i < a.size() - 1; i++) {
			if (a.get(i) < a.get(i + 1)) {
				isDecreasing = false;
				inverse = i;
			}
		}
		if (isDecreasing) {
			return Collections.emptyList();
		}
		for (int j = a.size() - 1; j > inverse; j--) {
			if (a.get(j) > a.get(inverse)) {
				Collections.swap(a, inverse, j);
				break;
			}
		}
		Collections.reverse(a.subList(inverse + 1, a.size()));
		return a;
	}
}
