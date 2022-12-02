package Array.interview_questions;

public class ArrayMultiplication {

	public static void main(String[] args) {
		int a[]= {5,2,3,6,8,7};
		int b[]= {3,4,7,6,4};
		
		int len=a.length>b.length?a.length:b.length;
		int small=a.length<b.length?a.length:b.length;
		
		int c[]=new int[len];
		
		for(int i=0; i<small;i++)
		{
		  c[i]=a[i]*b[i];
		}
		
		for(int i=small; i<a.length; i++)
		{
			c[i]=a[i];
		}
		
		for(int i=0; i<c.length; i++)
		{
			System.out.print(c[i]+" ");
		}
		
	}

}
