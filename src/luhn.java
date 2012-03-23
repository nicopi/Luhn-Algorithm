
public class luhn {
	/**
	Calculate the Luhn sum of the input number
	@param str number to check
	@return sum calcuted with Luhn algorithm
	**/
	public static int luhnTest(String str){
		int sum=0;
		boolean isEven=false;
		for (int i=str.length();i>0;i--){
			int k=Integer.parseInt(str.substring(i-1,i));
			if(isEven){
				k=k*2;
				if(k/10!=0)
					k=k/10+k%10;
			}
			
			isEven=!isEven;
			sum+=k;
		}
		return sum;
	}
	
	/**
	Return true if the input number is valid according to the Luhn formula
	@param str number to check
	**/
	public static boolean isLuhnValid(String str){
		if (luhnTest(str)%10==0)
			return true;
		return false;	
	}
	
	/**
	Return the check digit that makes the input number valid according to the Luhn formula
	@param str number to check
	@return calculated check digit
	**/
	public static int getCheckDigit(String str){
		int k=luhnTest(str+"0");
		int i=0;
		if(k%10!=0)
			i=10-k%10;
		return i;
	}
	
	/**
	Return the input number with check digit appended
	@param str number to make Luhn valid
	@return Luhn valid number
	**/
	public static String getLuhnNumber(String str){
		return str+getCheckDigit(str);
	}
}
