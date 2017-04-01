import java.util.Scanner;


public class NewYearChaos {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int numTest = in.nextInt();
		int[] result = new int[numTest];
		for(int i=0;i<numTest;i++){
			int queueLength = in.nextInt();
			int[] arr = new int[queueLength];
 			for(int j=0;j<queueLength;j++){
				arr[j] = in.nextInt();
			}
			result[i] = getResult(arr,queueLength);
		}
		for(int i=0;i<numTest;i++){
			if(result[i] >-1){
				System.out.println(result[i]);
			}else{
				System.out.println("Too chaotic");
			}
		}
	}

	private static int getResult(int[] arr, int queueLength) {
		int sum = 0;
		for(int i=queueLength-1;i>=0;i--){
			if(arr[i]-(i+1)>2){
				return -1;
			}
			for(int j=max(0,arr[i]-2);j<i;j++){
				if(arr[j]>arr[i]) sum++;
			}
		}
		return sum;
	}

	private static int max(int i, int j) {
		if(i>j){
			return i;
		}
		return j;
	}

}
