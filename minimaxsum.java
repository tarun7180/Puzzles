import java.util.Scanner;


public class minimaxsum {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		long [] arr = new long[5];
        arr[0] = in.nextLong();
        arr[1] = in.nextLong();
        arr[2] = in.nextLong();
        arr[3] = in.nextLong();
        arr[4] = in.nextLong();
        long min = -1,max = 0,sum=0;
        for(int i=0;i<5;i++){
        	for(int j=0;j<5;j++){
        		if(i!=j){
        			sum += arr[j];
        		}
        	}
        	if(min<0 || min>sum){
        		min = sum;
        	}
        	if(max<sum){
        		max= sum;
        	}
        	sum=0;
        }
        
        System.out.println(min+" "+max);

	}

}
