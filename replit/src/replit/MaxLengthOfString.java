package replit;

public class MaxLengthOfString {
	
	public static void main(String[] args) {
		
		String arr [] = {"aaa", "bbbbb", "jaaaaavvaaaaaaaaaa", "whasstupppp", "longg"};
		
		String maxLen = "";
		
		for(String x : arr) {
			if(x.length() > maxLen.length()) {
				maxLen = x;
			}
		}
		
		System.out.println(maxLen);
	}

}
