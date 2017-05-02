import java.util.Scanner;


public class BracketBalance {

	private static int top;
	private static String[] stackArr;
	
	
	
	private static void push(String value) {
		stackArr[top] = value;
		top++;
	}
	
	private static String pop() {
		String tempChar = stackArr[top];
		top--;
		return tempChar;
	}
	
	private static void checkinput(String inputStr) {
		String[] charArr = inputStr.split("");
		boolean flag = true;
		int strLen = charArr.length;
		for(int j=0;j<strLen/2;j++) {
			push(charArr[j]);
		}
		for(int k=strLen/2;k<strLen;k++){
			String popValue = pop();
			if(!popValue.equals(charArr[k])) {
				flag=false;
				System.out.println("No");
				break;
			}
		}
		if(flag) {
			System.out.println("Yes");
		}
		
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int numTest = in.nextInt();
		for(int i=0;i<numTest;i++) {
			String inputStr = in.next();
			checkinput(inputStr);
		}
	}

}
