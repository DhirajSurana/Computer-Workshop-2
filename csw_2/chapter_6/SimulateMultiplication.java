package chapter_6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SimulateMultiplication {

	public static int step = 0;

	public static ArrayList<Integer> output = new ArrayList<>();
	public static ArrayList<Integer> temp = new ArrayList<>();

	public static ArrayList<Integer> number1 = new ArrayList<>();
	public static ArrayList<Integer> number2 = new ArrayList<>();

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number");
		int num1 = sc.nextInt();
		System.out.println("Enter second number");
		int num2 = sc.nextInt();
		generate(num1, number1);
		generate(num2, number2);

		for (int i = 0; i < number2.size(); i++) {
			mutliply(number1, number2.get(i));
		}
		Collections.reverse(output);
		System.out.println(output);
		sc.close();

	}

	// function to generate arrayLists
	public static void generate(int num, ArrayList<Integer> list) {

		int tempnumber = num;
		while (tempnumber != 0) {
			list.add(tempnumber % 10);
			tempnumber /= 10;
		}
		System.out.println(list);

	}

	// function to multiply each number of number1 with each number of number2
	public static void mutliply(ArrayList<Integer> inputList, int n) {
		int product = 0;
		int carry = 0;
		int index = 0;

		temp.clear();
		for (int i = 0; i < step; i++) {
			temp.add(0);
		}

		while (index < inputList.size()) {
			product = carry + (int) (Math.abs(inputList.get(index))) * n;

			carry = (product >= 10) ? product % 100 : 0;
			System.out.println("carry:" + carry);
			product = product % 10;
			if (step == 0) {
				output.add(product);
			} else {
				temp.add(product);
			}
			index++;
		}
		if (carry != 0) {
			temp.add(carry);
		}
		System.out.println("templist:" + temp);
		addLists(temp);
		System.out.println("step:" + step);
		step++;
	}

	// function to add temp and output and assign to output
	public static void addLists(ArrayList<Integer> temp) {

		int carry = 0;
		int sum = 0;
		int tempIndex = 0;
		int outputIndex = 0;
		ArrayList<Integer> al = new ArrayList<Integer>();
		while (tempIndex < temp.size() || outputIndex < output.size()) {

			sum = carry + (tempIndex < temp.size() ? temp.get(tempIndex) : 0)
					+ (outputIndex < output.size() ? output.get(tempIndex) : 0);
			carry = (sum >= 10) ? sum % 100 : 0;
			sum = (sum >= 10) ? 0 : sum % 10;
			al.add(sum);
			outputIndex++;
			tempIndex++;

		}
		if (carry != 0) {
			al.add(carry);
		}
		output = al;
		System.out.println("output list:" + output);
	}

}
