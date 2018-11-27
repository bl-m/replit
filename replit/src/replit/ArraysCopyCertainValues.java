package replit;

import java.util.Arrays;

public class ArraysCopyCertainValues {
	
	public static void main(String[] args) {
		
		String arr [] = {"aa", "be", "lol", "lel", "oreo"};
		int count = 0;
		
		for(String x : arr) {
			if(x.contains("e")) {
				count ++;
			}
		}
		
		String fewValues [] = new String [count];
		int a = 0;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i].contains("e")) {
				fewValues[a] = arr[i];
				a++;
			}
		}
		
		System.out.println(Arrays.toString(fewValues));
	}

}
