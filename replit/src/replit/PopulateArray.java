package replit;

import java.util.Arrays;

public class PopulateArray {
	
	public static void main(String[] args) {
		
		int num = 10;
		
		int arr [] = new int[num];
		
		for(int i = 1; i < arr.length; i++) {
			arr[i] = i;
		}
		
		System.out.println(Arrays.toString(arr));
	}

}
