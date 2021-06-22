package bitwise_Operators;

import java.util.Scanner;

public class Overlap {

	public static void main(String[] args) {
		// x1,y1,x2,y2,length,width

		Scanner sc=new Scanner(System.in);
		int rect1[]=new int[6];
		int rect2[]=new int[6];
		System.out.println("Enter the bottom left corner of Rectangle 1");
		rect1[0]=sc.nextInt();
		rect1[1]=sc.nextInt();
		System.out.println("Enter the top right corner of Rectangle 1");
		rect1[2]=sc.nextInt();
		rect1[3]=sc.nextInt(); 
		rect1[4]=(int)(Math.max(rect1[0], rect1[2])-Math.min(rect1[0], rect1[2]));
		rect1[5]=(int)(Math.max(rect1[1], rect1[3])-Math.min(rect1[1], rect1[3]));
		System.out.println("Enter the bottom left corner of Rectangle 2");
		rect2[0]=sc.nextInt();
		rect2[1]=sc.nextInt();
		System.out.println("Enter the top right corner of Rectangle 2");
		rect2[2]=sc.nextInt();
		rect2[3]=sc.nextInt();
		rect2[4]=(int)(Math.max(rect2[0], rect2[2])-Math.min(rect2[0], rect2[2])); 
		rect2[5]=(int)(Math.max(rect2[1], rect2[3])-Math.min(rect2[1], rect2[3]));
		System.out.println("Are they overlapping? "+(Overlapping(rect1,rect2)?"yes":"no"));
		System.out.println();
		int[] result=Dimension(rect1,rect2);
		for(int i:result)
		{
			System.out.print(i+" ");
		}
		sc.close();
	}
	//function to check whether rectangles overlap or not
	public static boolean Overlapping(int rect1[],int rect2[])
	{
	  return (rect1[0]<=rect2[2]&&rect1[1]<=rect2[3])&&(rect1[2]>=rect2[0]&&rect2[3]>=rect1[2]);
	}
	
	// function to find the intersection rectangle
	public static int[] Dimension(int rect1[],int rect2[])
	{
		int temp[]= {0,0,-1,-1,0,0};
		if(Overlapping(rect1,rect2)==false)
			return temp;
		
		// for loop to get and assign new bottom left corner
		for(int i=0;i<2;i++)
		{
			temp[i]=(int)Math.max(rect1[i],rect2[i]);
		}
		
		// for loop to get and assign new right corner
		for(int i=2;i<4;i++)
		{
			temp[i]=(int)Math.min(rect1[i],rect2[i]);
		}
		
		//to find and assign new length
		temp[4]=(int)(Math.min(rect1[0]+rect1[4],rect2[0]+rect2[4])-Math.max(rect1[0], rect2[0]));
		
		//to find and assign new length
		temp[5]=(int)(Math.min(rect1[1]+rect1[5],rect2[1]+rect2[5])-Math.max(rect1[1], rect2[1]));
		
		//return the array
		return temp;
	}

}
