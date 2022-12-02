package Array.interview_questions;

public class IntersectionofTwoArray {

	public static void main(String[] args) {
		
		int a[]= {50,20,30,45,85,74};
		int b[]= {20,55,85,74,23,12};
		
		
		for(int i=0; i<a.length;i++)
		{
			for(int j=0; j<b.length;j++)
			{
				if(a[i]==b[j])
				{
					System.out.println(a[i]);
				}
			}
		}
		
		
		
	}

}
