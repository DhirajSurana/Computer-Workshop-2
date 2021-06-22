package array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class PrecisonInteger {
	// to simulate addition using ArrayList

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no. of length of the number you want to enter");
		int length = sc.nextInt();
		ArrayList<Integer> input = new ArrayList<Integer>();

		// taking input
		System.out.println("Enter digit.");
		for (int i = 0; i < length; i++) {
			input.add(sc.nextInt());
		}

		// printing input
		System.out.println(input);

		// calling increment function
		ArrayList<Integer> output = incermentByOne(input);

		// printing output
		System.out.println(output);
		sc.close();

	}

	public static ArrayList<Integer> incermentByOne(ArrayList<Integer> input) {

		// counter variables
		int sum = 0;
		int carry = 0;

		int firstElement = input.size() - 1;
		ArrayList<Integer> output = new ArrayList<Integer>();
		for (int i = input.size() - 1; i >= 0; i--) {

			// check for first element
			if (i == firstElement) {
				sum = carry + input.get(i) + 1;
				carry = (sum >= 10) ? 1 : 0;
				sum = (sum >= 10) ? 0 : sum % 10;
				output.add(sum);

			}

			// check for other elements
			else {
				sum = carry + input.get(i);
				carry = (sum >= 10) ? 1 : 0;
				sum = (sum >= 10) ? 0 : sum % 10;
				output.add(sum);
			}
		}
		if (carry == 1) {
			output.add(1);
		}

		// reverse ArrayList
		Collections.reverse(output);
		return output;

	}

}
