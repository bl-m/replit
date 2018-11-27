package replit;

public class SplitEmail {
	
	public static void main(String[] args) {
		
//		email -> info@cybertekschool.com
//		Print:  
//		Email id: info
//		Email domain: cybertekschool.com
		
		String email = "info@cybertekschool.com";
		String [] splitted = email.split("@");
		System.out.println("Email id: " + splitted[0]);
		System.out.println("Domain: " + "@"+splitted[1]);

	}

}
