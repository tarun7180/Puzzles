import java.util.Scanner;

/**
 * The Class InsertPosLinkList.
 * 
 * Input
 * 5
3 0
5 1
4 2
2 3
10 1

Output: 3-->10-->5-->4-->2-->NULL
 */
public class InsertPosLinkList {

	/** The head. */
	Node head;

	/**
	 * The Class Node.
	 */
	static class Node {
		
		/** The data. */
		int data;
		
		/** The next. */
		Node next;
	}

	/**
	 * Insert at position.
	 *
	 * @param head the head
	 * @param data the data
	 * @param position the position
	 * @return the node
	 */
	public static Node InsertAtPosition(Node head, int data, int position) {
		Node newNode = new Node();
		newNode.data = data;
		newNode.next = null;
		if (head == null) {
			head = newNode;
		} else if(position == 0) {
			newNode.next = head;
			head = newNode;
		}
		else {

			Node temp = head;
			int count = 0;

			while (count < position-1 && temp.next != null) {
				temp = temp.next;
				count++;
			}

			if(temp.next != null) {
				newNode.next = temp.next;
			}
			temp.next = newNode;
		}
		return head;
	}

	/**
	 * Prints the list.
	 *
	 * @param head the head
	 */
	public static void printList(Node head) {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.data + "-->");
			temp = temp.next;
		}
		System.out.print("NULL");
	}

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		InsertPosLinkList lList = new InsertPosLinkList();
		Scanner in = new Scanner(System.in);
		int numCases = in.nextInt();
		for (int testCount = 1; testCount <= numCases; testCount++) {
			int data = in.nextInt();
			int position = in.nextInt();
			lList.head = InsertAtPosition(lList.head, data, position);
		}

		printList(lList.head);
	}

}
