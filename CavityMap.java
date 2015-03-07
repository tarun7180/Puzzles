import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class CavityMap {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		int inputNum = Integer.parseInt(bufferedReader.readLine());
		String [] inputLine = new String[inputNum]; 
		for(int count=0;count<inputNum;count++){
			inputLine[count] = bufferedReader.readLine();
		}
		
		System.out.println(inputLine[0]);
		
		for(int count=1;count<inputNum-1;count++){
			String[] inputStr = inputLine[count].split("(?!^)");
			String[] prevStr = inputLine[count-1].split("(?!^)");
			String[] nextStr = inputLine[count+1].split("(?!^)");
			int strSize = inputStr.length;
			for(int ncount = 1;ncount<strSize-1;ncount++){
				int leftNum = Integer.parseInt(inputStr[ncount]);
				int rightNum = Integer.parseInt(inputStr[ncount+1]);
				if(leftNum>rightNum){
					int leftLeft = Integer.parseInt(inputStr[ncount-1]);
					if(leftLeft<leftNum){
						String prevS = prevStr[ncount];
						if(!prevS.equalsIgnoreCase("X")){
							int prevNum = Integer.parseInt(prevStr[ncount]);
							if(leftNum>prevNum){
								int nextNum = Integer.parseInt(nextStr[ncount]);
								if(leftNum>nextNum){
									inputStr[ncount] = "X";
									ncount++;
								}
							}
						}
					}
				}
			}
			for(int countq=0;countq<strSize;countq++){
				System.out.print(inputStr[countq]);
			}
			System.out.println();
		}
		if(inputNum!=1){
			System.out.println(inputLine[inputNum-1]);
		}
	}

}
