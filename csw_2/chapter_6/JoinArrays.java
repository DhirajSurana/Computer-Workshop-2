package chapter_6;

import java.util.ArrayList;
import java.util.Scanner;

public class JoinArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		ArrayList<Double> a=new ArrayList<>();
		ArrayList<Double> b=new ArrayList<>();
		System.out.println("enter the no of elements you want to add in list 1");
		int n=sc.nextInt();
		System.out.println("enter elements into the list");
		for(int i=0;i<n;i++)
		{
			a.add(sc.nextDouble());
		}
		System.out.println(a);
		
		System.out.println("enter the no of elements you want to add in list 2");
		int l=sc.nextInt();
		System.out.println("enter elements into the list");
		for(int i=0;i<l;i++)
		{
			b.add(sc.nextDouble());
		}
		System.out.println(b);
		a.addAll(b);
		System.out.println(a);
		sc.close();
	}

}
