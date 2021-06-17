package extra;

public class BinaryTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

class Node {
	Node left;
	Node right;
	int data;

	Node(int data) {
		this.data = data;
	}

	public boolean insert(int value) {
		if (value >= data) {
			if (left == null) {
				left = new Node(value);
				return true;
			} else {
				left.insert(value);
			}
		} else {
			if (right == null) {
				right = new Node(value);
				return true;
			} else {
				right.insert(value);
			}
		}
		return false;

	}

	public boolean contains(int value) {
		if (data == value) {
			return true;
		} else if (value < data) {
			if (left == null) {
				return false;
			} else {
				left.contains(value);
			}
		} else {
			if (right == null) {
				return false;
			} else {
				right.contains(value);
			}
		}
		return false;

	}
}
