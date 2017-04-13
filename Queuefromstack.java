import java.util.Scanner;


public class Queuefromstack {
	
	private int top1;
	private int top2;
	private int[] stack1;
	private int [] stack2;
	
	public Queuefromstack(int size) {
		stack1 = new int[size];
		stack2 = new int[size];
		top1=-1;
		top2=-1;
	}
	
	private void enqueue(int nextInt) {
		if(top1<0 && top2<0) {
			stack1[++top1] = nextInt;
		} else if(top1<0 && top2>-1) {
			stack2[++top2] = nextInt;
		} else if(top2<0 && top1>-1) {
			stack1[++top1] = nextInt;
		} 
	}
	
	private int dequeue() {
		if(top1<0 && top2<0){
			return -1;
		} else if(top1>-1) {
			for(int i=1;i<=top1;i++) {
				stack2[i-1] = stack1[i];
			}
			int result = stack1[0];
			top2=top1-1;
			top1=-1;
			return result;
		} else if(top2>-1) {
			for(int i=1;i<=top2;i++) {
				stack1[i-1] = stack2[i];
			}
			int result = stack2[0];
			top1=top2-1;
			top2=-1;
			return result;
		}
		return  -1;
	}
	
	private int head() {
		if(top1>=0) {
			return stack1[0];
		} else {
			return stack2[0];
		}
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int numTest = in.nextInt();
		Queuefromstack queue = new Queuefromstack(numTest);
		for(int i=0;i<numTest;i++) {
			int nextVal = in.nextInt();
			if(nextVal==1) {
				queue.enqueue(in.nextInt());
			} else if(nextVal == 2) {
				queue.dequeue();
			} else if(nextVal == 3) {
				System.out.println(queue.head());
			}
		}
	}

}
