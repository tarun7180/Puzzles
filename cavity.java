import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;


public class cavity {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		int numCount=0;
		List<String> resultList = new ArrayList<String>();
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		numCount = Integer.parseInt(bufferedReader.readLine());
		for(int count=1;count<=numCount;count++){
			double num = Double.parseDouble(bufferedReader.readLine());
			List<Double> digitList = new ArrayList<Double>();
			collectDigits(num, digitList);
			for(int cavityCount=0;cavityCount<=numCount-2;cavityCount++){
				if(digitList.get(cavityCount+1)<digitList.get(cavityCount)){
					digitList.set(cavityCount, (double) -1);
				}
			}
			StringBuilder stBuilder = new StringBuilder();
			for(int cavityCount=0;cavityCount<numCount;cavityCount++){
				if(digitList.get(cavityCount) == -1){
					stBuilder.append("X");
				}else{
					stBuilder.append(digitList.get(cavityCount));
				}
			}
			String tempStr = stBuilder.toString();
			tempStr.replace("-1", "X");
			resultList.add(tempStr);
		}
		for(int count=0;count<numCount;count++){
			System.out.println(resultList.get(count));
		}
	}
	
	private static void collectDigits(double num, List<Double> digitList) {
	    if(num / 10 > 0) {
	        collectDigits(num / 10, digitList);
	    }
	    digitList.add(num % 10);
	}
}
