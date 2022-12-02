package interview_string_questions;

public class ToprintDuplicatesintheString1 {

	public static void main(String[] args) {

		String name ="welcome and welcome and home";
		name=name.toLowerCase();
		String a[]=name.split(" ");
		int count;
	for(int i=0; i<a.length; i++)
	{
		count=1;
		for(int j=i+1; j<a.length; j++)
		{
			if(a[i].equals(a[j]))
			{
				count++;
				a[j]="0";
				
			}
		}
		if(count>1 && a[i]!="0")
		{
			System.out.println(a[i]);
		}
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	}

}
