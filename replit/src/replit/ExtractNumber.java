package replit;

public class ExtractNumber {
	public static void main(String[] args) {
		
		String s = "aa!!%$#.10aa";
		String newString = "";
		
		for(int i = 0; i < s.length(); i++) {
			if(Character.isDigit(s.charAt(i))) {
				newString = newString + s.charAt(i);
			}
		}
		
		System.out.println(newString);
	}

}
