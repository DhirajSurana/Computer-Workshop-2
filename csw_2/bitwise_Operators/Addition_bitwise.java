package bitwise_Operators;
import java.util.Scanner;
public class Addition_bitwise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println(" Enter two no.s");
		int x=sc.nextInt();
		int y=sc.nextInt();
		System.out.println(Add(x,y));
		sc.close();

	}
	public static int Add(int x,int y)
	{
		
		while(y!=0) {
			int carry=x&y;
			x=x^y;
			y=carry<<1;
		}
		return x;
	}

}
