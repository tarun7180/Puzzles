package CareerCup;

import java.util.Scanner;

//Given a string',' print out all of the unique characters and the number of times it appeared in the string

public class CharInString {
	
	public static void main(String[] args) {
		int[] countArr = new int[26];
		char[] alphabetArr = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
		Scanner in = new Scanner(System.in);
		String testStr = in.next();
		System.out.println(testStr);
		for(int i=0;i<testStr.length();i++){
			int val = testStr.charAt(i)-'a';
			countArr[val]++;
		}
		System.out.println("------------------");
		for(int j=0;j<countArr.length;j++){
			if(countArr[j]>0){
				System.out.println(alphabetArr[j] + "-->" + countArr[j]);
			}
		}
	}
}
