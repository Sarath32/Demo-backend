package processchecking;

public class OnlyDigitsorNot {

	public static void main(String[] args) {
	
		String address ="600028";
		
		for(int i=0; i<address.length(); i++)
		{
			if (address.charAt(i)<='9' && address.charAt(i)>='0');
				
			
			else
			{
				System.out.println("The String Contain not only Digits ");
				
			}
		}
		
		
			System.out.println("The String Contain only Digits ");
			
		
		
	}

}
