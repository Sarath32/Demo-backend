package Array.interview_questions01;

public class DuplicateNumbers07 {

	public static void main(String[] args) {

		int a[]= {80,90,80,90,50,23,19,23,80};
		
		int count;
		for(int i=0; i<a.length;i++)
		{
			count=1;
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					count++;
					a[j]=0;
				}
			}
			if(count>1 && a[i]!=0)
			{
				System.out.print(a[i]+" ");
			}
		}
		
		
	}

}
