package bitwise_Operators;

import java.util.Scanner;

public class Rectangle {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// input rectangle 1
		System.out.println("Enter the point of rectangle 1");
		double x1 = sc.nextDouble();
		double y1 = sc.nextDouble();
		System.out.println("Enter length and width of rectangle 1");
		double l1 = sc.nextDouble();
		double w1 = sc.nextDouble();

		// rectangle 1 object
		Rect r1 = new Rect(x1, y1, l1, w1);

		// input rectangle 2
		System.out.println("Enter the point of rectangle 2");
		double x2 = sc.nextDouble();
		double y2 = sc.nextDouble();
		System.out.println("Enter length and width of rectangle 2");
		double l2 = sc.nextDouble();
		double w2 = sc.nextDouble();

		// rectangle 2 object
		Rect r2 = new Rect(x2, y2, l2, w2);

		// function call to find new rectangle if they don't intersect then retrun null
		Rect r3 = intersectRectangle(r1, r2);

		// print new rectangle
		System.out.println(r3);
		sc.close();

	}

	public static Rect intersectRectangle(Rect r1, Rect r2) {
		Rect left;
		Rect right;
		Rect upper;
		Rect lower;
		double overlapwidth;
		double overlaplength;
		double overlapX;
		double overlapY;

		// to find which rectangle is in the left and right
		if (r1.x <= r2.x) {
			left = r1;
			right = r2;
		} else {
			left = r2;
			right = r1;
		}
		// to find which rectangle is in the left and right
		if (r1.y <= r2.y) {
			upper = r1;
			lower = r2;
		} else {
			upper = r2;
			lower = r1;
		}
		// calculate overlap width
		if (left.x + left.width < right.x) {
			// no overlap
			return null;
		} else if (left.x + left.width >= right.x + right.width) {
			// fully overlap
			overlapwidth = right.width;
		} else {
			// partially overlap
			overlapwidth = left.x + left.width - right.x;
		}

		// calculate overlap length
		if (upper.y + upper.length < lower.y) {
			// no overlap
			return null;
		} else if (upper.y + upper.length >= lower.y + lower.length) {
			// fully overlap
			overlaplength = lower.length;
		} else {
			// partially overlap
			overlaplength = upper.y + upper.length - lower.y;
		}

		// calculate overlapX
		overlapX = right.x;

		// calculate overlapX
		overlapY = lower.y;
		return new Rect(overlapX, overlapY, overlaplength, overlapwidth);
	}
}

//class to reduce code
class Rect {
	public double right;
	double x;
	double y;
	double length;
	double width;

	Rect(double x, double y, double length, double width) {
		this.x = x;
		this.y = y;
		this.length = length;
		this.width = width;
	}

	public String toString() {
		return "x:" + this.x + " " + "y: " + this.y + " " + "length: " + this.length + " " + "width: " + this.width;
	}

}
