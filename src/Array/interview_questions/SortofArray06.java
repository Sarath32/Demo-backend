package Array.interview_questions;

public class SortofArray06 {

	public static void main(String[] args) {
	
		
		int s[]={20,50,45,25};
	
	          	for(int i=0; i<s.length;i++)
	          	{
	          		for(int j=i+1; j<s.length;j++)
	          		{
	          			if( s[i]>s[j])
	          			{
	          				int temp =s[i];
	          				s[i]=s[j];
	          				s[j]=temp;
	          			}
	          		}System.out.println(s[i]);
	          	}
				
		}
		

	}


