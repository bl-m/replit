package replit;

public class FindUniqueNumberInArray {
	
	public static void main(String[] args) {
		
		int arr [] = {1, 1, 2, 2,3, 4, 7, 3, 4};
		int currentNum;
		
		for(int i = 0; i < arr.length; i++) {
			currentNum = arr[i];
			boolean found = true;
		
			for(int j = 0; j < arr.length; j++) {
				if(currentNum == arr[j] && i != j) {
					found = false;
					break;
				}
			}
			
			if(found == true) {
				System.out.println(currentNum);
			}
		}
	}
}
