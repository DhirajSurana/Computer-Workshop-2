package bitwise_Operators;
import java.util.Scanner;
public class Check_sign {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		int x ,y;
		System.out.println("Enter two no.s ");
		x=sc.nextInt();
		y=sc.nextInt();
		if((x^y)<0)
			System.out.println("they are of different sign");
		else
			System.out.println("they are of same sign");
		sc.close();
	}

}
