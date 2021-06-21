package chapter_6;

import java.util.Scanner;

public class Stock2 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no of elements");
		int length = sc.nextInt();
		int price[] = new int[length];
		System.out.println("enter prices");
		for (int i = 0; i < price.length; i++) {
			price[i] = sc.nextInt();
		}
		int n = price.length;
		System.out.println("Maximum Profit = " + maxProfit(price, n));
		sc.close();
	}

	static int maxProfit(int price[], int n) {
		int profit[] = new int[n];
		for (int i = 0; i < n; i++)
			profit[i] = 0;
		int max_price = price[n - 1];
		for (int i = n - 2; i >= 0; i--) {
			if (price[i] > max_price)
				max_price = price[i];
			profit[i] = Math.max(profit[i + 1], max_price - price[i]);
		}
		int min_price = price[0];
		for (int i = 1; i < n; i++) {
			if (price[i] < min_price)
				min_price = price[i];
			profit[i] = Math.max(profit[i - 1], profit[i] + (price[i] - min_price));
		}
		int result = profit[n - 1];
		return result;
	}

}
