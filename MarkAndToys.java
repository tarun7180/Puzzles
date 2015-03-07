import java.util.Scanner;


public class MarkAndToys {

	/**
	 * @param args
	 */
	private int prices[];
    private int n;
	public static void main(String[] args) {
		Scanner stdin=new Scanner(System.in);
        int n=stdin.nextInt();
        int k=stdin.nextInt();
        int prices[]=new int[n];
        int count=0,sum=0;
        for(int i=0;i<n;i++){
        	prices[i]=stdin.nextInt();
        }
        
        MarkAndToys markAndToys = new MarkAndToys();
        markAndToys.sort(prices);
        for(int i=0;i<n;i++){
    		sum = sum + prices[i];
    		if(sum>k){
    			count=i;
    			break;
        	}
        }
        System.out.println(count);

	}
	
	public void sort(int[] inputArr) {
        
        if (inputArr == null || inputArr.length == 0) {
            return;
        }
        this.prices = inputArr;
        n = inputArr.length;
        quickSort(0, n - 1);
    }
 
    private void quickSort(int lowerIndex, int higherIndex) {
         
        int i = lowerIndex;
        int j = higherIndex;
        // calculate pivot number, I am taking pivot as middle index number
        int pivot = prices[lowerIndex+(higherIndex-lowerIndex)/2];
        // Divide into two arrays
        while (i <= j) {
            /**
             * In each iteration, we will identify a number from left side which
             * is greater then the pivot value, and also we will identify a number
             * from right side which is less then the pivot value. Once the search
             * is done, then we exchange both numbers.
             */
            while (prices[i] < pivot) {
                i++;
            }
            while (prices[j] > pivot) {
                j--;
            }
            if (i <= j) {
                exchangeNumbers(i, j);
                //move index to next position on both sides
                i++;
                j--;
            }
        }
        // call quickSort() method recursively
        if (lowerIndex < j)
            quickSort(lowerIndex, j);
        if (i < higherIndex)
            quickSort(i, higherIndex);
    }
 
    private void exchangeNumbers(int i, int j) {
        int temp = prices[i];
        prices[i] = prices[j];
        prices[j] = temp;
    }
     

}
