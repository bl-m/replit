package replit;

public class IsSorted {
	
	public static void main(String[] args) {
		
		int arr [] = {7,8,9};
		boolean s = true;
		
		
		for(int i = 0; i< arr.length -1; i++) {
			if(arr[i] > arr[i+1] && arr[arr.length -1] < arr[arr.length -2]) {
				s = false;
				break;
			}
		}
		
		System.out.println(s);
	}

}
