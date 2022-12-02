package Array.interview_questions;

public class ArrayAddition18 {

	public static void main(String[] args) {
		
		int a[]= {50,20,90,152,15,85};
		int b[]= {40,40,40,50,58};
		int n = a.length>b.length?a.length:b.length;
		int small=a.length<b.length?a.length:b.length;
		int c[]=new int[n];
		
		for(int i=0; i<small;i++)
		{
			c[i]=a[i]+b[i];
			
		}
		for(int i=small;i<a.length;i++)
		{
			c[i]=a[i];
		}
		
		for(int i=0; i<c.length; i++)
		{
			System.out.print(" "+c[i]);
		}
		
	}

}
