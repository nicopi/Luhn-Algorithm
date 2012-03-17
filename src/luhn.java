
public class luhn {
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
	
	public static boolean isLuhnValid(String str){
		if (luhnTest(str)%10==0)
			return true;
		return false;	
	}
}
