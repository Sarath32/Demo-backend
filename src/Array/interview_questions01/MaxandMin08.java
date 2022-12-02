package Array.interview_questions01;

public class MaxandMin08 {

	public static void main(String[] args) {

		int a[]= {80,56,91,36,52,46};
		
		int max=a[0];
		int min=a[0];
		
		for(int i=0;i<a.length;i++)
		{
				if(a[i]>max)
				{
					max=a[i];
				}
				if(a[i]<min)
				{
					min=a[i];
				}
			}
			
		
		System.out.println("The max num in the array is "+max);
		System.out.println("The min num in the array is "+min);
		
	}

}
