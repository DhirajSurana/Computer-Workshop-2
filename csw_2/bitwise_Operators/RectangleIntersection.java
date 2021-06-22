package bitwise_Operators;
import java.util.*;
public class RectangleIntersection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		int rect1[]=new int[6];
		int rect2[]=new int[6];
		System.out.println("Enter the bottom left corner of Rectangle 1");
		rect1[0]=sc.nextInt();
		rect1[1]=sc.nextInt();
		System.out.println("Enter the top right corner of Rectangle 1");
		rect1[2]=sc.nextInt();
		rect1[3]=sc.nextInt();
		System.out.println("Enter the length of Rectangle 1");
		rect1[4]=sc.nextInt();
		System.out.println("Enter the width of Rectangle 1");
		rect1[5]=sc.nextInt();
		System.out.println("Enter the bottom left corner of Rectangle 2");
		rect1[0]=sc.nextInt();
		rect1[1]=sc.nextInt();
		System.out.println("Enter the top right corner of Rectangle 2");
		rect1[2]=sc.nextInt();
		rect1[3]=sc.nextInt();
		System.out.println("Enter the length of Rectangle 2");
		rect1[4]=sc.nextInt();
		System.out.println("Enter the width of Rectangle 2");
		rect1[5]=sc.nextInt();
		int []intersection=Intersection(rect1,rect2);
		System.out.println("Intersection Rectangle of Rectangle 1 and Retangle 2 is");
		for(int i=0;i<6;i++)
		{
			System.out.print(intersection[i]+" ");
		}
		sc.close();
	}
	public static int[] Intersection(int[]rect1,int []rect2)
	{
		int result[]={0,0,-1,-1,0,0} ;
		if(OverlapRectangle(rect1,rect2)==false)
		{
			return result;
		}
		result[0]=Math.max(rect1[0],rect2[0]);
		result[1]=Math.max(rect1[1],rect2[1]);
		result[2]=Math.min(rect1[2],rect2[2]);
		result[3]=Math.min(rect1[3],rect2[3]);
		result[4]=(int)(Math.min(rect1[0]+rect1[4],rect2[0]+rect2[4])-Math.max(rect1[0],rect2[0]));
		result[5]=(int)(Math.min(rect1[2]+rect1[5],rect2[2]+rect2[5])-Math.max(rect1[2],rect2[2]));
		return result;
	}
	public static boolean OverlapRectangle(int[]rect1,int rect2[])
	{
		System.out.println((rect1[0]<=rect2[2]&&rect1[1]<=rect2[3])&&(rect1[2]>=rect2[0]&&rect2[3]>=rect1[2]));
		return (rect1[0]<=rect2[2]&&rect1[1]<=rect2[3])&&(rect1[2]>=rect2[0]&&rect2[3]>=rect1[2]);
	}
	

}
