import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class IceCreamParlor {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws NumberFormatException 
	 */
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		int testCaseNum = Integer.parseInt(bufferedReader.readLine());
		for(int count=0;count<testCaseNum;count++){
			int amountNum = Integer.parseInt(bufferedReader.readLine());
			int totalNum = Integer.parseInt(bufferedReader.readLine());
			String intputStr = bufferedReader.readLine();
			String[] inputValues = intputStr.split(" ");
			
			for(int m=0;m<totalNum;m++){
				int tempNUm = Integer.parseInt(inputValues[m]);
				if(tempNUm>amountNum){
					continue;
				}else{
					for(int n=m+1;n<totalNum;n++){
						int tempSum = 0;
						int tempNum2 = Integer.parseInt(inputValues[n]);
						tempSum = tempNUm + tempNum2;
						if(tempSum == amountNum){
							System.out.println(++m + " "+ ++n);
							break;
						}
					}
				}
			}
		}
	}

}
