import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class TriangleNumbers1 {

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
        
        for(int count=0;count<testNum;count++){
        	int rowSize=5;
        	int totalRows = testCases[count];
        	int result = -1;
        	if(totalRows==1 || totalRows==2){
        		System.out.println(result);
        	}else{
	        	List<Integer> list1 = new ArrayList<Integer>();
	        	List<Integer> list2 = new ArrayList<Integer>();
	        	list2.add(0, 1);
	        	list2.add(1, 1);
	        	list2.add(2, 1);
	        	for(int a=2;a<totalRows;a++){
	        		list1.clear();
	        		list1.add(0, 0);
	        		list1.addAll(list2);
	        		list1.add(list2.size()+1, 0);
	        		list2.clear();
	        		for(int b=0;b<rowSize;b++){
	        			if(b==0){
	        				list2.add(b, 1);
	        			}else if(b==rowSize-1){
	        				list2.add(b, 1);
	        			}else{
	        				int a1 = list1.get(b-1);
	        				int a2 = list1.get(b);
	        				int a3 = list1.get(b+1);
	        				int sum = a1+a2+a3;
	        				list2.add(sum);
	        			}
	        		}
	        		rowSize = rowSize+2;
	        	}
	        	for(int k=0;k<list2.size();k++){
	        		int val = list2.get(k);
	        		if(val%2==0){
	        			result = k+1;
	        			break;
	        		}
	        	}
	        	System.out.println(result);
	        }
        }

	}

}
