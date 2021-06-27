package linked_List;

import java.util.Stack;

class Node2 {
	int data;
	Node2 ptr;

	Node2(int d) {
		ptr = null;
		data = d;
	}
}

class IsPlaindrome {
	public static void main(String args[]) {
		Node2 one = new Node2(1);
		Node2 two = new Node2(2);
		Node2 three = new Node2(3);
		Node2 four = new Node2(4);
		Node2 five = new Node2(3);
		Node2 six = new Node2(2);
		Node2 seven = new Node2(1);
		one.ptr = two;
		two.ptr = three;
		three.ptr = four;
		four.ptr = five;
		five.ptr = six;
		six.ptr = seven;
		boolean condition = isPalindrome(one);
		System.out.println("isPalidrome :" + condition);
	}

	static boolean isPalindrome(Node2 head) {

		Node2 slow = head;
		boolean ispalin = true;
		Stack<Integer> stack = new Stack<Integer>();

		while (slow != null) {
			stack.push(slow.data);
			slow = slow.ptr;
		}

		while (head != null) {

			int i = stack.pop();
			if (head.data == i) {
				ispalin = true;
			} else {
				ispalin = false;
				break;
			}
			head = head.ptr;
		}
		return ispalin;
	}
}
