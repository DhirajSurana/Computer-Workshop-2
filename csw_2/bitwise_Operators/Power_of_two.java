package bitwise_Operators;
import java.util.Scanner;
public class Power_of_two {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a no.");
		int x=sc.nextInt();
		int y=x;
		int count=0;
		while(x!=0)
		{
			count+=x&1;
			x=x>>1;
		}
		if (count==1)
			System.out.println(y+" is a power of two");
		else
			System.out.println(y+" is not a power of two");
		sc.close();
		
	}

}
