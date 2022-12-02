package Array;

public class Singlrdimension1 {
	
	public static void main(String[] args) {
		
		String s[]= new String[5];
		       s[0]="Dinesh";
		       s[1]="90";
		       s[2]="Pass";
		       s[3]="Distinction";
		       s[4]="2nd";
		
		for(int i=0;i<s.length;i++)
		{
          System.out.println(s[i]);       
		}
		
		String a[]=s.clone();
		
		for(int i=0; i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		
		
		
		
		
	}

}
