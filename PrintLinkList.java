
public class PrintLinkList {

	Node head;
	static class Node {
		int data;
		Node nextNode;
		Node(int data) {
			this.data = data;
			this.nextNode = null;
		}
	}
	public static void main(String[] args) {
		PrintLinkList lList = new PrintLinkList();
		lList.head = new Node(1);
		Node second = new Node(2);
		Node  third = new Node(3);
		lList.head.nextNode = second;
		second.nextNode = third;
		Print(lList.head);
	}
	private static void Print(Node head) {
		if(head != null) {
			Node next = head;
			while(next != null) {
				System.out.println(next.data);
				next = next.nextNode;
			}
		}
		
	}

}
