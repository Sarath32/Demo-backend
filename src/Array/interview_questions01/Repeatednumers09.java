package Array.interview_questions01;

public class Repeatednumers09 {

	public static void main(String[] args) {

		int a[]= {80,56,23,14,89,65,56,21,14,56,80,14,23,14};
		
		int count;
		for(int i=0;i<a.length;i++)
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
				System.out.println(a[i]);
			}
			
		}
		
		
		
		
		
	}

}
