import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class SummOfArray {

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
			int maxIndex = 0;
			long maxSum = 0;
			for(int m=0;m<totalNum;m++){
				inputIntVal[m] = Integer.parseInt(inputValues[m]);
			}
			for(int n=0;n<totalNum;n++){
				bestSum = bestSum + inputIntVal[n];
			}
			System.out.println(maxSum + " " +bestSum);
		}

	}

}
