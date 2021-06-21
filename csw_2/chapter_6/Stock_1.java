package chapter_6;

import java.util.Scanner;

public class Stock_1 {

	// 310 315 275 295 260 270 290 230 255 250
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no. of days");
		int length = sc.nextInt();
		int price[] = new int[length];
		System.out.println("Enter stock value");
		for (int i = 0; i < length; i++) {
			price[i] = sc.nextInt();
		}
		System.out.println();
		int[] output = buyAndSell(price);
		System.out.println(
				"** buy on " + output[0] + " day ** Sell on " + output[1] + " day ** profit " + output[2] + " ** ");
		sc.close();

	}

	public static int[] buyAndSell(int[] price) {
		// TODO Auto-generated method stub
		if (price.length == 0) {
			return new int[] {};
		}
		int lastBuyDate = 1;
		int buyDate = 1;
		int sellDate = 1;
		int minPrice = price[0];
		int maxProfit = 0;
		for (int i = 1; i < price.length; i++) {
			if (price[i] < minPrice) {
				minPrice = price[i];
				lastBuyDate = buyDate;
				buyDate = i + 1;
			}

			if (maxProfit < price[i] - minPrice) {
				maxProfit = price[i] - minPrice;
				sellDate = i + 1;
			}
		}
		if (buyDate > sellDate) {
			buyDate = lastBuyDate;
		}
		return new int[] { buyDate, sellDate, maxProfit };
	}

}
