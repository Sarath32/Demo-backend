package Array.interview_questions;

public class kthofLargestnum {

	public static void main(String[] args) {
		
		int a[]= {25,82,36,45,90,100};
		int k=3;
			for(int i=0; i<a.length;i++)
			{
				for(int j=i+1; j<a.length;j++)
				{
					if(a[i]<a[j])
					{	
					int temp = a[i];
					a[i]=a[j];
					a[j]=temp;
					}
				}
				
			if(i==k-1)
			{
				System.out.println(k+"th of largest number is"+a[i]);
			}
			}
		
	}

}
