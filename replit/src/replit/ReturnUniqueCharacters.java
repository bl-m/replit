package replit;

public class ReturnUniqueCharacters {
	
	public static void main(String[] args) {
		
		
		String s = "programming";
		String newS = "";
		
		for(int i = 0; i < s.length(); i++) {
			int currentNum = s.charAt(i);
			for(int j = 0; j < s.length(); j++) {
				if(!newS.contains(s.substring(i, i+1))) {
					newS = newS + s.charAt(i);
				}
			}
		}
		
		System.out.println(newS);
	}

}
