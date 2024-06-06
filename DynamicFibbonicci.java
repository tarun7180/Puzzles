import java.util.HashMap;
import java.util.Map;

public class DynamicFibbonicci {

	public static void main(String[] args) {
		Map<Integer, Integer> memMap = new HashMap<>();
		int result = fib(500, memMap);
		System.out.println(result);
	}
	
	private static int fib(int n, Map<Integer, Integer> memMap) {
		if(n==0 || n==1) {
			return n;
		}
		
		if(memMap.containsKey(n)) {
			return memMap.get(n);
		}
		
		int value = fib(n-1, memMap) + fib(n-2, memMap);
		memMap.put(n, value);
		return value;
	}

}
