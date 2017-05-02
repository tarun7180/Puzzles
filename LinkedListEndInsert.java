



public class LinkedListEndInsert {

	Node head;
	static class Node {
		int data;
		Node next;
	}
	
	public static Node addNode(Node head, int data) {
		Node newNode = new Node();
		newNode.data = data;
		newNode.next = null;
		if(head.next == null) {
			head.next = newNode;
		} else {
			Node next1 = head;
			Node prevNode = next1;
			while(next1!=null) {
				prevNode = next1;
				next1 = next1.next;
			} 
			prevNode.next = newNode;
		}
		return  head;
	}
	public static void Print(Node head) {
		if(head != null) {
			Node next = head;
			while(next != null) {
				System.out.print(next.data);
				next = next.next;
			}
		}
		
	}
	
	public static void main(String[] args) {
		LinkedListEndInsert list = new LinkedListEndInsert();
		list.head = new Node();
		Node n1 = addNode(list.head, 2);
		Print(list.head);
		System.out.println(">>>>>>");
		Node n2 = addNode(list.head, 3);
		Print(list.head);
	}

}
