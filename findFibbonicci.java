import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.math.RoundingMode;


public class findFibbonicci {
	
    private static BigDecimal one = BigDecimal.valueOf(1);
    private static BigDecimal two = BigDecimal.valueOf(2);
    private static BigDecimal four = BigDecimal.valueOf(4);
    private static BigDecimal five = BigDecimal.valueOf(5);

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		int inputNum = Integer.parseInt(bufferedReader.readLine());
		double [] inputArr = new double[inputNum]; 
		for(int count=0;count<inputNum;count++){
			inputArr[count] = Double.parseDouble(bufferedReader.readLine());
		}

		for(int count=0;count<inputNum;count++){
			boolean fiboFlag = isFibo(inputArr[count]);
			if(fiboFlag){
				System.out.println("IsFibo");
			}else{
				System.out.println("IsNotFibo");
			}
		}
	}

	private static boolean isFibo(double inputArr) {
		BigDecimal inputVal = BigDecimal .valueOf(inputArr);
		BigDecimal base = inputVal.multiply(inputVal).multiply(five);
        BigDecimal possibility1 = base.add(four);
        BigDecimal possibility2 = base.subtract(four);
        return (isPerfectSquare(possibility1) || isPerfectSquare(possibility2));
	}

	private static boolean isPerfectSquare(BigDecimal possibility1) {
		BigDecimal squareRoot = one;
        BigDecimal square = one;
        BigDecimal i = one;
        BigDecimal newSquareRoot;
        int comparison = -1;

        while (comparison != 0) {
            if (comparison < 0) {
                i = i.multiply(two);
                newSquareRoot = squareRoot.add(i).setScale(0, RoundingMode.HALF_UP);
            } else {
                i = i.divide(two);
                newSquareRoot = squareRoot.subtract(i).setScale(0, RoundingMode.HALF_UP);
            }

            if (newSquareRoot.compareTo(squareRoot) == 0) {
                return false;
            }

            squareRoot = newSquareRoot;
            square = squareRoot.multiply(squareRoot);
            comparison = square.compareTo(possibility1);
        }

        return true;

	}
}
