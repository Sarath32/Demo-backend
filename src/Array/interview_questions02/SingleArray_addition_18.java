package Array.interview_questions02;

public class SingleArray_addition_18 {

	public static void main(String[] args) {
		
		int a[]= {80,23,97,36};
		
		int s[]= {38,12,47,16,56,81};
		
		int n=a.length>s.length?a.length:s.length;
		int small=a.length<s.length?a.length:s.length;
		
		int c[]=new int[n];
		
		for(int i=0;i<small;i++)
		{
			c[i]=a[i]+s[i];
		}
		for(int i=small;i<n;i++)
		{
			c[i]=s[i];
		}
		for(int i=0;i<n;i++)
		{
			System.out.print(c[i]+" ");
		}
		
	}
}
