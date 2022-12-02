package Array.interview_questions;

public class TofindPairsofNumbers {

	public static void main(String[] args) {
		
		
		int a[]= {1,2,3,4,-2,5,8};
		
		int sum =6;
		
		int count=0;
		for(int i=0; i<a.length; i++)
		{
			for (int j=i+1; j<a.length; j++)
			{
				if(a[i]+a[j]==sum)
				{
					count++;
				}
			}
		}
		System.out.println(count);
		
		
		
		

	}

}
