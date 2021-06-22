package recursion;

import java.util.Scanner;

public class TowerOfHanoi {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int t1 = 101;
		int t2 = 102;
		int t3 = 103;
		hanoi(n, t1, t2, t3);
		sc.close();
	}

	private static void hanoi(int n, int t1id, int t2id, int t3id) {
		if (n == 0) {
			return;
		}
		hanoi(n - 1, t1id, t3id, t2id);
		System.out.println(n + " " + t1id + " -> " + t2id);
		hanoi(n - 1, t3id, t2id, t1id);
	}

}
