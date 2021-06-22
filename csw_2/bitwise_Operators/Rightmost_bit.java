package bitwise_Operators;
import java.util.Scanner;
public class Rightmost_bit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a no.");
		int x=sc.nextInt();
		x=x&(x-1);
		System.out.println(x);	
		sc.close();
	}

}
