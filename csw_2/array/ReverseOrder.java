package array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ReverseOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		ArrayList<Double> a=new ArrayList<>();
		System.out.println("enter elements into the list");
		for(int i=0;i<5;i++)
		{
			a.add(sc.nextDouble());
		}
		System.out.println(a);
		Collections.reverse(a);
		System.out.println(a);
		sc.close();
	}

}
