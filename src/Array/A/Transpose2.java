package Array.A;

public class Transpose2 {
	public static void main(String[] args) {
		
		int a[][]=new int[3][3];
		
		int val=5;
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				a[i][j]=val;
				val+=5;
			}
		}
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		
		int c[][]=new int[a.length][a[0].length];
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				c[i][j]=a[j][i];
			}
		}
		
		
		for(int i=0;i<c.length;i++)
		{
			for(int j=0;j<c[i].length;j++)
			{
		System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}
		
		
	}

}
