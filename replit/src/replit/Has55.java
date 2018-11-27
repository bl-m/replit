package replit;

public class Has55 {
	
	public static void main(String[] args) {
		
		int nums [] = {1, 5, 1, 1, 5};
		boolean found = false;
		
		for(int i = 0; i < nums.length -1; i++) {
			if(nums[i] == 5 && nums[i+1] == 5) {
				found = true;
			}
		}
		System.out.println(found);
	}

}
