import java.util.Scanner;

/*
 * Sample Input

saveChangesInTheEditor
Sample Output

5
 */
public class CamelCase {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        String s = in.next();
        int count = 1;
        int strLen = s.length();
        for(int i=1;i<strLen;i++) {
        	int asciiCode = s.charAt(i);
        	if(asciiCode>64 && asciiCode<91) {
        		count++;
        	}
        }
        System.out.println(count);
	}

}
