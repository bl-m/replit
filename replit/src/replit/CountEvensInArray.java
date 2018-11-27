package replit;

public class CountEvensInArray {
	
	public static void main(String[] args) {
		
		int arr [] = {2, 1, 2, 3, 4};
		int count = 0;
		for(int x : arr) {
			if(x % 2 == 0) {
				count ++;
			}
		}
		
		System.out.println(count);
	}

}
