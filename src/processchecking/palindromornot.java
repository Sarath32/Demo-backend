package processchecking;



public class palindromornot {

	public static void main(String[] args) {
	
		String a="aabaa";
		
		String rev="";
		
		for(int i=a.length()-1; i>=0; i--)
		{
			rev=rev+a.charAt(i);
		}
		
		System.out.println(rev);
		
		if(a.equals(rev))
		{
		   System.out.println("They are palindrom");
		}
		else
		{
			System.out.println("They are not palindrom");
		}
	}

}
