package replit;

public class ReverseSentence {
	
	public static void main(String[] args) {
		
		String sentence = "Java is fun programming language";
		String newSentence = "";
		String arr [] = sentence.split(" ");
		
		for(int i = arr.length -1; i >= 0; i--) {
			newSentence = newSentence + arr[i] + " ";
		}
		newSentence = newSentence.trim();
		System.out.println(newSentence);
	}

}
