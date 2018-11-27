package replit;

public class CountAppearances {
	
	public static void main(String[] args) {
		
		String arr [] = {"a","foo","bar","foo","bla","foo"};
		String s = "foo";
		int count = 0;
		
		for(String x : arr) {
			if(x.equals(s)) {
				count ++;
			}
		}
	System.out.println(count);	
	}
}
