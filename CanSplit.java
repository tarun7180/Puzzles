public class CanSplit {
    public static boolean canSplit(int[] nums) {
    	int n = nums.length;
    	int sum=0;
    	for(int i=0;i<n;i++){
    		sum = sum + nums[i];
    	}
    	return isSubset(nums,sum,n-1);
    }
    private static boolean isSubset(int[] a, int sum, int n) {
    	if(sum == 0)
    	    return true;
    	  if(n<0)
    	    return false;
    	 return isSubset(a, sum-a[n], n-1) || isSubset(a, sum, n-1);
	}
	public static void main(String []args){
        System.out.println( canSplit(new int[]{1, 1}));
        System.out.println( canSplit(new int[]{1, 1, 1}));
        System.out.println( canSplit(new int[]{2, 4, 2}));

    }

}