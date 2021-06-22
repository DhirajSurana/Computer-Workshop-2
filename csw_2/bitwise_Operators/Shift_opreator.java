package bitwise_Operators;
//right shift n is equivalent to divide by 2^n
// right shift is of two types 
// 1)signed(>>) 2) unsigned(>>>) is not valid for negative values
//left shift n is equivalent to multiply by 2^n
public class Shift_opreator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=8;//1000
		int b=-10;//-1010
		System.out.println("a>>2 "+(a>>2));//0010
		System.out.println("a>>>2 "+(a>>>2));//0010
		System.out.println("a<<1 "+(a<<1));//0001 0000
		System.out.println("a<<2 "+(a<<2));//0010 0000
		System.out.println("b>>1 "+(b>>1));//-1011
		System.out.println("b>>>1 "+(b>>>1));//garbage value
		System.out.println("b<<1 "+(b<<1));//-0001 0100
		System.out.println("b<<2 "+(b<<2));//-0010 1000
	}

}
