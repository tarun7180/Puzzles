import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.xml.sax.InputSource;


public class KDifference {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws NumberFormatException 
	 */
	public static void main(String[] args) throws NumberFormatException, IOException {
		int numCount=0;
		int diffNum = 0;
		int[] numArr = null;
		int resultCount=0;
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		String line1 = bufferedReader.readLine();
		String line2 = bufferedReader.readLine();
		
		String[] tempArr = line1.split(" ");
		numCount = Integer.parseInt(tempArr[0]);
		diffNum = Integer.parseInt(tempArr[1]);
		
		tempArr = line2.split(" ");
		numArr = new int[numCount];
		for(int count=0;count<numCount;count++){
			numArr[count] = Integer.parseInt(tempArr[count]);
		}
		
		for(int outerCount=0;outerCount<numCount-1;outerCount++) {
			for(int innerCount=outerCount;innerCount<numCount;innerCount++){
				if(numArr[outerCount]<numArr[innerCount]){
					if(numArr[innerCount]-numArr[outerCount] == diffNum){
						resultCount++;
					}
				}else{
					if(numArr[outerCount]-numArr[innerCount] == diffNum){
						resultCount++;
					}
				}
			}
		}
		System.out.println("resultCount>>"+resultCount);

	}

}
