
public class TreePeorder {

	Node head;
	public static void main(String[] args) {
		TreePeorder tree = new TreePeorder();
		tree.head = new Node(10);
		tree.insert(tree.head, 9);
		tree.insert(tree.head, 8);
		tree.insert(tree.head, 7);
		tree.insert(tree.head, 11);
		tree.insert(tree.head, 12);
		tree.printPreOrder(tree.head);
	}

	static class Node {
		public int data;
		public Node left,right;
		public Node(int data) {
			this.data = data;
			left=right=null;
		}
	}
	
	public Node insert(Node head, int data) {
		Node newNode = new Node(data);
		if(head == null) {
			head = newNode;
			return head;
		} 
		if(data > head.data) {
			head.right = insert(head.right, data);
		} else {
			head.left = insert(head.left, data);
		}
		return head;
	}
	
	public void printPreOrder(Node head) {
		if(head == null) {
			return;
		}
		System.out.println(head.data);
		printPreOrder(head.left);
		printPreOrder(head.right);
	}
}
