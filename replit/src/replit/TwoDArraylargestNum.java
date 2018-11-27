package replit;

public class TwoDArraylargestNum {
	public static void main(String[] args) {
		
		int [] [] arr = {{4,3,6,123,7},{5,3,56},{3,6,32,2}};
		
		Integer largest = Integer.MIN_VALUE;
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				if(arr[i][j] > largest) {
					largest = arr[i][j];
				}
			}
		}
		System.out.println(largest);
	}
}
