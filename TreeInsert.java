
public class TreeInsert {

	public static void main(String[] args) {
		TreeInsert tree = new  TreeInsert();
		Node head = new Node(5);
		tree.head = head;
		insertdata(tree.head, 3);
		insertdata(tree.head, 8);
	}
	
	Node head;
	static class Node {
		int key;
		Node left, right;
		
		public Node(int key) {
			this.key = key;
			left = right = null;
		}
	}

	public static Node insertdata(Node root,int value) {
		if(root == null) {
			root = new Node(value);
			return root;
		}
		
		if(value<root.key) {
			root.left = insertdata(root.left, value);
		} else {
			root.right = insertdata(root.right, value);
		}
		return root;
	}
}
