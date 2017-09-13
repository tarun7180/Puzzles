import java.util.Scanner;
import java.util.Stack;


public class BalanceBrackets {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            String s = in.next();
            String result = isBalanced(s);
            System.out.println(result);
        }
        in.close();
    }
    
    static String isBalanced(String s) {
    	if(s.length() % 2 != 0) {
            return "NO";
        }
    	Stack<Character> charStack = new Stack<Character>();
    	for(int i=0;i<s.length();i++) {
    		char temp = s.charAt(i);
    		if(temp=='[' || temp=='{' || temp=='(') {
    			charStack.add(temp);
    		} else {
    			if(!charStack.isEmpty()) {
    				char stackTemp = charStack.pop();
    				if((temp==']' && stackTemp=='[') || (temp=='}' && stackTemp=='{') || (temp==')' && stackTemp=='(')) {
    					continue;
    				} else {
    					return "NO";
    				}
    			} else {
    				return "NO";
    			}
    		}
    	}
    	
    	if(charStack.isEmpty()) {
    		charStack.clear();
    		return "YES";
    	} else {
    		charStack.clear();
    		return "NO";
    	}
    }
}
