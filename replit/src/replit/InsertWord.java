package replit;

public class InsertWord {
	
	public static void main(String[] args) {
		
		String s = "longword";
		String target = "foo";
		int index = 4;
		
		s = s.substring(0,index).concat(target).concat(s.substring(index));
		System.out.println(s);
	}

}
