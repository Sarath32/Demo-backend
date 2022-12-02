package interview_string_questions;

public class SortString {

	public static void main(String[] args) {
		
		String s="india america china";
		
		String a[]=s.split(" ");
		
		for(int i=0; i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i].compareTo(a[j])>0)
				{
					String temp = a[i];
					a[i]=a[j];
					a[j]=temp;
							
				}
			}System.out.println(a[i]);
		}
		
			
	

	
	
	}
}
