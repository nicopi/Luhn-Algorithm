/** Luhn algorithm test */

public class test {

	public static void main(String[] args) {
		//Example
		String code="573829491";
		System.out.println("Input number: "+code);
		if(luhn.isLuhnValid(code))
			System.out.println("The number is valid according to the Luhn formula. Luhn sum:"+luhn.luhnTest(code));
		else
			System.out.println("The number is not valid according to the Luhn formula. Luhn sum:"+luhn.luhnTest(code));
	    System.out.println("The check digit to append is: "+luhn.getCheckDigit(code));
	    String validcode=luhn.getLuhnNumber(code);
	    System.out.println("The Luhn valid number is: "+validcode);
	    System.out.println("The calculated Luhn number is valid: "+luhn.isLuhnValid(validcode));	}
}
