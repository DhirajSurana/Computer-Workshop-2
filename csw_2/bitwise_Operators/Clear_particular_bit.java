package bitwise_Operators;
import java.util.Scanner;
public class Clear_particular_bit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		int x=0b00001001;
		System.out.println("001001");
		System.out.println("enter the position you want to change (0 to 1)");
		int y=sc.nextInt();
		int mask=1<<(y-1);
		x=x|mask;
		System.out.println(Integer.toBinaryString(x));
		sc.close();
	}

}
