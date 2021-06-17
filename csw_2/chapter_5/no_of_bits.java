package chapter_5;
import java.util.Scanner;
public class no_of_bits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		int x;
		System.out.println("Enter a number");
		x= sc.nextInt();
		int count=0;
		while(x!=0)
		{
			count+=x&1;
			x=x>>1;
		}
		System.out.println("no. of bit set to 1 is "+count);
		sc.close();
		
	}

}
