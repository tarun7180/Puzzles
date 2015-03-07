import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;


public class FindDigits {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws NumberFormatException 
	 */
	public static void main(String[] args) throws NumberFormatException, IOException {
		List<Integer> digitList = new ArrayList<Integer>();
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		int inputNum = Integer.parseInt(bufferedReader.readLine());
		int [] inputArr = new int[inputNum]; 
		for(int count=0;count<inputNum;count++){
			inputArr[count] = Integer.parseInt(bufferedReader.readLine());
		}
		
		for(int count=0;count<inputNum;count++){
			int resultCount = 0;
			int testNum = inputArr[count];
			digitList.clear();
			collectDigits(testNum, digitList);
			int listSize = digitList.size();
			for(int listCount=0;listCount<listSize;listCount++){
				if(digitList.get(listCount) == 0){
					continue;
				}else{
					int tempNum = digitList.get(listCount);
					if(testNum%tempNum==0){
						resultCount++;
					}
				}
			}
			System.out.println(resultCount);
		}
	}
	
	private static void collectDigits(int num, List<Integer> digits) {
	    if(num / 10 > 0) {
	        collectDigits(num / 10, digits);
	    }
	    digits.add(num % 10);
	}

}
