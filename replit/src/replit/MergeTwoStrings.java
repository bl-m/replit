package replit;

public class MergeTwoStrings {
	public static void main(String[] args) {
		
		String a = "java";
		String b = "selenium";
		String s = "";
		
		int len = (a.length() > b.length()) ? a.length():b.length();
		
		for(int i = 0; i < len; i++) {
				if(i < a.length()) {
					s = s + a.charAt(i);
				}
				
				if(i < b.length()) {
					s = s + b.charAt(i);
				}
		}
		
		System.out.println(s);
	}
}
