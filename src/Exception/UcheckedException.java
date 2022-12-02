package Exception;

public class UcheckedException {

	public static void main(String[] args) {
		
		try {
		
		String s[]= new String[2];
		
		s[0]="Welcome";
		s[1]="To Trio Tend";
		s[2]="Once again";
		}
		catch(Exception e)
		{
			System.out.println("Check the size of the Array");
		}

	}

}
