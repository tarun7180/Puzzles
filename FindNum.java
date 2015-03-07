import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class FindNum {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws NumberFormatException 
	 */
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		int findNum = Integer.parseInt(bufferedReader.readLine());
		int totalNum = Integer.parseInt(bufferedReader.readLine());
		String intputStr = bufferedReader.readLine();
		
		String[] inputValues = intputStr.split(" ");
		
		for(int count=0;count<totalNum;count++){
			int tempNUm = Integer.parseInt(inputValues[count]);
			if(tempNUm == findNum){
				System.out.println(count);
			}else if(findNum<tempNUm){
				break;
			}else {
				continue;
			}
		}

	}

}
