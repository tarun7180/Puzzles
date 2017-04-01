import java.util.Scanner;


public class Arrays1 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int inputSize = in.nextInt();
		int[] inputArr = new int[inputSize];
		for(int i=0;i<inputSize;i++) {
			inputArr[i] = in.nextInt();
		}
		for(int j=inputSize-1;j>=0;j--) {
			System.out.print(inputArr[j] + " ");
		}
	}

}
