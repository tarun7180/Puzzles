import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;


public class Pangram {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		String intputStr = bufferedReader.readLine().toLowerCase();
		char[] inputValues = intputStr.replaceAll("[^a-z^A-Z]","").toCharArray();
		Set<Character> alphabetSet = new HashSet<Character>();
		int inputLength = inputValues.length;
		for(int i=0;i<inputLength;i++){
			//char tempCh = inputValues[i];
			alphabetSet.add(inputValues[i]);
		}
		if(alphabetSet.size()==26){
			System.out.println("pangram");
		}else{
			System.out.println("not pangram");
		}
	}

}
