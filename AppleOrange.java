import java.util.Scanner;

/*sample input
 * 7 11
5 15
3 2
-2 2 1
5 -6

sample output
1
1
 */

public class AppleOrange {

	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int t = in.nextInt();
        int a = in.nextInt();
        int b = in.nextInt();
        int m = in.nextInt();
        int n = in.nextInt();
        int[] apple = new int[m];
        for(int apple_i=0; apple_i < m; apple_i++){
            apple[apple_i] = in.nextInt();
        }
        int[] orange = new int[n];
        for(int orange_i=0; orange_i < n; orange_i++){
            orange[orange_i] = in.nextInt();
        }
        
        int appleCount = 0,orangeCount = 0;
        
        for(int apple_i=0; apple_i < m; apple_i++){
            int tempVar = a + apple[apple_i];
            if(tempVar >= s && tempVar <= t) {
            	appleCount++;
            }
        }
        
        for(int orange_i=0; orange_i < n; orange_i++){
        	int tempVar = b + orange[orange_i];
            if(tempVar >= s && tempVar <= t) {
            	orangeCount++;
            }
        }
        
        System.out.println(appleCount);
        System.out.println(orangeCount);
    }
}
