package replit;

import java.util.Arrays;

public class AddToArray {
	
	public static void main(String[] args) {
		
		int arr [] = {1,5,77,8};
		
		int newArr [] = new int [arr.length +1];
		
		for(int i = 0; i < arr.length; i++) {
			newArr[i] = arr[i];
		}
		newArr[newArr.length -1] = 2;
		
		System.out.println(Arrays.toString(newArr));
	}

}
