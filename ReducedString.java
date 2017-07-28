import java.util.Scanner;
/*
 * Sample Input 0

aaabccddd
Sample Output 0

abd

Sample Input 1

baab
Sample Output 1

Empty String

Sample Input 2

aa
Sample Output 2

Empty String
 */

public class ReducedString {

	/*static String super_reduced_string(String s){
		boolean[] flagArr = new boolean[122];
		int sLength = s.length();
		StringBuilder resultStr = new StringBuilder();
		for(int i=0;i<sLength;i++) {
			char tempChar = s.charAt(i);
			int tempVal = (int) tempChar;
			if(!flagArr[tempVal]) {
				flagArr[tempVal] = true;
				resultStr.append(tempChar);
			} 
		}
        return resultStr.toString();
    }*/
	
	static String super_reduced_string(String s){
		for(int i=1;i<s.length();i++) {
			char tempChar = s.charAt(i);
			if(tempChar == s.charAt(i-1)) {
				s = s.substring(0, i-1) + s.substring(i+1);
				i=0;
			}
		}
        return s;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String result = super_reduced_string(s);
        if(!result.isEmpty()) {
        	System.out.println(result);
        } else {
        	System.out.println("Empty String");
        }
    }
}
