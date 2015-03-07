import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;


public class SubwaySquare {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws NumberFormatException 
	 */
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		int testNum = Integer.parseInt(bufferedReader.readLine());
        String[] dim = new String[testNum];
        for(int i=0;i<testNum;i++){
        	dim[i] = bufferedReader.readLine();
        }
        for(int count=0;count<testNum;count++){
        	String intputStr = dim[count];
			String[] inputValues = intputStr.split(" ");
        	int num1 = Integer.parseInt(inputValues[0]);
        	int num2 = Integer.parseInt(inputValues[1]);
        	int gcdVal = calculateGCD(num1,num2);
        	int result = (num1 * num2)/(gcdVal * gcdVal);
        	System.out.println(result);
        }
	}

	private static int calculateGCD(int m, int n) {
		while(m!=n){ 
			if(m>n){ 
			m = m-n; 
			}else{ 
			n = n-m; 
			} 
			} 
		return m;
	}

}
