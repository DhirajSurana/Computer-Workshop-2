package array;

import java.util.Scanner;

public class Stock_2 {
	// input 12 11 13 9 12 8 14 13 15

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no of days");
		int length = sc.nextInt();
		System.out.println("Enter stock values");
		int price[] = new int[length];
		for (int i = 0; i < length; i++) {
			price[i] = sc.nextInt();
		}
		// int output = maxProfit(price);
		int output = stock1(price);
		System.out.println("Max Profit:" + output);
		sc.close();
	}

	public static int maxProfit(int[] price) {
		int minSoFar = price[0];
		int Profit[] = new int[price.length];
		Profit[0] = 0;
		int maximumProfit = 0;
		for (int i = 1; i < price.length; i++) {
			if (price[i] < minSoFar) {
				minSoFar = price[i];
			}
			maximumProfit = Math.max(maximumProfit, price[i] - minSoFar);
			Profit[i] = maximumProfit;
			System.out.println("maximumProfit:" + maximumProfit + " price[i]:" + price[i] + " minSoFar:" + minSoFar);
		}
		System.out.println("--------------------------");
		int maxSoFar = price[price.length - 1];
		for (int j = price.length - 2; j >= 0; j--) {
			if (price[j] > maxSoFar) {
				maxSoFar = price[j];
			}
			maximumProfit = Math.max(maximumProfit, (maxSoFar - price[j]) + Profit[j]);
			System.out.println("maximumProfit:" + maximumProfit + " price[i]:" + price[j] + " minSoFar:" + maxSoFar);
		}
		return maximumProfit;
	}

	public static int stock(int[] price) {
		int minSoFar = price[0];
		int maximumProfit = 0;
		for (int i = 0; i < price.length / 2; i++) {
			if (price[i] < minSoFar) {
				minSoFar = price[i];
			}
			maximumProfit = Math.max(maximumProfit, price[i] - minSoFar);
		}
		int tempProfit = maximumProfit;
		System.out.println("tempProfit: " + tempProfit);
		minSoFar = price[price.length / 2];
		for (int i = price.length / 2 + 1; i < price.length; i++) {
			if (price[i] < minSoFar) {
				minSoFar = price[i];
			}
			maximumProfit = Math.max(maximumProfit, price[i] - minSoFar);
		}
		return maximumProfit;
	}

	public static int stock1(int[] price) {
		int profit = 0;
		int lastProfit = 0;
		for (int i = 1; i < price.length - 1; i++) {
			if (price[i] < price[i + 1]) {
				profit = price[i + 1] - price[i];
				if (profit > lastProfit)
					lastProfit = profit;
			}
		}
		return profit + lastProfit;
	}
}
