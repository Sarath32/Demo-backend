package processchecking;

public class Countwordsinstring {

	public static void main(String[] args) {
		
		String address = "Chennai ";
		
		// To Print Whole count in String
		int amt=0;
		for(int i=0; i<address.length(); i++)
		{
			amt++;
		}
		System.out.println(amt);
		
		
		//  To Print Only number characters
		
		
		int count=0;
		for(int i=0; i<address.length();i++)
		{
			if(address.charAt(i)>='0')
			{
				if(address.charAt(i)<='9')
				{
				  count++;	
				}
			}
			
			
			
			//To print only letter characters
			
			if(address.charAt(i)>='a')
			{
			  if(address.charAt(i)<='z')
			  {
				count++;	
			  }
			}
			if(address.charAt(i)>='A')
			{
			  if(address.charAt(i)<='Z')
			  {
					count++;
			  }
			}
			
			}
				
		
		System.out.println(count);
		
		
		
		

	}

}
