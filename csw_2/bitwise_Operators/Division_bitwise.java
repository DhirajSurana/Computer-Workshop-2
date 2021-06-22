package bitwise_Operators;
import java.util.Scanner;
public class Division_bitwise {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter x");
		int x=sc.nextInt();
		System.out.println("Enter y");
		int y=sc.nextInt();
		while(y==0)
		{
			System.out.println("Invalid sum");
			break;
		}
		int z[]=Divide(x,y);
		System.out.println("division of x and y gives "+z[0]+" as quotient and "+ z[1]+" as remainder");
		sc.close();
	}
	
	public static int[] Divide(int x,int y) {
		int a[]=new int[2];
		a[0]=0;
		int count=0;
		int sign=-1;
		if(x>0&&y>0)
			sign=1;
		while(x>=y)
		{
			x=x-y;
			count+=1;
		}
		a[0]=sign*count;
		a[1]=x;
		return a;
		
	}

}
