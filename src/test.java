/** Luhn algorithm test */

public class test {

	public static void main(String[] args) {
		System.out.println("#Luhm algorithm test#");
		
		if(luhn.isLuhnValid("12345674"))
			System.out.println("Valid code");
		else
			System.out.println("Invalid code");
	}

	
}
