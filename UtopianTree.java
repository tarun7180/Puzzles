import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class UtopianTree {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws NumberFormatException 
	 */
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		int inputNum = Integer.parseInt(bufferedReader.readLine());
		int [] inputArr = new int[inputNum]; 
		for(int count=0;count<inputNum;count++){
			inputArr[count] = Integer.parseInt(bufferedReader.readLine());
		}
		
		for(int htCount=0;htCount<inputNum;htCount++){
			int heightNum = 1;
			if(inputArr[htCount]!=0){
				for(int nCount=1;nCount<=inputArr[htCount];nCount++){
					if(nCount%2==1){
						heightNum = heightNum*2;
					}else{
						heightNum++;
					}
				}
			}
			System.out.println(heightNum);
		}

	}

}
