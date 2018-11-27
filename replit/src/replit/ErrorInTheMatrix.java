package replit;

import java.util.Arrays;

public class ErrorInTheMatrix {
	
	public static void main(String[] args) {
		
		String arr [] [] = {{"2","g","6","6"},{"2","g","6","6"},{"2","g","6","6"}};
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				if(j % 2 == 0) {
					arr[i][j] = "1";
				}
				else {
					arr[i][j] = "0";
				}
			}
		}
		System.out.println(Arrays.deepToString(arr));
	}

}
