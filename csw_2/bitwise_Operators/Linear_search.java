package bitwise_Operators;

public class Linear_search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int ar[]={1,2,3,4,5,6};
		int n=5;
		int result=Search(ar,ar.length,n);
		if (result==-1)
			System.out.println("invalid number");
		else
			System.out.println(n+" is at "+(result+1) +" location");
		}

	public static int Search(int ar[],int x,int n) {
		for (int i=0;i<x;i++)
			  if (ar[i]==n)
			    return i;
		return -1;
		}
}
