package replit;

import java.util.Arrays;

public class addElements {
	
	public static void main(String[] args) {
		
		int arr1 [] = {3,3,4,6,4,5};
		int arr2 [] = {3,5,3,2,3,4};
		int arr3 [] = new int [arr1.length];
		
		for(int i = 0; i < arr3.length; i++) {
			arr3[i] = arr1[i] + arr2[i];
		}
		System.out.println(Arrays.toString(arr3));
	}

}
