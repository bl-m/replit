package replit;

public class CoverMe {
	public static void main(String[] args) {
		
		String s = "selenium";
		String target = "x";
		
			if(s.contains(target)) {
				s = s.replace(target, "["+target+"]");
			}
			else s = "["+s+"]";

		System.out.println(s);
	
	}
	
}
