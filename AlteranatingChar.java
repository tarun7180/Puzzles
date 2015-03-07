import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class AlteranatingChar {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws NumberFormatException 
	 */
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		int inputNum = Integer.parseInt(bufferedReader.readLine());
		String[] inputArr = new String[inputNum];
		for(int count=0;count<inputNum;count++){
			inputArr[count] = bufferedReader.readLine();
		}
		for(int count=0;count<inputNum;count++){
			int deleteCount=0;
			String[] inputArr1 = inputArr[count].split("(?!^)");
			String firstChar = inputArr1[0];
			int inputArrSize = inputArr1.length;
			for(int inCount = 1;inCount<inputArrSize;inCount++){
				if(inputArr1[inCount].equals(firstChar)){
					deleteCount++;
				}
				firstChar = inputArr1[inCount];
			}
			System.out.println(deleteCount);
		}
	}

}
