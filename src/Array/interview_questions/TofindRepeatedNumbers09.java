package Array.interview_questions;

public class TofindRepeatedNumbers09 {

	public static void main(String[] args) {
		
		int num[]= {10,20,15,58,85,15,10,15,20,30,45};
		int count;
		for(int i=0; i<num.length;i++)
		{
			count=1;
			for(int j=i+1; j<num.length;j++)
			{
				if( num[i]==num[j])
				{
					count++;
					num[j]=0;
				}
		}
			if(count>1 && num[i]!=0)
			{
			
				System.out.println(num[i]);
			}
			
		
			
		}
		
		
		
		
	}
	
	
}
