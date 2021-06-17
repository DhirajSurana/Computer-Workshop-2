package chapter_6;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayKeyRemove {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no of elements ");
		int length = sc.nextInt();
		ArrayList<Integer> al = new ArrayList<Integer>();
		System.out.println("Enter " + length + " elements");
		for (int i = 0; i < length; i++) {
			al.add(sc.nextInt());
		}
		System.out.println(al);
		System.out.println("Enter the value you want to remove");
		Integer key = sc.nextInt();
		Remove(al, key);
		sc.close();
	}

	public static void Remove(ArrayList<Integer> al, Integer key) {
		while (al.contains(key))
			al.remove(key);
		System.out.println(al);

	}

}
