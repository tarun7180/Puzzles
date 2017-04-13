import java.util.Scanner;


public class stackmax {

	private int top;
	private int[] stackArr;
	private int maxVal=0;
	public stackmax(int arrSize) {
		top=0;
		stackArr = new int[arrSize];
	}
	
	public void push(int x) {
		if(maxVal<x) {
			maxVal = x;
		}
		stackArr[top++] = x;
	}

	public int pop() {
		int x = stackArr[--top];
		if(maxVal == x) {
			maxVal = 0;
			for(int i=0;i<top;i++) {
				if(maxVal<stackArr[i]) {
					maxVal = stackArr[i];
				}
			}
		}
		return x;
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int numTest = in.nextInt();
		stackmax stack = new stackmax(numTest);
		for(int count=1;count<=numTest;count++) {
			int val = in.nextInt();
			if(val==1) {
				int pushVal = in.nextInt();
				stack.push(pushVal);
			} else if(val==2) {
				stack.pop();
			} else if(val==3) {
				System.out.println(stack.maxVal);
			}
		}

	}

}
