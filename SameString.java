
public class SameString {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception{
		String a="aab";
		String b="baa";
		
		int stepCount=0;
		
		int firstCount=0;
		int lastCount=a.length()-1;
		char nextChar;
		
		char firstChar = a.charAt(firstCount);
		char lastChar = a.charAt(lastCount);
		a.replace(firstChar, lastChar);
		a.replace(lastChar, firstChar);
		System.out.println(a);
		if(a.equals(b)){
			System.out.println(stepCount++);
		}else{
			firstChar = a.charAt(firstCount+1);
			nextChar = a.charAt(firstCount+2);
			a.replace(firstChar, nextChar);
			a.replace(nextChar, firstChar);
			stepCount++;
			firstCount++;
			if(a.equals(b)){
				System.out.println(stepCount);
			}
		}

	}

}
