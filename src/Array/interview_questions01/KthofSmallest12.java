package Array.interview_questions01;

public class KthofSmallest12 {

	public static void main(String[] args) {

		int a[]= {80,45,63,95,46,28};
		int k=2;
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					int t=a[i];
					a[i]=a[j];
					a[j]=t;
				}
			}
			if(i==k-1)
			{
				System.out.println(k+"th smallest number in the array is "+a[i]);
			}
		}
		
	}

}
