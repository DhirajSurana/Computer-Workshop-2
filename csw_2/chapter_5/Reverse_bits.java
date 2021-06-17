package chapter_5;
import java.util.Scanner;

public class Reverse_bits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a no.");
		int x=sc.nextInt();
		System.out.println(Integer.toBinaryString(x));
		int r=0;
		while(x>0)
		{   r<<=1;
			if((x&1)==1)
				r=r^1;
			x=x>>>1;
			
		}
		System.out.println(Integer.toBinaryString(r));
		sc.close();
	}

}
