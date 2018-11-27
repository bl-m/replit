package replit;

public class RemoveElementInArray {
	
	public static void main(String[] args) {
		
		String arr = "java is fun programming language";
		String newString = "";
		String splitted [] = arr.split(" ");
		
		for(String x : splitted) {
			if(!x.equalsIgnoreCase("programming")) {
				newString = newString + x + " ";
			}
		}
		
		System.out.println(newString);
	}

}
