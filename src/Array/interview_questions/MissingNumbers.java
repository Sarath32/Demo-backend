package Array.interview_questions;

public class MissingNumbers {

	public static void main(String[] args) {
		
		int c[]= {1,2,4,5};
		
		int n=c.length+1;
		
		int sum=(n*(n+1))/2;
		
		for(int i=0; i<c.length; i++)
		{
			sum=sum-c[i];
		}
		
		System.out.println(sum);
		
	}

}
