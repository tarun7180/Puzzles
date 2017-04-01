import java.util.Scanner;


public class GradingStudents {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int numTest = in.nextInt();
		int[] resultArr = new int[numTest];
		for(int i=0;i<numTest;i++) {
			int gradeNum = in.nextInt();
			if(gradeNum<38) {
				resultArr[i] = gradeNum;
			} else {
				int temp = gradeNum%5;
				if(temp>2) {
					resultArr[i] = gradeNum-temp+5;
				} else {
					resultArr[i] = gradeNum;
				}
			}
		}
		for(int i=0;i<numTest;i++) {
			System.out.println(resultArr[i]);
		}
	}

}
