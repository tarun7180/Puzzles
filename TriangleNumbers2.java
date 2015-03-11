import java.util.Scanner;


public class TriangleNumbers2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner stdin=new Scanner(System.in);
        int testNum=stdin.nextInt();
        int[] testCases = new int[testNum];
        for(int i=0;i<testNum;i++){
        	testCases[i] = stdin.nextInt();
        }
        
       for(int count = 0;count<testNum;count++){
    	   if(testCases[count]==0 || testCases[count]==1 || testCases[count]==2){
    		   System.out.println(-1);
    	   }else if(testCases[count]%2 == 1){
    		   System.out.println(2);
    	   }else if(testCases[count]%4 == 0){
    		   System.out.println(3);
    		}
    	   else{
    		   System.out.println(4);
    	   }
       }

	}

}
