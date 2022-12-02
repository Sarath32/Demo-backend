package Array.interview_questions;

public class ToFindDuplicateNumbers {

	public static void main(String[] args) {
		
		int numbers[]= {10,50,56,50,10,50,70,10,56};

		int count;
		
		for(int i=0;i<numbers.length;i++)
		{
			count=1;
			for(int j=i+1;j<numbers.length;j++)
			{
				if(numbers[i]==numbers[j])
				{
					count++;
					numbers[j]=0;
				}
			}
			if(count>1)
			{
				System.out.println(numbers[i]);
			}
		}
		
		
		
		
		
		
 }

}
