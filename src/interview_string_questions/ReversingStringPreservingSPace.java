package interview_string_questions;

public class ReversingStringPreservingSPace {

	public static void main(String[] args) {

		String g= "Welcome to trio tend";
		
		String a[]=g.split(" ");
		
		String s="";
		String rev="";
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==" "||i==a.length-1)
			{
				if(i==a.length-1)
				{
					s=s+a[i];
				}
				for(int j=s.length()-1;j>=0;j--)
				{
					rev=rev+s.charAt(j);
				}
				System.out.println(rev);
				s="";
				rev="";
			}
			else
			{
				s=s+a[i];
			}
		}
		
}
}