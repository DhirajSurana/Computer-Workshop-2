package bitwise_Operators;
import java.util.Scanner;
public class Swap_two_numbers_using_bitwise_operator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc= new Scanner(System.in);
		System.out.println("Enter two no.s 'a' and 'b'");
		int a=sc.nextInt();
		int b=sc.nextInt();
		System.out.println("'a'= "+a+" 'b'= "+b);
		//swaping
		a=a^b;
		b=a^b;
		a=a^b;
		System.out.println("After swap");
		System.out.println("'a'= "+a+" 'b'= "+b);
		sc.close();
	}

}
