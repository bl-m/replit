package replit;

public class test {
	
	public static void main(String[] args) {
		
		String order [] = {"apple","banana","peach","apple","strawberry"}; 
		
		int count = 0;
		for(int i = 0; i < order.length; i++) {
			String currentNum = order[i]; // 1
			boolean unique = true;
			
			for(int j = 0; j < order.length; j++) { 
				if(order[j] == currentNum && i != j) {
					unique = false;
					break;
				}
			}
			
			if(unique) {
				count ++;
			}
		}
		
		System.out.println(count);
		
	}

}
