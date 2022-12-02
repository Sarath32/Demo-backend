package processchecking;

public class mergeofarrays {

	public static void main(String[] args) {

		int a[]= {80,50,69,34,25,63};
		int m[]= {71,39,16,41};

		int n=a.length>m.length?a.length:m.length;
		int s=a.length<m.length?a.length:m.length;
		
	
		int c[]=new int[n];
		
		for(int i=0;i<s;i++)
		{
			c[i]=a[i]+m[i];
		}
		for(int i=s;i<n;i++)
		{
			c[i]=a[i];
		}
		for(int i=0;i<c.length;i++)
		{
			System.out.print(c[i]+" ");
		}
	}
}
