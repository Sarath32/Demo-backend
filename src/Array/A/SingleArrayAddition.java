package Array.A;

public class SingleArrayAddition {

	public static void main(String[] args) {
		
		int a[]= {50,46,35,48};
		int b[]= {45,78,36,94,45};
		
		int largelen=a.length>b.length?a.length:b.length;
		int smalllen=a.length<b.length?a.length:b.length;
		
		int c[]=new int[largelen];
		
		for(int i=0;i<a.length;i++)
		{
				c[i]=a[i]+b[i];
			
		}
		for(int i=smalllen;i<largelen;i++)
		{
			c[i]=b[i];
		}
		
		for(int i=0;i<largelen;i++)
		{
		System.out.print(c[i]+" ");
		}
		
		
	}

}
