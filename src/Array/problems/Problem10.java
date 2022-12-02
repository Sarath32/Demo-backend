
package Array.problems;

public class Problem10 {

	public static void main(String[] args) {
		int a[][]=new int[2][2];
		int b[][]=new int[2][2];
		int c[][]=new int[2][2];
			
		a[0][0]=1;
		a[0][1]=3;
		a[1][0]=4;
		a[1][1]=1;
		b[0][0]=1;
		b[0][1]=2;
		b[1][0]=3;
		b[1][1]=4;
	//matrix multiplication	
		for(int i=0;i<a.length;i++)
		{
			for (int j=0;j<b[i].length;j++)
			{
				for (int k=0;k<a[i].length;k++)
				{
				c[i][j]=c[i][j]+a[i][k]*b[k][j];
				
			//	System.out.print(c[i][j]+" ");
				}
			}//System.out.println();
		}
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<b[i].length;j++)
			{
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}

	}}
