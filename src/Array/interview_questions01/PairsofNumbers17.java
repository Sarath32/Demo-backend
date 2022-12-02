package Array.interview_questions01;

public class PairsofNumbers17 {

	public static void main(String[] args) {

		int a[]= {1,3,6,9,5,4,6,5,10};
		
		int k=15;
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]+a[j]==k)
				{
					System.out.println(a[i]+","+a[j]);
				}
			}
		}
		
		
		
	}

}
