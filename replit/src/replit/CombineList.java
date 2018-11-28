package replit;

import java.util.ArrayList;

public class CombineList {
	
	public static void main(String[] args) {
		
		ArrayList <String> list1 = new ArrayList<>();
		list1.add("f");
		list1.add("o");
		list1.add("o");
		
		ArrayList <String> list2 = new ArrayList<>();
		list2.add("b");
		list2.add("a");
		list2.add("r");
		
		String s = "";
		for(int i = 0; i < list1.size(); i++) {
			s = s + list1.get(i);
		}
		for(int i = 0; i < list2.size(); i++) {
			s = s + list2.get(i);
		}
		
		System.out.println(s);

	}

}
