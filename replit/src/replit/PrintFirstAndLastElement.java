package replit;

import java.util.Arrays;

public class PrintFirstAndLastElement {
	
	public static void main(String[] args) {
		
		String arr [] = {"hello", "why", "by", "apple" , "note"};
		String newArr [] = new String[arr.length];
		int a = 0;
		for(String x : arr) {
			System.out.println(x.substring(0,1)+x.substring(x.length() -1));
			newArr[a] = x.substring(0,1)+x.substring(x.length() -1);
			a++;
		}
		
		System.out.println(Arrays.toString(newArr));
	}

}
