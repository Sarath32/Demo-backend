package Array.interview_questions;

public class ToRemoveDuplicates10 {

	public static void main(String[] args) {
		
		int a[]= {50,45,23,85,45,50,23,48};
		int n=8;
		for(int i=0; i<a.length; i++)
		{
			for(int j=i+1; j<a.length; j++)
			{
				if(a[i]==a[j])
				{
					for(int k=j; k<a.length;k++)
					{
						a[k]=a[k+1];
					}
					n--;
					j--;
					
				}
			
				
			}
			
		}
		
		for(int i=0; i<a.length; i++)
		{
		System.out.println("%d "+a[i]);
		}
		
		

	}

}
