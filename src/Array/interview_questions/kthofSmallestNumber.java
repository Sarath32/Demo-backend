package Array.interview_questions;

public class kthofSmallestNumber {

	public static void main(String[] args) {
		
		int a[]= {50,45,78,23,48,56,24,71};
		
		int k=5;
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1; j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					int temp =a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
			if(i==k-1)
			{
				System.out.println(k+"th smallest number in the array is "+a[i]);
			}
		}
	
		
		

	}

}
