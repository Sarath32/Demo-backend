package Array.A;

public class Addition {

	public static void main(String[] args) {
		
		int s[]= {50,68,47,36,458};
		int d[]= {45,23,85,566,484,216};
		
		int n=s.length>d.length?s.length:d.length;
		
		int small =s.length<d.length?s.length:d.length;
		int p[]=new int[n];
		
		for(int i=0; i<small;i++)
		{
			p[i]=s[i]+d[i];
		}
		
		for(int i=small;i<n;i++)
		{
			p[i]=d[i];
		}
		for(int i=0;i<p.length;i++)
		{
			System.out.println(p[i]);
		}

	}

}
