
public class MaxDiff {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] a = {2,3,10,2,4,8,1};
		int size = a.length;
		int maxDiff = -1;
		for(int outerCount=0;outerCount<size-2;outerCount++){
			for(int innerCount=outerCount+1;innerCount<=size-1;innerCount++){
				if(a[outerCount]>a[innerCount]){
					continue;
				}else{
					int tempDiff = a[innerCount]-a[outerCount];
					if(tempDiff>maxDiff){
						maxDiff = tempDiff;
					}
				}
			}
		}
		System.out.println(maxDiff);

	}

}
