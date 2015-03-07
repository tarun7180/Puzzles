import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class MaxSubArray {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws NumberFormatException 
	 */
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		int testCaseNum = Integer.parseInt(bufferedReader.readLine());
		for(int count=0;count<testCaseNum;count++){
			int totalNum = Integer.parseInt(bufferedReader.readLine());
			String intputStr = bufferedReader.readLine();
			String[] inputValues = intputStr.split(" ");
			long[] inputIntVal = new long[totalNum];
			long bestSum=0;
			long currentSum=0;
			int currentindex=0;
			long maxSum = 0;
			int bestStartIndex=0;
			int bestEndIndex=0;
			for(int m=0;m<totalNum;m++){
				inputIntVal[m] = Integer.parseInt(inputValues[m]);
			}
			for(int n=0;n<totalNum;n++){
				if(inputIntVal[n] > 0){
					bestSum = bestSum + inputIntVal[n];
				}	
				long val = currentSum + inputIntVal[n];
				if(val>0){
					if(currentSum == 0){
							currentindex = n;
					}
					currentSum = val;
				}else{
					currentSum=0;
				}
				if(currentSum>maxSum){
					maxSum = currentSum;
					bestStartIndex = currentindex;
					bestEndIndex = n;
				}
			}
			if(maxSum == 0){
				long tempMax = inputIntVal[0];
				for(int i=1;i<totalNum;i++){
					if(tempMax<inputIntVal[i]){
						tempMax = inputIntVal[i];
					}
				}
				maxSum=tempMax;
			}
			for(int p=0;p<totalNum;p++){
				if(inputIntVal[p]>maxSum){
					maxSum = inputIntVal[p];
				}
			}
			if(bestSum==0){
				bestSum = maxSum;
			}
			System.out.println(maxSum + " " +bestSum);
		}

	}

}
