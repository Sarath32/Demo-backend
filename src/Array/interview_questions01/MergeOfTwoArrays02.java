package Array.interview_questions01;

public class MergeOfTwoArrays02 {

	public static void main(String[] args) {
	
		String a[]= {"Welcome to java"};
		String b[]= {"once again"};
		
		String c[]=new String[a.length+b.length];
		
		int d=0;
		for(int i=0;i<a.length;i++)
		{
			  c[d]=a[i];
			  d++;
		}
		for(int i=0;i<b.length;i++)
		{
			c[d]=b[i];
			d++;
		}
		for(int i=0;i<c.length;i++)
		{
			System.out.print(c[i]+" ");
		}
		
		
	}

}
