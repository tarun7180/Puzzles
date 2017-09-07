import java.util.Scanner;

/**
 * 
 * @author TarunJain
 *
 *Sample Input

5 4
1 2 3 4 5
Sample Output

5 1 2 3 4
Explanation

When we perform  left rotations, the array undergoes the following sequence of changes:

Thus, we print the array's final state as a single line of space-separated values, which is 5 1 2 3 4.
 */
public class LeftRotation {

	 static int[] leftRotation(int[] a, int d) {
	        // Complete this function
		 for(int i=1;i<=d;i++) {
			 int temp = a[0];
			 for(int j=1;j<a.length;j++) {
				 a[j-1] = a[j];
			 }
			 a[a.length-1] = temp;
		 }
		 return a;
	    }

	    public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        int n = in.nextInt();
	        int d = in.nextInt();
	        int[] a = new int[n];
	        for(int a_i = 0; a_i < n; a_i++){
	            a[a_i] = in.nextInt();
	        }
	        int[] result = leftRotation(a, d);
	        for (int i = 0; i < result.length; i++) {
	            System.out.print(result[i] + (i != result.length - 1 ? " " : ""));
	        }
	        System.out.println("");


	        in.close();
	    }
}
