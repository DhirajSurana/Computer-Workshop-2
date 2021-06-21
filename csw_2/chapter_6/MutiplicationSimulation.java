package chapter_6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class MutiplicationSimulation {

	// global members to get access of them anywhere in the class
	static ArrayList<Integer> output = new ArrayList<>();
	static ArrayList<Integer> number1 = new ArrayList<>();
	static ArrayList<Integer> number2 = new ArrayList<>();
	static ArrayList<Integer> temp = new ArrayList<>();
	static int count = 0;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number");
		int num1 = sc.nextInt();
		System.out.println("Enter second number");
		int num2 = sc.nextInt();

		// checks the multiplicaton condition, if true carry on or else throws
		// arithmetic exception
		if (checkLength(num1, num2)) {

			// generate arrayLists
			generate(num1, number1);
			generate(num2, number2);

			// calling multiply function for every element of number2
			for (int i = 0; i < number2.size(); i++) {
				multiply(number1, number2.get(i));
			}

			

			Collections.reverse(output);
			System.out.println(output);
			sc.close();
		} else {
			sc.close();
			throw new ArithmeticException("invalid multiplication");
		}
	}

	// function to check length of the numbers
	public static boolean checkLength(int num1, int num2) {
		if (Integer.toString(Math.abs(num1)).length() < Integer.toString(Math.abs(num2)).length()) {
			return false;
		}
		return true;
	}

	// function to generate arraylist
	public static void generate(int num, ArrayList<Integer> list) {
		int temp = Math.abs(num);
		while (temp > 0) {
			list.add(temp % 10);
			temp /= 10;

		}
	}

	// function to check sign of the main product
	public static boolean checkSign(int num1, int num2) {
		int temp = num1 ^ num2;
		if (temp == 0)
			return true;
		return false;
	}

	// function to multiply every digit of number2 with every digit of number 1
	public static void multiply(ArrayList<Integer> list, int n) {

		// temporary arraylist
		ArrayList<Integer> al = new ArrayList<Integer>();
		int product = 0;
		int carry = 0;
		int listIndex = 0;

		// clearing previous elements
		temp.clear();

		// calculating product and carry for each iteration
		while (listIndex < list.size()) {
			product = carry + (int) Math.abs(list.get(listIndex)) * (int) Math.abs(n);
			carry = (product >= 10) ? product / 10 : 0;
			al.add(product % 10);
			listIndex++;
		}
		if (carry != 0) {
			al.add(carry);
		}

		// first time for output
		if (count == 0) {
			output.addAll(al);
		}

		// for temp
		else {
			for (int i = 0; i < count; i++) {
				temp.add(0);
			}
			temp.addAll(al);
			addLists(temp);
		}
		count++;

	}

	// function to add output and temp lists
	public static void addLists(ArrayList<Integer> list) {
		int sum = 0;
		int carry = 0;
		int listIndex = 0;
		int outputIndex = 0;

		// temporary arraylist
		ArrayList<Integer> al = new ArrayList<>();

		// calculating sum and carry for each iteration
		while (listIndex < list.size() || outputIndex < output.size()) {
			sum = carry + ((listIndex < list.size()) ? list.get(listIndex) : 0)
					+ ((outputIndex < output.size()) ? output.get(listIndex) : 0);
			carry = (sum >= 10) ? 1 : 0;
			al.add(sum % 10);
			listIndex++;
			outputIndex++;
		}
		if (carry != 0) {
			al.add(carry);
		}

		// clearing previous elements
		output.clear();

		// adding new elements
		output.addAll(al);
	}
}