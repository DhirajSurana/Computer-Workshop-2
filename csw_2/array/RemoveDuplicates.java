package array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;

public class RemoveDuplicates {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> al = new ArrayList<>();
		System.out.println("Enter the length of the array");
		int length = sc.nextInt();
		System.out.println("enter" + length + " elements");
		for (int i = 0; i < length; i++) {
			al.add(sc.nextInt());
		}
		System.out.println(al);
		Collections.sort(al);
		ArrayList<Integer> result = Remove(al);
		System.out.println(result);
		hash(al);
		sc.close();

	}

	public static void hash(ArrayList<Integer> al) {
		HashSet<Integer> hashset = new HashSet<Integer>(al);
		System.out.println(hashset);
	}

	public static ArrayList<Integer> Remove(ArrayList<Integer> al) {
		ArrayList<Integer> result = new ArrayList<>();
		for (int i = 0; i < al.size(); i++) {
			if (result.contains(al.get(i)) == false) {
				result.add(al.get(i));
			}
		}
		return result;
	}

}
