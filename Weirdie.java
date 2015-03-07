import java.util.ArrayList;
import java.util.List;

	
public class Weirdie {

	private boolean calculate(int[] array) {
	    boolean match = false;
	    List<Integer> list = new ArrayList<Integer>();
	    int length = array.length;
	    for(int i=0;i<length;i++) {
	        for(int j=i+1;j<length;j++) {
	            int sum = array[i] + array[j];
	            if(list.contains(sum)) {
	                match = true;
	                break;
	            } else {
	                list.add(sum);
	            }
	        }
	        if(match) {
	            break;
	        }
	    }
	    return match;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	    // TODO Auto-generated method stub
	    int[] array = { 1,1};
	    int[] array2 = {1,1,1};
	    int[] array3 = { 2,4,2 };
	    Weirdie  w = new Weirdie();
	    System.out.println(w.calculate(array));
	    System.out.println(w.calculate(array2));
	    System.out.println(w.calculate(array3));
	}

}
