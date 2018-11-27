package replit;

public class PrintFirstThreeCharacters {
	
	public static void main(String[] args) {
		
		String arr [] = {"banana","apple","peach","strawberry","mango"};
		
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i].substring(0, 3));
		}
	}

}
