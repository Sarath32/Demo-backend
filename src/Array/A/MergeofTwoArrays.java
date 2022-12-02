package Array.A;

public class MergeofTwoArrays {

	public static void main(String[] args) {

		int a[]= {50,40,23,54};
		int b[]= {41,78,323};
		int c[]=new int[a.length+b.length];
		
		int ci=0;
		
		for(int i=0;i<a.length;i++)
		{
			c[ci]=a[i];
			ci++;
		}
		
		for(int i=0;i<b.length;i++)
		{
			c[ci]=b[i];
			ci++;
		}
		
		for(int i=0;i<c.length;i++)
		{
			System.out.print(c[i]+" ");
		}
	}

}
