package Array.interview_questions02;

public class SortingArray_06 {

	public static void main(String[] args) {
		
		String a[]= {"java","c++","react","javascript","c","html","css"};
		
		int n=a.length;
		
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n-i-1;j++)
			{
				if(a[j].compareTo(a[j+1])>0)
				{
					String swap=a[j];
					a[j]=a[j+1];
					a[j+1]=swap;
				}
			}
		}
		for(int i=0;i<n;i++)
		{
			System.out.print(a[i]+" ");
		}
	}
}
