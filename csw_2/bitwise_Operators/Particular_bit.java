package bitwise_Operators;
import java.util.Scanner;
public class Particular_bit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a no.");
		int y=sc.nextInt();
		System.out.println(Integer.toBinaryString(y));
		System.out.println("enter the bit no. you want to change. (0-32)");
		int x=sc.nextInt();	
		int bitmask=1<<(x-1);
		y=y^bitmask;
		System.out.println(Integer.toBinaryString(y));
		sc.close();
		
	}
	

}
